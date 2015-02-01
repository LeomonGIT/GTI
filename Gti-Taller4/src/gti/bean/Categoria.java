package gti.bean;

import java.util.Arrays;

public class Categoria {
	private Subcategoria[] subcategoria;
	private int id;
	private String nombre;
	private boolean estado;
	
	public Categoria(int id,  String nombre,
			boolean estado,Subcategoria[] subcategoria) {
		super();
		this.subcategoria = subcategoria;
		this.id = id;
		this.nombre = nombre;
		this.estado = estado;
	}
	public Subcategoria[] getSubcategoria() {
		return subcategoria;
	}
	public void setSubcategoria(Subcategoria[] subcategoria) {
		this.subcategoria = subcategoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
		
	}
	@Override
	public String toString() {
		return "Categoria [subcategoria=" + Arrays.toString(subcategoria)
				+ ", id=" + id + ", nombre=" + nombre + ", estado=" + estado
				+ "]";
	}
	
}
