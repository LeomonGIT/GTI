package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DetalleHabJFrame extends JFrame {
	private TodoCategoria todo = null;
	Habilidad habilidad = null;
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
		String[] valores = habilidad.getDetalleValorHabilidad();
		for (int i = 0; i < valores.length; i++) {
			Container comp = layoutComponents(""+i, Component.LEFT_ALIGNMENT,valores[i]);
			comp.setMinimumSize(new Dimension(250, 450)); 
			comp.setPreferredSize(new Dimension(250, 450)); 
			comp.setMaximumSize(new Dimension(Short.MAX_VALUE, 
			                                  Short.MAX_VALUE)); 
			
			myFrame.add(comp);
		}		
	}

	private static Container detailsComponents(String title, float alignment,
			Habilidad habil) {

		JPanel container = new JPanel();
		container.setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		String html1 = "<html><body style='width: ";
        String html2 = "px'>";
		JLabel description = new JLabel(html1+"200"+html2+habil.getDescr());
		 
		description.setAlignmentX(alignment);
		container.setSize(500, 500);
		container.add(description);
		return container;
	}

	private static Container layoutComponents(String title, float alignment,
			String descValorHabil) {

		JPanel container = new JPanel();
		container.setBorder(BorderFactory.createTitledBorder(title));
		BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
		container.setLayout(layout);
		String html1 = "<html><p> ";
        String html2 = "</p></html>";
		JLabel label = new JLabel(html1+descValorHabil+html2);
//		String html1 = "<html><body style='width: ";
//        String html2 = "px'>";
		//JLabel label = new JLabel(html1+"200"+html2+descValorHabil);
		label.setAlignmentX(alignment);
		container.add(label);

		return container;
	}

}
