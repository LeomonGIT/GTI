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
			subCa[0] = new Subcategoria(0, "Estrategia de información",
					cargarHabildades(0), false);
			subCa[1] = new Subcategoria(1, "Asesoriamiento y orientación",
					cargarHabildades(1), false);
			subCa[2] = new Subcategoria(2,
					"Planificación y estrategia empresarial",
					cargarHabildades(2), false);
			subCa[3] = new Subcategoria(3,
					"Estrategia técnica y planificación", cargarHabildades(3),
					false);
			break;
		case 1:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Aplicacion del cambio empresarial",
					cargarHabildades(4), false);
			subCa[1] = new Subcategoria(1, "Gestion del cambio emmpresarial",
					cargarHabildades(5), false);
			subCa[2] = new Subcategoria(2, "Gestion de relaciones",
					cargarHabildades(6), false);
			subCa[3] = new Subcategoria(3, "Gestion de habilidades",
					cargarHabildades(7), false);
			break;
		case 2:
			subCa = new Subcategoria[3];
			subCa[0] = new Subcategoria(0, "Desarrollo de sistemas",
					cargarHabildades(8), false);
			subCa[1] = new Subcategoria(1, "Factoes humanos",
					cargarHabildades(9), false);
			subCa[2] = new Subcategoria(2, "Instalación e integración",
					cargarHabildades(10), false);
			break;
		case 3:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Estrategia de servicio",
					cargarHabildades(11), false);
			subCa[1] = new Subcategoria(1, "Diseño de servicio",
					cargarHabildades(12), false);
			subCa[2] = new Subcategoria(2, "Transición del servicio",
					cargarHabildades(13), false);
			subCa[3] = new Subcategoria(3, "Operación del servicio",
					cargarHabildades(14), false);
			break;
		case 4:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Gestión de la adquisición",
					cargarHabildades(15), false);
			subCa[1] = new Subcategoria(1, "Calidad y conformidad",
					cargarHabildades(16), false);
			break;
		case 5:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Marketing y ventas",
					cargarHabildades(17), false);
			subCa[1] = new Subcategoria(1, "Antención al cliente",
					cargarHabildades(18), false);
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
			habil = new Habilidad[7];
			habil[0] = new Habilidad(0, "Gobernanza de las TI", "GOVN", 5, 7);
			habil[1] = new Habilidad(1, "Gestión de la información", "IRMG", 4,
					7);
			habil[2] = new Habilidad(2,
					"Coordinación de sistemas de información", "ISCO", 6, 7);
			habil[3] = new Habilidad(3, "Seguridad de la información", "SCTY",
					3, 6);
			habil[4] = new Habilidad(4, "Garantía de la información", "INAS",
					5, 7);
			habil[5] = new Habilidad(5, "Análisis de la información", "INAN",
					3, 7);
			habil[6] = new Habilidad(6,
					"Publicación del contenido de la información", "ICPM", 1, 6);
			break;
		case 1:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "Consultoría", "CNSL", 5, 7);
			habil[1] = new Habilidad(1, "Especialización Técnica", "TECH", 4, 6);
			break;
		case 2:
			habil = new Habilidad[6];
			habil[0] = new Habilidad(0, "Investigacion", "RSCH", 3, 6);
			habil[1] = new Habilidad(1, "Innovacion", "INOV", 5, 6);
			habil[2] = new Habilidad(2, "Mejora en los procesos empresariales",
					"BPRE", 5, 7);
			habil[3] = new Habilidad(3,
					"Desarrollo de la arquitectura empresarial y comercial",
					"STPL", 5, 7);
			habil[4] = new Habilidad(4, "Gestion de riesgos empresariales",
					"BURM", 4, 7);
			habil[5] = new Habilidad(5, "Estrategia de sostenibilidad", "SUST",
					5, 6);
			break;
		case 3:
			habil = new Habilidad[8];
			habil[0] = new Habilidad(0, "Supervision", "EMRG", 4, 6);
			habil[1] = new Habilidad(1, "Gestion de la continuidad", "COPL", 4,
					5);
			habil[2] = new Habilidad(2,
					"Mejora del proceso de desarrollo de software", "SPIM", 5,
					7);
			habil[3] = new Habilidad(3,
					"Gestion de la sostenibilidad para las TI", "SUMI", 5, 6);
			habil[4] = new Habilidad(4, "Planificacion de redes", "NTPL", 5, 6);
			habil[5] = new Habilidad(5, "Arquitectura de solucion", "ARCH", 5,
					6);
			habil[6] = new Habilidad(6, "Gestion de datos", "DATM", 4, 6);
			habil[7] = new Habilidad(7, "Metodos y herramientas", "METL", 4, 6);
			break;
		case 4:
			habil = new Habilidad[4];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(2, "", "", 5, 7);
			break;
		case 5:
			habil = new Habilidad[8];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			habil[5] = new Habilidad(5, "", "", 5, 7);
			habil[6] = new Habilidad(6, "", "", 5, 7);
			habil[7] = new Habilidad(7, "", "", 5, 7);
			break;
		case 6:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			break;
		case 7:
			habil = new Habilidad[7];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			habil[5] = new Habilidad(5, "", "", 5, 7);
			habil[6] = new Habilidad(6, "", "", 5, 7);
			break;
		case 8:
			habil = new Habilidad[11];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			habil[5] = new Habilidad(5, "", "", 5, 7);
			habil[6] = new Habilidad(6, "", "", 5, 7);
			habil[7] = new Habilidad(7, "", "", 5, 7);
			habil[8] = new Habilidad(8, "", "", 5, 7);
			habil[9] = new Habilidad(9, "", "", 5, 7);
			habil[10] = new Habilidad(10, "", "", 5, 7);
			break;
		case 9:
			habil = new Habilidad[4];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			break;
		case 10:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			break;
		case 11:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			break;
		case 12:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			break;
		case 13:
			habil = new Habilidad[5];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			break;
		case 14:
			habil = new Habilidad[11];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			habil[5] = new Habilidad(5, "", "", 5, 7);
			habil[6] = new Habilidad(6, "", "", 5, 7);
			habil[7] = new Habilidad(7, "", "", 5, 7);
			habil[8] = new Habilidad(8, "", "", 5, 7);
			habil[9] = new Habilidad(9, "", "", 5, 7);
			habil[10] = new Habilidad(10, "", "", 5, 7);
			break;
		case 15:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			break;
		case 16:
			habil = new Habilidad[6];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			habil[3] = new Habilidad(3, "", "", 5, 7);
			habil[4] = new Habilidad(4, "", "", 5, 7);
			habil[5] = new Habilidad(5, "", "", 5, 7);

			break;
		case 17:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			break;
		case 18:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "", "", 5, 7);
			habil[1] = new Habilidad(1, "", "", 5, 7);
			habil[2] = new Habilidad(2, "", "", 5, 7);
			break;
		default:
			break;
		}
		return habil;
	}
}
