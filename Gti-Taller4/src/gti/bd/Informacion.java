package gti.bd;

import gti.bean.Categoria;
import gti.bean.Habilidad;
import gti.bean.Subcategoria;

import java.util.ArrayList;
import java.util.List;

public class Informacion {

	private List<Categoria> categoria = null;

	public List<Categoria> cargarTodo() {
		categoria = new ArrayList<Categoria>();
		categoria.add(new Categoria(0, "Estrategia y arquitectura", false,
				cargarSubCa(0)));
		categoria.add(new Categoria(1, "Cambio empresarial", false,
				cargarSubCa(1)));
		categoria.add(new Categoria(2, "Aplicación y desarrollo de soluciones",
				false, cargarSubCa(2)));
		categoria.add(new Categoria(3, "Gestión de servicios", false,
				cargarSubCa(3)));
		categoria.add(new Categoria(4,
				"Soporte técnico de gestión y adquisición", false,
				cargarSubCa(4)));
		categoria.add(new Categoria(5, "Interfaz de cliente", false,
				cargarSubCa(5)));
		return categoria;
	}

	private Subcategoria[] cargarSubCa(int id) {
		Subcategoria[] subCa = null;
		switch (id) {
		case 0:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Estrategia de información", null);
			subCa[1] = new Subcategoria(1, "Asesoriamiento y orientación", null);
			subCa[2] = new Subcategoria(2,
					"Planificación y estrategia empresarial", null);
			subCa[3] = new Subcategoria(3,
					"Estrategia técnica y planificación", null);
			break;
		case 1:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Aplicacion del cambio empresarial",
					null);
			subCa[1] = new Subcategoria(1, "Gestion del cambio emmpresarial",
					null);
			subCa[2] = new Subcategoria(2, "Gestion de relaciones", null);
			subCa[3] = new Subcategoria(3, "Gestion de habilidades", null);
			break;
		case 2:
			subCa = new Subcategoria[3];
			subCa[0] = new Subcategoria(0, "Desarrollo de sistemas", null);
			subCa[1] = new Subcategoria(1, "Factoes humanos", null);
			subCa[2] = new Subcategoria(2, "Instalación e integración", null);
			break;
		case 3:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Estrategia de servicio", null);
			subCa[1] = new Subcategoria(1, "Diseño de servicio", null);
			subCa[2] = new Subcategoria(2, "Transición del servicio", null);
			subCa[3] = new Subcategoria(3, "Operación del servicio", null);
			break;
		case 4:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Gestión de la adquisición", null);
			subCa[1] = new Subcategoria(1, "Calidad y conformidad", null);
			break;
		case 5:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Marketing y ventas", null);
			subCa[1] = new Subcategoria(1, "Antención al cliente", null);
			break;
		default:
			break;
		}
		return subCa;
	}

	// TODO: Terminar de "Harcodear" los datos de las habilidades
	private Habilidad[] cargarHabildades(int id) {
		Habilidad[] habil = null;
		switch (id) {
		case 0:

			break;

		default:
			break;
		}
		return habil;
	}
}
