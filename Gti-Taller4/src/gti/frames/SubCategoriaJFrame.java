package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Subcategoria;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubCategoriaJFrame extends JFrame {
	private TodoCategoria todo = null;
	static SubCategoriaJFrame myFrame;
	JPanel mainPanel;
	private int idCategoria;

	public SubCategoriaJFrame() {
		super("SubCategoria");
	}

	public SubCategoriaJFrame(int id) {

		super("SubCategoria");
		this.idCategoria = id;
			createAndShowGUI();
	}

	private static void createAndShowGUI() {

		myFrame = new SubCategoriaJFrame();
		myFrame.prepareUI();
		myFrame.pack();
		myFrame.setVisible(true);
	}

	private void prepareUI() {
		todo = TodoCategoria.getInstancia();
		todo.getCategoria();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		Subcategoria[] subCategoria = todo.getCategoria().get(idCategoria)
				.getSubcategoria();
		for (Subcategoria itemSubCategoria : subCategoria) {
			mainPanel.add(new subCategoriaPanel(itemSubCategoria));
			myFrame.pack();
		}

		JButton btnSubCompletar = new JButton("Completar");
		btnSubCompletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				myFrame.pack();
			}
		});
		getContentPane().add(mainPanel, BorderLayout.PAGE_START);
		getContentPane().add(btnSubCompletar, BorderLayout.PAGE_END);
	}

	@SuppressWarnings("serial")
	private class subCategoriaPanel extends JPanel {

		subCategoriaPanel me;

		public subCategoriaPanel(Subcategoria itemSubCategoria) {
			super();
			me = this;
			JLabel myLabel = new JLabel(itemSubCategoria.getNombreSub());
			add(myLabel);

		}
	}
}
