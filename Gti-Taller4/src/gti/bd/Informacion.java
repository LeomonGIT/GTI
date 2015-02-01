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
		categoria.add(new Categoria(2, "Aplicaci�n y desarrollo de soluciones",
				false, cargarSubCa(2)));
		categoria.add(new Categoria(3, "Gesti�n de servicios", false,
				cargarSubCa(3)));
		categoria.add(new Categoria(4,
				"Soporte t�cnico de gesti�n y adquisici�n", false,
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
			subCa[0] = new Subcategoria(0, "Estrategia de informaci�n", null);
			subCa[1] = new Subcategoria(1, "Asesoriamiento y orientaci�n", null);
			subCa[2] = new Subcategoria(2,
					"Planificaci�n y estrategia empresarial", null);
			subCa[3] = new Subcategoria(3,
					"Estrategia t�cnica y planificaci�n", null);
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
			subCa[2] = new Subcategoria(2, "Instalaci�n e integraci�n", null);
			break;
		case 3:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Estrategia de servicio", null);
			subCa[1] = new Subcategoria(1, "Dise�o de servicio", null);
			subCa[2] = new Subcategoria(2, "Transici�n del servicio", null);
			subCa[3] = new Subcategoria(3, "Operaci�n del servicio", null);
			break;
		case 4:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Gesti�n de la adquisici�n", null);
			subCa[1] = new Subcategoria(1, "Calidad y conformidad", null);
			break;
		case 5:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Marketing y ventas", null);
			subCa[1] = new Subcategoria(1, "Antenci�n al cliente", null);
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
