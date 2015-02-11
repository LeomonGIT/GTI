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
			habil[0] = new Habilidad(0, "Gobernanza de las TI", "GOVN", "Se refiere al establecimiento y supervisión del enfoque de una organización respecto al uso de la Información y las TI, incluyendo la aceptación de responsabilidades en relación tanto al suministro como a la demanda de las TI; planes estratégicos para las TI, que satisfagan las necesidades de la estrategia empresarial de una organización (que, a cambio, tiene en cuenta las capacidades actuales y futuras de las TI); toma de decisiones transparente, que conduce a motivos válidos para las adquisiciones de las TI con un balance adecuado entre beneficios, oportunidades, costes y riesgos; prestación de servicios de TI, niveles de servicio y calidad del servicio que cumplan con los requisitos empresariales actuales y futuros; políticas y prácticas para el cumplimiento de la legislación y regulaciones obligatorias, que muestren respeto por las necesidades actuales y en evolución de todas las partes interesadas.", 5,
					7, cargarDetailValorHabil(0));
			habil[1] = new Habilidad(1, "Gestión de la información", "IRMG",
					"Corresponde a la gestión global del uso de todo tipo de información, estructurada y no estructurada, tanto si se produce interna o externamente, para respaldar la toma de decisiones y los procesos empresariales. Abarca el desarrollo y la promoción de la estrategia y políticas que abordan el diseño de estructuras y taxonomías de información, el establecimiento de políticas para el abastecimiento y el mantenimiento del contenido de datos, y el desarrollo de políticas, procedimientos, prácticas laborales y formación para fomentar el cumplimiento de la legislación regulando la gestión de registros, y todos los aspectos del mantenimiento, uso y divulgación de datos.", 4, 7, cargarDetailValorHabil(1));
			habil[2] = new Habilidad(2,
					"Coordinación de sistemas de información", "ISCO", "Se refiere a que normalmente dentro de una gran organización donde la función de la estrategia de información se atribuye a unidades autónomas, o dentro de una empresa colaborativa de organizaciones independientes, la coordinación de la estrategia de información es importante cuando la adopción de un enfoque común (como los servicios compartidos) supondría un beneficio para la organización.", 6,
					7, cargarDetailValorHabil(2));
			habil[3] = new Habilidad(3, "Seguridad de la información", "SCTY",
					"Corresponde a la gestión, así como el asesoramiento por parte de expertos, de la selección, el diseño, la justificación, la aplicación y el funcionamiento de los controles de seguridad de la información y las estrategias de gestión para mantener la confidencialidad, integridad, disponibilidad, transparencia y cumplimiento de los sistemas de información con la legislación, las regulaciones y las normas aplicables.", 3, 6, cargarDetailValorHabil(3));
			habil[4] = new Habilidad(4, "Garantía de la información", "INAS",
					"Corresponde al liderazgo y supervisión de la garantía de la información, el establecimiento de estrategias y políticas de alto nivel, para garantizar a las partes interesadas que el riesgo de la integridad de la información durante el almacenamiento y la transmisión se gestione de manera pragmática, adecuada y rentable.", 5, 7, cargarDetailValorHabil(4));
			habil[5] = new Habilidad(5, "Análisis de la información", "INAN",
					"Se refiere a la validación y el análisis de la información, incluyendo la capacidad de descubrir y cuantificar los patrones en los datos de cualquier tipo, incluyendo números, símbolos, texto, sonido e imagen. Las técnicas pertinentes incluyen estadística y minería de datos o métodos de aprendizaje automatizados, tales como inducción de reglas, redes neuronales artificiales, algoritmos genéticos y sistemas de indización automatizados.", 3, 7, cargarDetailValorHabil(5));
			habil[6] = new Habilidad(6,
					"Publicación del contenido de la información", "ICPM", "Se refiere a la gestión y adaptación de los procesos que recopilan, reúnen y publican información, incluidos en formas no estructuradas y semiestructuradas, para su entrega al usuario en el momento que sea necesario.",
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

	// TODO: Terminar Asesoramiento y orientacion SUB-CATEGORIA -- pag 20 SFIA
	private String[] cargarDetailValorHabil(int id) {
		String[] detailValHabil = null;
		switch (id) {
		//Sub categoria 1
		case 0:
			detailValHabil = new String[3];
			detailValHabil[0] = "Revisa sistemas de información para comprobar su cumplimiento con la legislación y especifica cualquier cambio necesario. Es responsable de garantizar el cumplimiento con las políticas y procedimientos organizativos y la estrategia global de gestión de la información.";
			detailValHabil[1] = "Establece o confirma estructuras de personal para respaldar el trabajo de la plantilla y las correctas relaciones entre la organización y los auditores externos. Asume la responsabilidad de revisar los procesos de gestión (y decisiones) y confirma que cumplan con la estrategia de la organización para la gobernanza corporativa de la información de las TI. Está familiarizado con las normas aplicables y los principios recogidos en ellas. Revisa nuevas propuestas empresariales y ofrece asesoramiento especializado acerca de cuestiones relacionadas con el cumplimiento. Actúa como el contacto de la organización con las autoridades reguladoras pertinentes. Establece políticas y normas para el cumplimiento de la legislación aplicable, adecuadas a los objetivos.";
			detailValHabil[2] = "Dirige el desarrollo y la comunicación de las políticas de la organización para la gobernanza corporativa de las TI. Colabora con los planes estratégicos para las TI, que satisfagan las necesidades actuales y en desarrollo de la estrategia empresarial de la organización, y las capacidades actuales y futuras de las TI. Promueve una toma de decisiones clara, que conduzca a motivos válidos para las adquisiciones de las TI. Supervisa la prestación de servicios. Garantiza que los procesos empresariales de la organización cumplen con la legislación pertinente, y que la organización funcione de acuerdo a los principios incorporados en las normas aplicables. Promueve políticas, prácticas y decisiones sobre las TI que reconozcan las necesidades actuales y que vayan surgiendo de todas las partes interesadas.";
			break;
		case 1:
			detailValHabil = new String[4];
			detailValHabil[0] = "Comprende y cumple con las políticas y procedimientos de la organización correspondientes, asumiendo la responsabilidad de la evaluación y gestión de los riesgos en torno al uso de la información. Garantiza que la información se presente de manera eficaz. Garantiza que se establezcan controles efectivos para la delegación, auditoría y control internos y que el organismo reciba informes y asesoramiento oportunos que fundamentarán sus decisiones.";
			detailValHabil[1] = "Redacta y mantiene la política, normas y procedimientos para el cumplimiento de la legislación aplicable. Comprende las implicaciones de la información, tanto interna como externa, que puede extraerse de los sistemas empresariales y de otros lugares. Toma decisiones empresariales en base a esa información, incluyendo la necesidad de realizar cambios en los sistemas. Revisa nuevas propuestas empresariales y proporciona asesoramiento especializado sobre la gestión de la información, incluyendo el asesoramiento sobre la idea del trabajo cooperativo y de la evaluación y gestión del riesgo, así como la promoción de la misma. Crea y mantiene un inventario de los activos de información, están sujetos a la legislación aplicable. Prepara y revisa la notificación periódica de los datos de registro y la remite a las autoridades reguladoras correspondientes. Garantiza que las solicitudes y quejas formales sobre el acceso a la información se abordan según los procedimientos acordados.";
			detailValHabil[2] = "Mantiene y comunica la estrategia de gestión de información de la organización, garantizando que se elaboren y apliquen definiciones de datos reconocidas y aceptadas por igual en toda la organización. Garantiza que los procesos empresariales y la información necesarios para respaldar la organización se elaboran de forma precisa y establece normas, procesos, y arquitecturas de datos pertinentes. Identifica el impacto de cualquier disposición reglamentaria, interna o externa, acerca del uso de la información de la organización y desarrolla estrategias para el cumplimiento. Coordina recursos informativos para cumplir objetivos empresariales concretos al mismo tiempo que se mantienen los principios de normas, transparencia, claridad, igualdad y diversidad profesionales y de claridad de objetivos. Aplica sistemas y controles de las TI para medir el rendimiento, gestionar el riesgo y garantizar que las TI y la empresa trabajan conjuntamente para respaldar el objetivo empresarial.";
			detailValHabil[3] = "Especifica, a nivel de estrategia, las funciones empresariales y los sujetos de dato necesarios para respaldar el futuro negocio, permitiendo así el desarrollo de una Arquitectura de la Información. Establece y comunica la estrategia de gestión de la información de la organización, desarrollándola como una parte integrada de la estrategia empresarial. Dirige recursos informativos para crear valor para las partes interesadas mediante la mejora del rendimiento de la organización, al mismo tiempo que se mantienen los principios de la transparencia, claridad, igualdad y diversidad profesionales y de claridad de objetivos. Es responsable del cumplimiento con las regulaciones, normas y códigos de buenas prácticas en relación a la información y la documentación. Registra la gestión, garantía de información y protección de datos.";
			break;
		case 2:
			detailValHabil = new String[2];
			detailValHabil[0] = "Está al tanto de las necesidades globales de la organización, y promueve los beneficios que un enfoque común en la aplicación de las TI aportará a la empresa en su conjunto, entre los sistemas de información y gestión empresarial. Coordina el fomento, desarrollo, adquisición y aplicación de los sistemas de información y servicios en estrecha colaboración con los responsables de la gestión y estrategia.";
			detailValHabil[1] = "Establece, mantiene y comunica la estrategia de gestión de información de la organización, así como las políticas, normas, procedimientos y métodos necesarios para aplicar la estrategia. Coordina todos los aspectos de la gestión del ciclo de vida de los sistemas de información. Representa los intereses de toda la organización ante órganos externos y de gestión general acerca de cuestiones relacionadas con la estrategia de la información.";
			break;
		case 3:
			detailValHabil = new String[4];
			detailValHabil[0] = "Aplica y mantiene los controles de seguridad específicos exigidos por la política de la organización y evaluaciones de los riesgos locales para mantener la confidencialidad, integridad y disponibilidad de los sistemas de información empresarial y para incrementar la resistencia al acceso no autorizado. Colabora en evaluaciones de vulnerabilidad. Reconoce cuando una red o sistema de TI ha sido atacado internamente, mediante un host remoto o un código malintencionado, como un virus, un gusano, un troyano, etc., o cuando se ha producido una vulneración de la seguridad. Toma medidas inmediatas para limitar los daños, conforme a la política de seguridad de la organización, que puede incluir una derivación al siguiente nivel, y registra el accidente y las medidas tomadas. Muestra una comunicación eficaz de los problemas de seguridad a los directivos de la empresa y otros. Realiza evaluaciones de riesgos básicas para sistemas de información pequeños.";
			detailValHabil[1] = "Realiza evaluaciones de riesgos de seguridad y vulnerabilidad para las aplicaciones empresariales definidas o instalaciones de las IT en áreas definidas, y proporciona asesoramiento y orientación sobre la aplicación y funcionamiento de controles de seguridad técnica, física y de procedimiento elementales (por ejemplo, controles clave definidos en la norma ISO27001). Realiza evaluaciones de riesgo y vulnerabilidad, así como análisis del impacto comercial para los sistemas de información de tamaño medio. Investiga las sospechas de ataques y gestiona incidentes de seguridad.";
			detailValHabil[2] = "Obtiene y actúa en relación a información sobre vulnerabilidades y realiza evaluaciones de riesgos de seguridad para aplicaciones empresariales e instalaciones informáticas; proporciona asesoramiento fidedigno y orientación sobre las estrategias de seguridad para gestionar el riesgo detectado. Investiga las infracciones de seguridad más graves, y recomienda mejoras adecuadas en el control. Interpreta la política de seguridad y contribuye al desarrollo de normas y directrices que cumplan con esta. Realiza la evaluación de riesgos, análisis de impacto comercial y acreditación para todos los sistemas de información más importantes dentro de la organización. Garantiza una respuesta adecuada a la información sobre vulnerabilidades, incluyendo el uso adecuado de investigación forense.";
			detailValHabil[3] = "Proporciona liderazgo y directrices sobre la experiencia en seguridad de garantía de la información para la organización, mediante un trabajo efectivo con las funciones estratégicas de la organización, tales como expertos jurídicos y servicio técnico para proporcionar asesoramiento fidedigno y orientación sobre los requisitos para los controles de seguridad. Facilita el restablecimiento de los sistemas de información, garantizando que se incorporen las capacidades de protección, detección y reacción.";
			break;
		case 4:
			detailValHabil = new String[3];
			detailValHabil[0] = "Proporciona asesoramiento y orientación fidedignos en estrategias y arquitectura de garantía de la información para gestionar el riesgo detectado. Está familiarizado con la legislación aplicable más importante en relación a la seguridad de la información. Interpreta las políticas de seguridad y de garantía y contribuye al desarrollo de normas y directrices que cumplan con estas. Realiza pruebas para respaldar la garantía de la información.";
			detailValHabil[1] = "Desarrolla las políticas de seguridad de la información de la empresa, normas y directrices. Prepara y mantiene las estrategias de la organización que abordan la evolución de los riesgos empresariales y los requisitos de control de la información. Funciona como centro de experiencia gobernativa de garantía de la información para la organización, mediante un trabajo efectivo con las funciones estratégicas de la organización, como expertos jurídicos y soporte técnico para proporcionar asesoramiento y orientación fidedignos sobre los requisitos de los controles de seguridad. Garantiza que se apliquen los principios arquitectónicos durante el diseño para reducir el riesgo, y promueve las normas de garantía garantizando una comprobación rigorosa de la seguridad.";
			detailValHabil[2] = "Establece y gestiona la estrategia y las políticas de garantía de la información conforme a las normas aplicables. Planifica y aplica procesos para hacer avanzar la estrategia y las políticas. Proporciona liderazgo y directrices para la prestación de los requisitos de garantía de la información a través de toda la información de la organización y los sistemas de información.";
			break;
		case 5:
			detailValHabil = new String[5];
			detailValHabil[0] = "Realiza actividades analíticas y proporciona resultados de los análisis, conforme a las necesidades del cliente y según las normas acordadas.";
			detailValHabil[1] = "Evalúa la integridad de los datos procedentes de diversas fuentes (incluyendo, por ejemplo, de detectores y sistemas de medición). Aplica una variedad de técnicas analíticas y de presentación, en consulta con expertos, si procede, y con prudencia en relación a las limitaciones de las técnicas.";
			detailValHabil[2] = "Validar de forma independiente información externa procedente de diversas fuentes. Especifica y aplica las técnicas analíticas adecuadas e informa sobre los resultados a los clientes y al departamento de gestión.";
			detailValHabil[3] = "Es responsable del compromiso de la organización para lograr un análisis eficiente y eficaz de la información textual, numérica visual o auditiva, incluyendo procesos para adquirir y validar información externa de forma regular y coherente.";
			detailValHabil[4] = "Establece y gestiona métodos y técnicas de análisis de la información. Planifica y aplica la divulgación de métodos y técnicas, y proporciona liderazgo y orientación para el análisis de información interna y externa. Identifica y establece la veracidad de las fuentes de información externas relevantes para las necesidades operativas de la empresa. Establece u gestiona los medios para validar de forma independiente información externa procedente de diversas fuentes. Planifica y aplica procesos para adquirir y validar información externa de forma regular y coherente.";
			break;
		case 6:
			detailValHabil = new String[6];
			detailValHabil[0] = "Contribuye, bajo instrucciones, a las actividades de respaldo de la publicación y colabora en la recopilación de información.";
			detailValHabil[1] = "Elabora actividades de respaldo de publicaciones como las de redacción, ilustración, impresión, etc. Comprende los conceptos, herramientas y métodos de publicación técnica, instrumentos y la forma en la que estos se aplican. Obtiene y analiza información de uso y la presenta en forma efectiva.";
			detailValHabil[2] = "Especifica y crea procesos de gestión de contenido para satisfacer las necesidades de los usuarios. Utiliza herramientas en consenso para ofrecer material terminado en plataformas adecuadas.";
			detailValHabil[3] = "Define y gestiona los procesos de gestión de contenidos para satisfacer las necesidades de los usuarios. Utiliza técnicas y herramientas adecuadas para proporcionar interfaces moderadamente complejas a plataformas y aplicaciones nuevas o existentes.";
			detailValHabil[4] = "Desarrolla normas y procedimientos para respaldar la publicación de contenido. Diseña estructuras globales de información de respaldo. Asume la responsabilidad de las tareas de publicación, incluyendo, por ejemplo, el diseño de la estructura general y el estilo gráfico de sitios web importantes, complejos o destacados. Selecciona las herramientas adecuadas, las plantillas y las normas para la publicación en diversas formas, de acuerdo con las expectativas del cliente (distinguiendo, por ejemplo, entre necesidades tales como la optimización y la facilidad de modificación). Establece normas de diseño y codificación, teniendo en cuenta el ancho de banda y la compatibilidad.";
			detailValHabil[5] = "Desarrolla estrategias para la entrega de información de respaldo, incluidos los medios de comunicación preferidos, las reglas para el formato del contenido y la estrategia de reprografía, si procede. Garantiza que existan los procedimientos adecuados, normas, instrumentos y recursos para garantizar la calidad correcta del material elaborado por los responsables de publicación de la información dentro de la organización. Asume la responsabilidad de estrategia de publicación, incluyendo, por ejemplo, los marcos de la estructura general de la información y el estilo gráfico de sitios web importantes, complejos o destacados. Dirige la selección de las herramientas, plantillas y normas apropiadas para la publicación en diversas formas, de acuerdo con las expectativas del cliente.";
			break;
			
		case 7: //Sub categoria 2
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
