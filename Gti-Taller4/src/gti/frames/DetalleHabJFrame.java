package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;

import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DetalleHabJFrame extends JFrame {
	private TodoCategoria todo = null;
	static Habilidad habilidad = null;
	static DetalleHabJFrame myFrame;
	JPanel mainPanel;
	private static int idSubCate, idCategoria, idHabil;

	public DetalleHabJFrame() {
		super("HabilidadesJFrame");
	}

	public DetalleHabJFrame(int idCategoria, int idSubca, int idHabil) {

		super("DetalleHabJFrame");
		System.out.println("id:" + idSubca);
		this.idSubCate = idSubca;
		this.idCategoria = idCategoria;
		this.idHabil = idHabil;
		createAndShowGUI();
	}

	private static void createAndShowGUI() {
		myFrame = new DetalleHabJFrame();
		myFrame.setLayout(new FlowLayout());
		myFrame.prepareUI();
		myFrame.pack();
		myFrame.setVisible(true);
	}

	private void prepareUI() {
		todo = TodoCategoria.getInstancia();
		habilidad = todo.getCategoria().get(idCategoria).getSubcategoria()[idSubCate]
				.getHabilidades()[idHabil];
		Container description = detailsComponents("Detalle",
				Component.LEFT_ALIGNMENT, habilidad);
		myFrame.add(description);
		Container maindesc = mainComponent(habilidad);
		myFrame.add(maindesc);
	}

	private static Container mainComponent(Habilidad hab) {
		JPanel container = new JPanel();
		container.setBorder(BorderFactory.createTitledBorder("Valores"));
		String[] valores = hab.getDetalleValorHabilidad();
		for (int i = 0; i < valores.length; i++) {
			int title = hab.getValorInicial() + i;
			Container comp = layoutComponents(title, Component.LEFT_ALIGNMENT,
					valores[i]);

			container.add(comp);
		}
		return container;
	}

	private static Container detailsComponents(String title, float alignment,
			Habilidad habil) {

		JPanel jpanel = new JPanel();
		jpanel.setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(jpanel, BoxLayout.Y_AXIS);
		jpanel.setLayout(layout);
		String html1 = "<html><body style='width: ";
		String html2 = "px'>";
		JLabel description = new JLabel(html1 + "200" + html2
				+ habil.getDescr());
		description.setAlignmentX(alignment);
		jpanel.setSize(500, 500);
		jpanel.add(description);

		return jpanel;
	}

	private static Container layoutComponents(int title, float alignment,
			String descValorHabil) {

		JPanel container = new JPanel();
		container.setBorder(BorderFactory.createTitledBorder("" + title));
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		String html1 = "<html><body style='width: ";
		String html2 = "px'>";
		JLabel label = new JLabel(html1 + "200" + html2 + descValorHabil);
		// String html1 = "<html><p> ";
		// String html2 = "</p></html>";
		// JLabel label = new JLabel(html1+descValorHabil+html2);
		label.setAlignmentX(alignment);
		container.setSize(500, 500);
		container.add(label);
		JButton btnSeleccionarHabil = new JButton("Regresar");
		btnSeleccionarHabil.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				double result = 100*((double)title/(double)habilidad.getValorFinal());
				TodoCategoria.getInstancia().getCategoria().get(idCategoria)
						.getSubcategoria()[idSubCate].getHabilidades()[idHabil]
						.setCalificacion(title);
				TodoCategoria.getInstancia().getCategoria().get(idCategoria)
				.getSubcategoria()[idSubCate].getHabilidades()[idHabil]
				.setCalFinal(result);
				new HabilidadesJFrame(idCategoria, idSubCate);
				myFrame.dispose();
			}
		});
		container.add(btnSeleccionarHabil);
		return container;
	}
}
