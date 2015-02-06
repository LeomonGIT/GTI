package gti.bean;

import java.util.Arrays;

public class Habilidad {
	private int Id;
	private String nombreHab,codigoHab;
	private int valorInicial, valorFinal;
	public Habilidad(int id, String nombreHab, String codigoHab,
			int valorInicial, int valorFinal) {
		super();
		Id = id;
		this.nombreHab = nombreHab;
		this.codigoHab = codigoHab;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
	}
	@Override
	public String toString() {
		return "Habilidad [Id=" + Id + ", nombreHab=" + nombreHab
				+ ", codigoHab=" + codigoHab + ", valorInicial=" + valorInicial
				+ ", valorFinal=" + valorFinal + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNombreHab() {
		return nombreHab;
	}
	public void setNombreHab(String nombreHab) {
		this.nombreHab = nombreHab;
	}
	public String getCodigoHab() {
		return codigoHab;
	}
	public void setCodigoHab(String codigoHab) {
		this.codigoHab = codigoHab;
	}
	public int getValorInicial() {
		return valorInicial;
	}
	public void setValorInicial(int valorInicial) {
		this.valorInicial = valorInicial;
	}
	public int getValorFinal() {
		return valorFinal;
	}
	public void setValorFinal(int valorFinal) {
		this.valorFinal = valorFinal;
	}

	
}
