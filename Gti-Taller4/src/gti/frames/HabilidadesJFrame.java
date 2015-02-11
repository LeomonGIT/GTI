package gti.frames;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;
import gti.bean.Subcategoria;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HabilidadesJFrame extends JFrame {
	private TodoCategoria todo = null;
	Habilidad[] habilidad = null;
	static HabilidadesJFrame myFrame;
	JPanel mainPanel;
	private static int idHabilidades, idCategoria;
	private JPanel btnPanel;

	public HabilidadesJFrame() {
		super("HabilidadesJFrame");
	}

	public HabilidadesJFrame(int idCategoria, int id) {

		super("HabilidadesJFrame");
		System.out.println("id:" + id);
		this.idHabilidades = id;
		this.idCategoria = idCategoria;
		createAndShowGUI();
	}

	private static void createAndShowGUI() {

		myFrame = new HabilidadesJFrame();
		myFrame.prepareUI();
		myFrame.pack();
		myFrame.setVisible(true);
	}

	private void prepareUI() {
		btnPanel = new JPanel();
		todo = TodoCategoria.getInstancia();
		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		habilidad = todo.getCategoria().get(idCategoria).getSubcategoria()[idHabilidades]
				.getHabilidades();
		for (Habilidad itemHabilidad : habilidad) {
			mainPanel.add(new habilidadesPanel(itemHabilidad));
			myFrame.pack();
		}

		JButton btnSubCompletar = new JButton("Regresar");
		btnSubCompletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				myFrame.dispose();
			}
		});
		JButton btnSubGrafico = new JButton("Gráfico");
		btnSubGrafico.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				 BarChartJFrame mainFrame = new BarChartJFrame(idCategoria,idHabilidades);
			        mainFrame.setVisible(true);
				myFrame.dispose();
			}
		});
		myFrame.add(btnPanel, BorderLayout.SOUTH);
		myFrame.add(mainPanel, BorderLayout.PAGE_START);
		btnPanel.add(btnSubGrafico);
		btnPanel.add(btnSubCompletar);
	}

	private class habilidadesPanel extends JPanel {

		public habilidadesPanel(final Habilidad itemHabilidad) {
			super();
			JLabel myLabel = new JLabel(itemHabilidad.getNombreHab() + "  -  "
					+ itemHabilidad.getCodigoHab() + "  -  "
					+ itemHabilidad.getCalificacion() + "  -  "
					+ itemHabilidad.getCalFinal());
			JButton btnSubCompletarHabil = new JButton("Calificar");
			btnSubCompletarHabil.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					new DetalleHabJFrame(idHabilidades, idCategoria,
							itemHabilidad.getId());
					myFrame.dispose();
				}
			});
			add(myLabel);
			add(btnSubCompletarHabil);
		}
	}
}
