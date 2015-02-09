package gti.bd;

import gti.bean.Categoria;
import java.util.List;

public class TodoCategoria {
	private List<Categoria> categoria = null;
	private Informacion datos;
	private static TodoCategoria instancia = null;

	public TodoCategoria() {
	}

	public static TodoCategoria getInstancia() {
		if (instancia == null) {
			instancia = new TodoCategoria();
			instancia.datos = new Informacion();
			
			instancia.categoria = instancia.datos.cargarTodo();
		}
		return instancia;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

}
