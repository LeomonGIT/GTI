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
	private JPanel btnPanel,panelLeyenda,panelPie;
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
		panelLeyenda = new JPanel();
		panelPie =new JPanel();
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
				NumberAxis xAxis = new NumberAxis(0.0, habilidades.length, 1.0);
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
					bar1.getData().add(getData(habilidad.getCalFinal(), habilidad.getCodigoHab()+"  ("+habilidad.getCalFinal()+")"));
					
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
				new HabilidadesJFrame(idCategoria, idSubca);
				myFrame.dispose();
			}
		});
		JLabel titleLabel1 = new JLabel("1: follow");
		JLabel titleLabel2 = new JLabel("2: Ayudar");
		JLabel titleLabel3 = new JLabel("3: Aplicar");
		JLabel titleLabel4 = new JLabel("4: Permitir");
		JLabel titleLabel5 = new JLabel("5: Garantizar / Aconsejar");
		JLabel titleLabel6 = new JLabel("6: Iniciar / Influir");
		JLabel titleLabel7 = new JLabel("7: establecer la estrategia, inspirar, movilizar");
		panelPie.setLayout(new BoxLayout(panelPie, BoxLayout.Y_AXIS));
		panelLeyenda.add(titleLabel1);
		panelLeyenda.add(titleLabel2);
		panelLeyenda.add(titleLabel3);
		panelLeyenda.add(titleLabel4);
		panelLeyenda.add(titleLabel5);
		panelLeyenda.add(titleLabel6);
		panelLeyenda.add(titleLabel7);
		btnPanel.add(btnSubCompletar);
		panelPie.add(panelLeyenda);
		panelPie.add(btnPanel);
		
		
		myFrame.add(panelPie, BorderLayout.PAGE_END);		
		//myFrame.add(btnPanel, BorderLayout.SOUTH);
		
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
