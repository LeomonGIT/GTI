package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Subcategoria;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.embed.swing.JFXPanel;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SubCategoriaJFrame extends JFrame {
	private TodoCategoria todo = null;
	Subcategoria[] subCategoria = null;
	static SubCategoriaJFrame myFrame;
	JPanel mainPanel;
	private static int idCategoria;

	public SubCategoriaJFrame() {
		super("SubCategoria");
	}

	public SubCategoriaJFrame(int id) {

		System.out.println("id:" + id);
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
		System.out.println("idCategoria:" + idCategoria);
		todo = TodoCategoria.getInstancia();
		JLabel titleLabel = new JLabel("Seleccione una SUB-CATEGORIA: ");
		titleLabel.setForeground(Color.RED);
		myFrame.add(titleLabel, BorderLayout.NORTH);
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		subCategoria = todo.getCategoria().get(idCategoria).getSubcategoria();
		for (Subcategoria itemSubCategoria : subCategoria) {
			mainPanel.add(new subCategoriaPanel(itemSubCategoria));
			myFrame.pack();
		}

		JButton btnSubCompletar = new JButton("Regresar");
		btnSubCompletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				myFrame.dispose();
			}
		});
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		getContentPane().add(btnSubCompletar, BorderLayout.PAGE_END);
	}

	@SuppressWarnings("serial")
	private class subCategoriaPanel extends JPanel {

		public subCategoriaPanel(final Subcategoria itemSubCategoria) {
			super();
			JLabel myLabel = new JLabel(itemSubCategoria.getNombreSub());
			JButton btnSubCompletarHabil = new JButton("Completar");
			btnSubCompletarHabil.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					if (itemSubCategoria.isCompletado())
						myFrame.dispose();
					else
						new HabilidadesJFrame(idCategoria, itemSubCategoria
								.getId());

				}
			});
			add(myLabel);
			add(btnSubCompletarHabil);
		}
	}
}
