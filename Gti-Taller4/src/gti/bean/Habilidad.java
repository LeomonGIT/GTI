package gti.bean;

public class Habilidad {
	private int Id;
	private String nombreHab, codigoHab, descr;
	private int valorInicial, valorFinal;
	private String[] detalleValorHabilidad;
	private int calificacion = 0, calFinal = 0;

	public Habilidad(int id, String nombreHab, String codigoHab, String descr,
			int valorInicial, int valorFinal, String[] detalleValorHabilidad) {
		super();
		Id = id;
		this.nombreHab = nombreHab;
		this.codigoHab = codigoHab;
		this.descr = descr;
		this.valorInicial = valorInicial;
		this.valorFinal = valorFinal;
		this.detalleValorHabilidad = detalleValorHabilidad;
	}

	@Override
	public String toString() {
		return "Habilidad [Id=" + Id + ", nombreHab=" + nombreHab
				+ ", codigoHab=" + codigoHab + ", descr=" + descr
				+ ", valorInicial=" + valorInicial + ", valorFinal="
				+ valorFinal + ", calificacion=" + calificacion + ", calFinal="
				+ calFinal + "]";
	}

	public String[] getDetalleValorHabilidad() {
		return detalleValorHabilidad;
	}

	public void setDetalleValorHabilidad(String[] detalleValorHabilidad) {
		this.detalleValorHabilidad = detalleValorHabilidad;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
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

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public int getCalFinal() {
		return calFinal;
	}

	public void setCalFinal(int calFinal) {
		this.calFinal = calFinal;
	}

}
