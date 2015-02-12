package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Categoria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static InicioJFrame myFrame;
	static int countMe = 0;
	JPanel mainPanel;
	private TodoCategoria todoCat;

	public InicioJFrame() {
		super("Taller 3 - SFIA");
	}

	public static void main(String[] args) {

		createAndShowGUI();
	}

	private static void createAndShowGUI() {

		myFrame = new InicioJFrame();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.prepareUI();
		myFrame.pack();
		myFrame.setVisible(true);
	}

	private void prepareUI() {
		todoCat = TodoCategoria.getInstancia();
		
		JLabel titleLabel = new JLabel("Seleccione un CATEGORIA: ");
		titleLabel.setForeground(Color.RED);
		myFrame.add(titleLabel, BorderLayout.NORTH);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		List<Categoria> categoria = todoCat.getCategoria();
		for (Categoria itemCategoria : categoria) {
			mainPanel.add(new subPanel(itemCategoria));
			myFrame.pack();
		}

		getContentPane().add(mainPanel, BorderLayout.CENTER);
	}

	private class subPanel extends JPanel {
		private static final long serialVersionUID = 4479295537341105669L;
		subPanel me;

		public subPanel(final Categoria itemCategoria) {
			super();
			me = this;
			JLabel myLabel = new JLabel("" + (itemCategoria.getId() + 1)
					+ " - " + itemCategoria.getNombre() + "  ");
			add(myLabel);
			JButton btnCompletar = new JButton("Seleccionar");
			btnCompletar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new SubCategoriaJFrame(itemCategoria.getId());
				}
			});
			add(btnCompletar);

		}
	}
}