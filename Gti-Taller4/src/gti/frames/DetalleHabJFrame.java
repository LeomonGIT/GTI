package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;

import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Color;
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
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;

public class DetalleHabJFrame extends JFrame {
	private TodoCategoria todo = null;
	Habilidad habilidad = null;
	static DetalleHabJFrame myFrame;
	JPanel mainPanel;
	private static int idSubCate, idCategoria, idHabil;
	private int x=1200,y=450;
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
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.LINE_AXIS));

		habilidad = todo.getCategoria().get(idCategoria).getSubcategoria()[idSubCate]
				.getHabilidades()[idHabil];
		Container description = detailsComponents("Detalle",
				Component.LEFT_ALIGNMENT, habilidad);
		mainPanel.add(description, BorderLayout.PAGE_START);
		Container maindesc = mainComponent(habilidad);
		mainPanel.add(maindesc);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
        int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS; 
        JScrollPane jsp=new JScrollPane(mainPanel,v,h);
        if(habilidad.getDetalleValorHabilidad().length==2)
        	x=860;
        jsp.setPreferredSize(new Dimension(x,y));
        jsp.setBounds(150,670,850,200);
        myFrame.add(jsp);
	}

	private static Container mainComponent(Habilidad hab) {
		JPanel container = new JPanel();
		container.setBorder(BorderFactory.createTitledBorder(BorderFactory
				.createEtchedBorder(EtchedBorder.RAISED, Color.GRAY,
						Color.DARK_GRAY), "Valores"));
		String[] valores = hab.getDetalleValorHabilidad();

		for (int i = 0; i < valores.length; i++) {
			int title = hab.getValorInicial() + i;
			Container comp = layoutComponents(title, Component.TOP_ALIGNMENT,
					valores[i]);

			container.add(comp, BorderLayout.LINE_START);
		}
		return container;
	}

	private static Container detailsComponents(String title, float alignment,
			Habilidad habil) {

		JPanel jpanel = new JPanel();
		jpanel.setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(jpanel, BoxLayout.X_AXIS);
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
		container.add(label, alignment);
		JButton btnSeleccionarHabil = new JButton("Seleccionar");
		btnSeleccionarHabil.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Habilidad habilidads = TodoCategoria.getInstancia()
						.getCategoria().get(idCategoria).getSubcategoria()[idSubCate]
						.getHabilidades()[idHabil];
				double result = 100 * ((double) title / (double) habilidads
						.getValorFinal());
				result = Math.round(result * 100.0) / 100.0;
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
