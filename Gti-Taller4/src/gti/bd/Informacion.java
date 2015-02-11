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

	private Habilidad[] cargarHabildades(int id) {
		Habilidad[] habil = null;
		switch (id) {
		case 0:
			habil = new Habilidad[7];
			habil[0] = new Habilidad(0, "Gobernanza de las TI", "GOVN", "", 5,
					7, cargarDetailValorHabil(0));
			habil[1] = new Habilidad(1, "Gestión de la información", "IRMG",
					"", 4, 7, cargarDetailValorHabil(1));
			habil[2] = new Habilidad(2,
					"Coordinación de sistemas de información", "ISCO", "", 6,
					7, cargarDetailValorHabil(2));
			habil[3] = new Habilidad(3, "Seguridad de la información", "SCTY",
					"", 3, 6, cargarDetailValorHabil(3));
			habil[4] = new Habilidad(4, "Garantía de la información", "INAS",
					"", 5, 7, cargarDetailValorHabil(4));
			habil[5] = new Habilidad(5, "Análisis de la información", "INAN",
					"", 3, 7, cargarDetailValorHabil(5));
			habil[6] = new Habilidad(6,
					"Publicación del contenido de la información", "ICPM", "",
					1, 6, cargarDetailValorHabil(6));
			break;
		case 1:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "Consultoría", "CNSL", "", 5, 7,
					cargarDetailValorHabil(7));
			habil[1] = new Habilidad(1, "Especialización Técnica", "TECH", "",
					4, 6, cargarDetailValorHabil(8));
			break;
		case 2:
			habil = new Habilidad[6];
			habil[0] = new Habilidad(0, "Investigacion", "RSCH", "", 3, 6,
					cargarDetailValorHabil(9));
			habil[1] = new Habilidad(1, "Innovacion", "INOV", "", 5, 6,
					cargarDetailValorHabil(10));
			habil[2] = new Habilidad(2, "Mejora en los procesos empresariales",
					"BPRE", "", 5, 7, cargarDetailValorHabil(11));
			habil[3] = new Habilidad(3,
					"Desarrollo de la arquitectura empresarial y comercial",
					"STPL", "", 5, 7, cargarDetailValorHabil(12));
			habil[4] = new Habilidad(4, "Gestion de riesgos empresariales",
					"BURM", "", 4, 7, cargarDetailValorHabil(13));
			habil[5] = new Habilidad(5, "Estrategia de sostenibilidad", "SUST",
					"", 5, 6, cargarDetailValorHabil(14));
			break;
		case 3:
			habil = new Habilidad[8];
			habil[0] = new Habilidad(0, "Supervision", "EMRG", "", 4, 6,
					cargarDetailValorHabil(15));
			habil[1] = new Habilidad(1, "Gestion de la continuidad", "COPL",
					"", 4, 5, cargarDetailValorHabil(16));
			habil[2] = new Habilidad(2,
					"Mejora del proceso de desarrollo de software", "SPIM", "",
					5, 7, cargarDetailValorHabil(17));
			habil[3] = new Habilidad(3,
					"Gestion de la sostenibilidad para las TI", "SUMI", "", 5,
					6, cargarDetailValorHabil(18));
			habil[4] = new Habilidad(4, "Planificacion de redes", "NTPL", "",
					5, 6, cargarDetailValorHabil(19));
			habil[5] = new Habilidad(5, "Arquitectura de solucion", "ARCH", "",
					5, 6, cargarDetailValorHabil(20));
			habil[6] = new Habilidad(6, "Gestion de datos", "DATM", "", 4, 6,
					cargarDetailValorHabil(21));
			habil[7] = new Habilidad(7, "Metodos y herramientas", "METL", "",
					4, 6, cargarDetailValorHabil(22));
			break;
		case 4:
			habil = new Habilidad[4];
			habil[0] = new Habilidad(0, "Gestion de carteras", "POMG", "", 5,
					7, cargarDetailValorHabil(23));
			habil[1] = new Habilidad(1, "Gestion de programas", "PGMG", "", 6,
					7, cargarDetailValorHabil(24));
			habil[2] = new Habilidad(2, "Gestion de proyectos", "PRMG", "", 4,
					7, cargarDetailValorHabil(25));
			habil[3] = new Habilidad(3,
					"Apoyo a carteras, programas y proyectos", "PROF", "", 2,
					5, cargarDetailValorHabil(26));
			break;
		case 5:
			habil = new Habilidad[8];
			habil[0] = new Habilidad(0, "Analisis empresarial", "BUAN", "", 3,
					6, cargarDetailValorHabil(27));
			habil[1] = new Habilidad(1, "Gestion y definicion de requisitos",
					"REQM", "", 2, 6, cargarDetailValorHabil(28));
			habil[2] = new Habilidad(2,
					"Comprobacion de procesos empresariales", "BPTS", "", 4, 6,
					cargarDetailValorHabil(29));
			habil[3] = new Habilidad(3,
					"Gestion y planificacion de la aplicacion de cambios",
					"CIPM", "", 5, 6, cargarDetailValorHabil(30));
			habil[4] = new Habilidad(4,
					"Aplicacion y diseño de la organizacion", "ORDI", "", 5, 6,
					cargarDetailValorHabil(31));
			habil[5] = new Habilidad(5, "Gestion de beneficios", "BENM", "", 5,
					6, cargarDetailValorHabil(32));
			habil[6] = new Habilidad(6, "Elaboracion de modelos empresariales",
					"BSMO", "", 2, 6, cargarDetailValorHabil(33));
			habil[7] = new Habilidad(7, "Evaluacion de la sostenibilidad",
					"SUAS", "", 4, 6, cargarDetailValorHabil(34));
			break;
		case 6:
			habil = new Habilidad[1];
			habil[0] = new Habilidad(0,
					"Gestion de las relaciones con las partes interesadas",
					"RLMT", "", 4, 7, cargarDetailValorHabil(35));
			break;
		case 7:
			habil = new Habilidad[7];
			habil[0] = new Habilidad(0,
					"Gestion del aprendizaje y el desarrollo", "ETMG", "", 3,
					7, cargarDetailValorHabil(36));
			habil[1] = new Habilidad(1,
					"Evaluacion del aprendizaje y el desarrollo", "LEDA", "",
					3, 6, cargarDetailValorHabil(37));
			habil[2] = new Habilidad(2,
					"Desarrollo del diseño y el aprendizaje", "TMCR", "", 4, 5,
					cargarDetailValorHabil(38));
			habil[3] = new Habilidad(3, "Prestacion del aprendizaje", "ETDL",
					"", 3, 5, cargarDetailValorHabil(39));
			habil[4] = new Habilidad(4, "Enseñanza y formacion de sujetos",
					"TEAC", "", 5, 6, cargarDetailValorHabil(40));
			habil[5] = new Habilidad(5, "Recursos", "RESC", "", 5, 6,
					cargarDetailValorHabil(41));
			habil[6] = new Habilidad(6, "Desarrollo profesional", "PDSV", "",
					4, 6, cargarDetailValorHabil(42));
			break;
		case 8:
			habil = new Habilidad[11];
			habil[0] = new Habilidad(0, "Gestion del desarrollo de sistemas",
					"DLMG", "", 5, 7, cargarDetailValorHabil(43));
			habil[1] = new Habilidad(1, "Analisis de Datos", "DTAN", "", 2, 5,
					cargarDetailValorHabil(44));
			habil[2] = new Habilidad(2, "Diseño de sistemas", "DESN", "", 2, 6,
					cargarDetailValorHabil(45));
			habil[3] = new Habilidad(3, "Diseñor de redes", "NTDS", "", 5, 6,
					cargarDetailValorHabil(46));
			habil[4] = new Habilidad(4, "Diseño de bases de datos o almacenes",
					"DBDS", "", 2, 6, cargarDetailValorHabil(47));
			habil[5] = new Habilidad(5,
					"Desarrollo de software o programacion", "PROG", "", 2, 5,
					cargarDetailValorHabil(48));
			habil[6] = new Habilidad(6, "Desarrollo de animacion", "ADEV", "",
					3, 6, cargarDetailValorHabil(49));
			habil[7] = new Habilidad(7, "Ingenieria de seguridad", "SFEN", "",
					3, 6, cargarDetailValorHabil(50));
			habil[8] = new Habilidad(8, "Ingenieria de sostenibilidad", "SUEN",
					"", 4, 6, cargarDetailValorHabil(51));
			habil[9] = new Habilidad(9, "Autoria del contenido de informacion",
					"INCA", "", 1, 6, cargarDetailValorHabil(52));
			habil[10] = new Habilidad(10, "Realizacion de pruebas", "TEST", "",
					1, 6, cargarDetailValorHabil(53));
			break;
		case 9:
			habil = new Habilidad[4];
			habil[0] = new Habilidad(0,
					"Analisi de la experiencia del usuario", "UNAN", "", 3, 5,
					cargarDetailValorHabil(54));
			habil[1] = new Habilidad(1, "Diseño ergonomico", "HCEV", "", 3, 6,
					cargarDetailValorHabil(55));
			habil[2] = new Habilidad(2,
					"Evaluacion de la experiencia del usuario", "USEV", "", 2,
					5, cargarDetailValorHabil(56));
			habil[3] = new Habilidad(3, "Integracion de factores humanos",
					"HFIN", "", 5, 7, cargarDetailValorHabil(57));
			break;
		case 10:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "Integracion de sistemas", "SINT", "",
					2, 6, cargarDetailValorHabil(58));
			habil[1] = new Habilidad(1, "Integracion de software o puertos",
					"PORT", "", 3, 6, cargarDetailValorHabil(59));
			habil[2] = new Habilidad(2, "Instalacin o clausura de sistemas",
					"HSIN", "", 1, 5, cargarDetailValorHabil(60));
			break;
		case 11:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "Gestion de las TI", "ITMG", "", 5, 7,
					cargarDetailValorHabil(61));
			habil[1] = new Habilidad(1, "Gestion financiera de las TI", "FMIT",
					"", 4, 6, cargarDetailValorHabil(62));
			break;
		case 12:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "Gestion de la capacidad", "CPMG", "",
					4, 6, cargarDetailValorHabil(63));
			habil[1] = new Habilidad(1, "Gestion de la disponibilidad", "AVMT",
					"", 4, 6, cargarDetailValorHabil(64));
			habil[2] = new Habilidad(2, "Gestion del nivel de servicio",
					"SLMO", "", 2, 7, cargarDetailValorHabil(65));
			break;
		case 13:
			habil = new Habilidad[5];
			habil[0] = new Habilidad(0, "Aceptacion del servicio", "SEAC", "",
					4, 6, cargarDetailValorHabil(66));
			habil[1] = new Habilidad(1, "Gestion de la configuracion", "CFMG",
					"", 2, 6, cargarDetailValorHabil(67));
			habil[2] = new Habilidad(2, "Gestion de activos", "ASMG", "", 4, 6,
					cargarDetailValorHabil(68));
			habil[3] = new Habilidad(3, "Gestion de cambios", "CHMG", "", 2, 6,
					cargarDetailValorHabil(69));
			habil[4] = new Habilidad(4, "Lanzamiento y aplicacion", "RELM", "",
					3, 6, cargarDetailValorHabil(70));
			break;
		case 14:
			habil = new Habilidad[11];
			habil[0] = new Habilidad(0, "Software de sistemas", "SYSP", "", 3,
					5, cargarDetailValorHabil(71));
			habil[1] = new Habilidad(1, "Administracion de seguridad", "SCAD",
					"", 3, 6, cargarDetailValorHabil(72));
			habil[2] = new Habilidad(2, "Ingenieria de radiofrecuencia",
					"RFEN", "", 2, 6, cargarDetailValorHabil(73));
			habil[3] = new Habilidad(3, "Soporte tecnico para aplicaciones",
					"ASUP", "", 2, 5, cargarDetailValorHabil(74));
			habil[4] = new Habilidad(4, "Operaciones de las TI", "ITOP", "", 1,
					4, cargarDetailValorHabil(75));
			habil[5] = new Habilidad(5, "Administracion de base de datos",
					"DBAD", "", 2, 5, cargarDetailValorHabil(76));
			habil[6] = new Habilidad(6, "Gestion del almacenamiento", "STMG",
					"", 3, 6, cargarDetailValorHabil(77));
			habil[7] = new Habilidad(7, "Soporte tecnico de red", "NTAS", "",
					2, 5, cargarDetailValorHabil(78));
			habil[8] = new Habilidad(8, "Gestion de problemas", "PBMG", "", 3,
					5, cargarDetailValorHabil(79));
			habil[9] = new Habilidad(9,
					"Departamento de servicios y gestion de incidentees",
					"USUP", "", 1, 5, cargarDetailValorHabil(80));
			habil[10] = new Habilidad(10, "Gestion de parques informaticos",
					"DCMA", "", 3, 6, cargarDetailValorHabil(81));
			break;
		case 15:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "Adquisicion", "PROC", "", 4, 7,
					cargarDetailValorHabil(88));
			habil[1] = new Habilidad(1,
					"Gestion de las relaciones con proveedores", "SURE", "", 2,
					7, cargarDetailValorHabil(89));
			habil[2] = new Habilidad(2, "Gestion de contratos", "ITCM", "", 5,
					6, cargarDetailValorHabil(90));
			break;
		case 16:
			habil = new Habilidad[6];
			habil[0] = new Habilidad(0, "Gestion de calidad", "QUMG", "", 5, 7,
					cargarDetailValorHabil(91));
			habil[1] = new Habilidad(1, "Garantia de calidad", "QUAS", "", 3,
					6, cargarDetailValorHabil(92));
			habil[2] = new Habilidad(2, "Normas de calidad", "QUST", "", 5, 7,
					cargarDetailValorHabil(93));
			habil[3] = new Habilidad(3, "Examen de conformidad", "CORE", "", 3,
					6, cargarDetailValorHabil(94));
			habil[4] = new Habilidad(4, "Evaluacion de la seguridad", "SFAS",
					"", 5, 6, cargarDetailValorHabil(95));
			habil[5] = new Habilidad(5, "Auditoria de tecnologia", "TAUD", "",
					4, 7, cargarDetailValorHabil(96));

			break;
		case 17:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(0, "Marketing", "MKTG", "", 3, 6,
					cargarDetailValorHabil(97));
			habil[1] = new Habilidad(1, "Ventas", "SALE", "", 4, 6,
					cargarDetailValorHabil(98));
			break;
		case 18:
			habil = new Habilidad[3];
			habil[0] = new Habilidad(0, "Gestion de cuentas", "ACMG", "", 5, 6,
					cargarDetailValorHabil(99));
			habil[1] = new Habilidad(1, "Asistencia en ventas", "SSUP", "", 1,
					6, cargarDetailValorHabil(100));
			habil[2] = new Habilidad(2, "Gestion de servicios al cliente",
					"CSMG", "", 3, 6, cargarDetailValorHabil(101));
			break;
		default:
			break;
		}
		return habil;
	}

	// TODO: Terminar de "Harcodear" los datos de las habilidades
	private String[] cargarDetailValorHabil(int id) {
		String[] detailValHabil = null;
		switch (id) {
		case 0:
			detailValHabil = new String[3];
			detailValHabil[0] = "Revisa sistemas de información para comprobar su cumplimiento con la legislación y especifica cualquier cambio necesario. Es responsable de garantizar el cumplimiento con las políticas y procedimientos organizativos y la estrategia global de gestión de la información.";
			detailValHabil[1] = "Establece o confirma estructuras de personal para respaldar el trabajo de la plantilla y las correctas relaciones entre la organización y los auditores externos. Asume la responsabilidad de revisar los procesos de gestión (y decisiones) y confirma que cumplan con la estrategia de la organización para la gobernanza corporativa de la información de las TI. Está familiarizado con las normas aplicables y los principios recogidos en ellas. Revisa nuevas propuestas empresariales y ofrece asesoramiento especializado acerca de cuestiones relacionadas con el cumplimiento. Actúa como el contacto de la organización con las autoridades reguladoras pertinentes. Establece políticas y normas para el cumplimiento de la legislación aplicable, adecuadas a los objetivos.";
			detailValHabil[2] = "Dirige el desarrollo y la comunicación de las políticas de la organización para la gobernanza corporativa de las TI. Colabora con los planes estratégicos para las TI, que satisfagan las necesidades actuales y en desarrollo de la estrategia empresarial de la organización, y las capacidades actuales y futuras de las TI. Promueve una toma de decisiones clara, que conduzca a motivos válidos para las adquisiciones de las TI. Supervisa la prestación de servicios. Garantiza que los procesos empresariales de la organización cumplen con la legislación pertinente, y que la organización funcione de acuerdo a los principios incorporados en las normas aplicables. Promueve políticas, prácticas y decisiones sobre las TI que reconozcan las necesidades actuales y que vayan surgiendo de todas las partes interesadas.";
			break;
		case 1:
			detailValHabil = new String[4];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 2:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 3:
			detailValHabil = new String[4];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 4:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 5:
			detailValHabil = new String[5];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 6:
			detailValHabil = new String[6];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 7:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 8:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 9:
			detailValHabil = new String[4];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 10:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 11:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 12:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 13:
			detailValHabil = new String[4];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 14:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			
			break;
		case 15:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 16:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 17:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";		
			break;
		case 18:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 19:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 20:
			detailValHabil = new String[2];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		case 21:
			detailValHabil = new String[3];
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			detailValHabil[0] = "";
			break;
		default:
			System.out.println("Default");
			break;
		}
		return detailValHabil;
	}
}
