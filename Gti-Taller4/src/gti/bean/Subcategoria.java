package gti.bean;

import java.util.Arrays;

public class Subcategoria {
	private int id;
	private String nombreSub;
	private Habilidad[] habilidades;
	private boolean completado=false;
	
	public Subcategoria(int id, String nombreSub, Habilidad[] habilidades,
			boolean completado) {
		super();
		this.id = id;
		this.nombreSub = nombreSub;
		this.habilidades = habilidades;
		this.completado = completado;
	}
	@Override
	public String toString() {
		return "Subcategoria [id=" + id + ", nombreSub=" + nombreSub
				+ ", habilidades=" + Arrays.toString(habilidades)
				+ ", completado=" + completado + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreSub() {
		return nombreSub;
	}
	public void setNombreSub(String nombreSub) {
		this.nombreSub = nombreSub;
	}
	public Habilidad[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(Habilidad[] habilidades) {
		this.habilidades = habilidades;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
		
	
	
	
}
