package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

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
		myFrame.prepareUI();
		myFrame.pack();
		myFrame.setVisible(true);
	}

	private void prepareUI() {
		todo = TodoCategoria.getInstancia();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		habilidad = todo.getCategoria().get(idCategoria).getSubcategoria()[idSubCate]
				.getHabilidades()[idHabil];

		mainPanel.add(new DetalleHabilidadesPanel(habilidad));
		myFrame.pack();

		JButton btnSubCompletar = new JButton("Regresar");
		btnSubCompletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				myFrame.dispose();
			}
		});
		getContentPane().add(mainPanel, BorderLayout.PAGE_START);
		getContentPane().add(btnSubCompletar, BorderLayout.PAGE_END);
	}

	private class DetalleHabilidadesPanel extends JPanel {

		public DetalleHabilidadesPanel(final Habilidad itemHabilidad) {
			super();
			JLabel myLabel = new JLabel(itemHabilidad.getNombreHab());
			JButton btnSubCompletarHabil = new JButton("Calificar");
			btnSubCompletarHabil.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new DetalleHabJFrame();
				}
			});
			add(myLabel);
			add(btnSubCompletarHabil);
		}
	}
}
