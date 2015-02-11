package gti.frames;

import gti.bd.TodoCategoria;
import gti.bean.Habilidad;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Scene;
import javafx.scene.chart.*;
import javafx.scene.layout.GridPane;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarChartJFrame extends JFrame {
	JFXPanel fxPanel;
	private JPanel btnPanel;
	private TodoCategoria todo = null;
	private static int idSubca, idCategoria;
	static BarChartJFrame myFrame;
	public BarChartJFrame() {
		// TODO Auto-generated constructor stub
	}
	public BarChartJFrame(int idCategoria, int idSubca) {
		this.idSubca = idSubca;
		this.idCategoria = idCategoria;
		initSwingComponents();
		initFxComponents();
	}

	private void initSwingComponents() {
		btnPanel = new JPanel();
		todo = TodoCategoria.getInstancia();
		String titulo = todo.getCategoria().get(idCategoria).getSubcategoria()[idSubca].getNombreSub();
		JPanel mainPanel = new JPanel(new BorderLayout());
		fxPanel = new JFXPanel();
		mainPanel.add(fxPanel, BorderLayout.CENTER);
		JLabel titleLabel = new JLabel("Gráficos de la Sub-Categoria: "+titulo);
		mainPanel.add(titleLabel, BorderLayout.NORTH);
		this.add(mainPanel);
		this.setSize(1200, 500);
		myFrame = this;
	}

	private void initFxComponents() {

		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				GridPane grid = new GridPane();
				Scene scene = new Scene(grid, 800, 400);
				Habilidad[] habilidades = todo.getCategoria().get(idCategoria).getSubcategoria()[idSubca].getHabilidades();
				/**
				 * Constructor del Scatter chart
				 */
				NumberAxis yAxis = new NumberAxis(0.0, 7.0, 1.0);
				NumberAxis xAxis = new NumberAxis(0.0, 7.0, 1.0);
				ScatterChart scatterChart = new ScatterChart<>(xAxis, yAxis);
				XYChart.Series series = new XYChart.Series<>();
				series.setName("Valor Habilidad");
				int i = 1;
				for (Habilidad habilidad : habilidades) {
					series.getData().add(getData(i, habilidad.getCalificacion()));
					i++;
				}
				scatterChart.getData().addAll(series);
				grid.add(scatterChart, 0, 0);

				/**
				 * Grafico Barras
				 */
				NumberAxis lineYAxis = new NumberAxis(0, 100, 10);
				lineYAxis.setLabel("Calificacion Final");
				CategoryAxis lineXAxis = new CategoryAxis();
				lineXAxis.setLabel("Habilidad");
				BarChart barChart = new BarChart<>(lineXAxis, lineYAxis);
				XYChart.Series bar1 = new XYChart.Series<>();
				bar1.setName("Promedio Habilidad ");
				
				for (Habilidad habilidad : habilidades) {
					bar1.getData().add(getData(habilidad.getCalFinal(), habilidad.getNombreHab()+"  ("+habilidad.getCalFinal()+")"));
					
				}
				barChart.getData().addAll(bar1);
				grid.setVgap(20);
				grid.setHgap(20);
				grid.add(barChart, 2, 0);
				fxPanel.setScene(scene);
			}
		});
		JButton btnSubCompletar = new JButton("Regresar");
		btnSubCompletar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				myFrame.dispose();
			}
		});
		myFrame.add(btnPanel, BorderLayout.SOUTH);
		btnPanel.add(btnSubCompletar);
	}

	private XYChart.Data getData(double x, double y) {
		XYChart.Data data = new XYChart.Data<>();
		data.setXValue(x);
		data.setYValue(y);
		return data;
	}

	private XYChart.Data getData(double x, String y) {
		XYChart.Data data = new XYChart.Data<>();
		data.setYValue(x);
		data.setXValue(y);
		return data;
	}
}
