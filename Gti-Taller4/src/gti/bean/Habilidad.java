package gti.bean;

import java.util.Arrays;

public class Habilidad {
	private int Id;
	private String nombreHab,codigoHab;
	private int[] valor;
	
	
	
	
	
	
	
	
	
	
	public Habilidad(int id, String nombreHab, String codigoHab, int[] valor) {
		super();
		Id = id;
		this.nombreHab = nombreHab;
		this.codigoHab = codigoHab;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Habilidad [Id=" + Id + ", nombreHab=" + nombreHab
				+ ", codigoHab=" + codigoHab + ", valor="
				+ Arrays.toString(valor) + "]";
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
	public int[] getValor() {
		return valor;
	}
	public void setValor(int[] valor) {
		this.valor = valor;
	}
	
	
	
}
