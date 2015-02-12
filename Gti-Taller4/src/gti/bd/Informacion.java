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
			subCa[0] = new Subcategoria(0, "Estrategia de informaci�n",
					cargarHabildades(0), false);
			subCa[1] = new Subcategoria(1, "Asesoriamiento y orientaci�n",
					cargarHabildades(1), false);
			subCa[2] = new Subcategoria(2,
					"Planificaci�n y estrategia empresarial",
					cargarHabildades(2), false);
			subCa[3] = new Subcategoria(3,
					"Estrategia t�cnica y planificaci�n", cargarHabildades(3),
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
			subCa[2] = new Subcategoria(2, "Instalaci�n e integraci�n",
					cargarHabildades(10), false);
			break;
		case 3:
			subCa = new Subcategoria[4];
			subCa[0] = new Subcategoria(0, "Estrategia de servicio",
					cargarHabildades(11), false);
			subCa[1] = new Subcategoria(1, "Dise�o de servicio",
					cargarHabildades(12), false);
			subCa[2] = new Subcategoria(2, "Transici�n del servicio",
					cargarHabildades(13), false);
			subCa[3] = new Subcategoria(3, "Operaci�n del servicio",
					cargarHabildades(14), false);
			break;
		case 4:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Gesti�n de la adquisici�n",
					cargarHabildades(15), false);
			subCa[1] = new Subcategoria(1, "Calidad y conformidad",
					cargarHabildades(16), false);
			break;
		case 5:
			subCa = new Subcategoria[2];
			subCa[0] = new Subcategoria(0, "Marketing y ventas",
					cargarHabildades(17), false);
			subCa[1] = new Subcategoria(1, "Antenci�n al cliente",
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
			habil[0] = new Habilidad(
					0,
					"Gobernanza de las TI",
					"GOVN",
					"Se refiere al establecimiento y supervisi�n del enfoque de una organizaci�n respecto al uso de la Informaci�n y las TI, incluyendo la aceptaci�n de responsabilidades en relaci�n tanto al suministro como a la demanda de las TI; planes estrat�gicos para las TI, que satisfagan las necesidades de la estrategia empresarial de una organizaci�n (que, a cambio, tiene en cuenta las capacidades actuales y futuras de las TI); toma de decisiones transparente, que conduce a motivos v�lidos para las adquisiciones de las TI con un balance adecuado entre beneficios, oportunidades, costes y riesgos; prestaci�n de servicios de TI, niveles de servicio y calidad del servicio que cumplan con los requisitos empresariales actuales y futuros; pol�ticas y pr�cticas para el cumplimiento de la legislaci�n y regulaciones obligatorias, que muestren respeto por las necesidades actuales y en evoluci�n de todas las partes interesadas.",
					5, 7, cargarDetailValorHabil(0));
			habil[1] = new Habilidad(
					1,
					"Gesti�n de la informaci�n",
					"IRMG",
					"Corresponde a la gesti�n global del uso de todo tipo de informaci�n, estructurada y no estructurada, tanto si se produce interna o externamente, para respaldar la toma de decisiones y los procesos empresariales. Abarca el desarrollo y la promoci�n de la estrategia y pol�ticas que abordan el dise�o de estructuras y taxonom�as de informaci�n, el establecimiento de pol�ticas para el abastecimiento y el mantenimiento del contenido de datos, y el desarrollo de pol�ticas, procedimientos, pr�cticas laborales y formaci�n para fomentar el cumplimiento de la legislaci�n regulando la gesti�n de registros, y todos los aspectos del mantenimiento, uso y divulgaci�n de datos.",
					4, 7, cargarDetailValorHabil(1));
			habil[2] = new Habilidad(
					2,
					"Coordinaci�n de sistemas de informaci�n",
					"ISCO",
					"Se refiere a que normalmente dentro de una gran organizaci�n donde la funci�n de la estrategia de informaci�n se atribuye a unidades aut�nomas, o dentro de una empresa colaborativa de organizaciones independientes, la coordinaci�n de la estrategia de informaci�n es importante cuando la adopci�n de un enfoque com�n (como los servicios compartidos) supondr�a un beneficio para la organizaci�n.",
					6, 7, cargarDetailValorHabil(2));
			habil[3] = new Habilidad(
					3,
					"Seguridad de la informaci�n",
					"SCTY",
					"Corresponde a la gesti�n, as� como el asesoramiento por parte de expertos, de la selecci�n, el dise�o, la justificaci�n, la aplicaci�n y el funcionamiento de los controles de seguridad de la informaci�n y las estrategias de gesti�n para mantener la confidencialidad, integridad, disponibilidad, transparencia y cumplimiento de los sistemas de informaci�n con la legislaci�n, las regulaciones y las normas aplicables.",
					3, 6, cargarDetailValorHabil(3));
			habil[4] = new Habilidad(
					4,
					"Garant�a de la informaci�n",
					"INAS",
					"Corresponde al liderazgo y supervisi�n de la garant�a de la informaci�n, el establecimiento de estrategias y pol�ticas de alto nivel, para garantizar a las partes interesadas que el riesgo de la integridad de la informaci�n durante el almacenamiento y la transmisi�n se gestione de manera pragm�tica, adecuada y rentable.",
					5, 7, cargarDetailValorHabil(4));
			habil[5] = new Habilidad(
					5,
					"An�lisis de la informaci�n",
					"INAN",
					"Se refiere a la validaci�n y el an�lisis de la informaci�n, incluyendo la capacidad de descubrir y cuantificar los patrones en los datos de cualquier tipo, incluyendo n�meros, s�mbolos, texto, sonido e imagen. Las t�cnicas pertinentes incluyen estad�stica y miner�a de datos o m�todos de aprendizaje automatizados, tales como inducci�n de reglas, redes neuronales artificiales, algoritmos gen�ticos y sistemas de indizaci�n automatizados.",
					3, 7, cargarDetailValorHabil(5));
			habil[6] = new Habilidad(
					6,
					"Publicaci�n del contenido de la informaci�n",
					"ICPM",
					"Se refiere a la gesti�n y adaptaci�n de los procesos que recopilan, re�nen y publican informaci�n, incluidos en formas no estructuradas y semiestructuradas, para su entrega al usuario en el momento que sea necesario.",
					1, 6, cargarDetailValorHabil(6));
			break;
		case 1:
			habil = new Habilidad[2];
			habil[0] = new Habilidad(
					0,
					"Consultor�a",
					"CNSL",
					"Se refiere a la prestaci�n de asesoramiento y recomendaciones, en base a la experiencia y el conocimiento, para abordar las necesidades del cliente. Puede tratar un aspecto espec�fico de las TI y la empresa, o puede abarcar m�s y abordar cuestiones de estrategia empresarial. Tambi�n puede incluir apoyo para la aplicaci�n de cualquier soluci�n acordada.",
					5, 7, cargarDetailValorHabil(7));
			habil[1] = new Habilidad(
					1,
					"Especializaci�n T�cnica",
					"TECH",
					"Corresponde al desarrollo y aprovechamiento de la experiencia en un �rea concreta de tecnolog�a, t�cnica, m�todo, producto o aplicaci�n.",
					4, 6, cargarDetailValorHabil(8));
			break;
		case 2:
			habil = new Habilidad[6];
			habil[0] = new Habilidad(
					0,
					"Investigacion",
					"RSCH",
					"Se refiere al avance de los conocimientos en uno o m�s campos de las TI mediante la innovaci�n, experimentaci�n, evaluaci�n y difusi�n que se realizan para alcanzar un determinado conjunto de objetivos de investigaci�n.",
					3, 6, cargarDetailValorHabil(9));
			habil[1] = new Habilidad(
					1,
					"Innovacion",
					"INOV",
					"La capacidad para reconocer y aprovechar las oportunidades empresariales proporcionadas por las TI, (por ejemplo, Internet), para garantizar un rendimiento m�s eficiente y eficaz de las organizaciones, estudiar posibilidades de nuevas formas de hacer negocios y procesos organizativos, y establecer nuevas empresas.",
					5, 6, cargarDetailValorHabil(10));
			habil[2] = new Habilidad(
					2,
					"Mejora en los procesos empresariales",
					"BPRE",
					"Corresponde a la identificaci�n de enfoques nuevos y alternativos para la realizaci�n de actividades empresariales. El an�lisis de los procesos empresariales, incluyendo el reconocimiento del potencial de automatizaci�n de los procesos, la evaluaci�n de los costos y beneficios potenciales de los nuevos enfoques considerados y, si es necesario, la gesti�n del cambio, y la ayuda en la aplicaci�n. Puede incluir la aplicaci�n de una capacidad/disciplina de gesti�n de procesos a nivel de empresa.",
					5, 7, cargarDetailValorHabil(11));
			habil[3] = new Habilidad(
					3,
					"Desarrollo de la arquitectura empresarial y comercial",
					"STPL",
					"Se refiere a la creaci�n, iteraci�n y mantenimiento de estructuras, como estructuras empresariales y comerciales que representan los principios, m�todos y modelos claves que describen el estado futuro de la organizaci�n y permiten su evoluci�n. Esto incluye normalmente la interpretaci�n de objetivos e impulsores; la transformaci�n de la estrategia y objetivos comerciales en un `modelo operativo`; la evaluaci�n estrat�gica de las capacidades actuales; la identificaci�n de cambios necesarios en las capacidades; y la descripci�n de interrelaciones entre personas, organizaci�n, servicio, proceso, datos, informaci�n, tecnolog�a y el entorno exterior. El proceso de desarrollo de arquitecturas apoya la formaci�n de limitaciones, normas y principios necesarios para definir, garantizar y conducir la evoluci�n necesaria; esto facilita el cambio en la estructura de la organizaci�n, procesos comerciales, sistemas e infraestructura con objeto de conseguir una transici�n previsible al estado previsto.",
					5, 7, cargarDetailValorHabil(12));
			habil[4] = new Habilidad(
					4,
					"Gestion de riesgos empresariales",
					"BURM",
					"Corresponde a la planificaci�n y aplicaci�n de procesos y procedimientos a nivel de toda la organizaci�n para la gesti�n del riesgo en relaci�n al �xito o la integridad de la empresa, sobre todo aquellos que surgen del uso de tecnolog�as de la informaci�n, la reducci�n o la no disponibilidad de suministro de energ�a o la eliminaci�n inadecuada de materiales, hardware y datos.",
					4, 7, cargarDetailValorHabil(13));
			habil[5] = new Habilidad(
					5,
					"Estrategia de sostenibilidad",
					"SUST",
					"Corresponde a la preparaci�n de una estrategia de sostenibilidad para las TI, que tenga en cuenta cualquier estrategia corporativa establecida, para utilizarse como base para pol�ticas y planificaci�n, y que abarque tanto el consumo como las fuentes de suministro de energ�a y materiales. Evaluaci�n e inclusi�n, si procede, de factores pol�ticos, legislativos, econ�micos, sociales y tecnol�gicos. Identificaci�n de normas, pr�cticas o esquemas externos importantes que deben adoptarse. Consulta con partes relevantes identificadas, ya sean internas o externas. Obtenci�n de acuerdos respecto a la estrategia y el compromiso de actuar conforme a ella.",
					5, 6, cargarDetailValorHabil(14));
			break;
		case 3:
			habil = new Habilidad[8];
			habil[0] = new Habilidad(
					0,
					"Supervision",
					"EMRG",
					"productos, servicios, m�todos y t�cnicas, as� como la evaluaci�n de su relevancia y su valor potencial como fundamento corporativo, mejoras en la relaci�n coste-rendimiento o sostenibilidad. La promoci�n del conocimiento de la existencia de nuevas tecnolog�as entre el personal y la administraci�n empresarial.",
					4, 6, cargarDetailValorHabil(15));
			habil[1] = new Habilidad(
					1,
					"Gestion de la continuidad",
					"COPL",
					"Corresponde a la prestaci�n de servicios de planificaci�n de continuidad y apoyo. Esto incluye la identificaci�n de sistemas de informaci�n que respalden procesos empresariales clave, la evaluaci�n de los riesgos a la disponibilidad de esos sistemas, la integridad y la confidencialidad, adem�s de la coordinaci�n de procedimientos de planificaci�n, dise�o, pruebas y mantenimiento y planes de contingencia para hacer frente a los riesgos y mantener los niveles acordados de continuidad. Esta funci�n deber�a llevarse a cabo como parte de, o en estrecha cooperaci�n con, la funci�n que planifica la continuidad empresarial para toda la organizaci�n.",
					4, 5, cargarDetailValorHabil(16));
			habil[2] = new Habilidad(
					2,
					"Mejora del proceso de desarrollo de software",
					"SPIM",
					"Se refiere a la prestaci�n de asesoramiento, asistencia y liderazgo para mejorar la calidad del desarrollo de software, centr�ndose en la definici�n del proceso, la gesti�n, la medici�n y la repetibilidad. La facilitaci�n de mejoras mediante un cambio en los enfoques y pr�cticas de trabajo, generalmente utilizando modelos reconocidos, como la Integraci�n de Modelos de Madurez de Capacidades (CMMI), el Modelo de Determinaci�n de la Capacidad de Mejora del Proceso de Software (SPICE), Mejora del Proceso de Pruebas (TPI) y el Modelo de Madurez de Pruebas (TMM).",
					5, 7, cargarDetailValorHabil(17));
			habil[3] = new Habilidad(
					3,
					"Gestion de la sostenibilidad para las TI",
					"SUMI",
					"Corresponde a la especificaci�n, planificaci�n y gesti�n de cambios en activos, sistemas, procesos o pr�cticas de TI dirigidos a reducir o limitar el consumo o la eliminaci�n de energ�a o materiales, dentro del contexto de la estrategia y la pol�tica de la empresa, y los requisitos contractuales o reguladores. La evaluaci�n de cambios para garantizar que se han obtenido los beneficios previstos. La especificaci�n de acciones correctivas y de mejora del proceso en aquellos casos en los que no se han obtenido los beneficios previstos. La identificaci�n y planificaci�n de fuentes de suministro alternativas.",
					5, 6, cargarDetailValorHabil(18));
			habil[4] = new Habilidad(
					4,
					"Planificacion de redes",
					"NTPL",
					"Corresponde a la creaci�n y el mantenimiento de planes de red generales, abarcando la comunicaci�n de datos, voz, texto e imagen para respaldar la estrategia empresarial de una organizaci�n. Esto incluye la participaci�n en la creaci�n de acuerdos de nivel de servicio y la planificaci�n de todos los aspectos de la infraestructura necesarios para garantizar la prestaci�n de servicios de red con el fin de cumplir con dichos acuerdos. La aplicaci�n material puede incluir cable de cobre, fibra �ptica, sistema inal�mbrico, o cualquier otra tecnolog�a.",
					5, 6, cargarDetailValorHabil(19));
			habil[5] = new Habilidad(
					5,
					"Arquitectura de solucion",
					"ARCH",
					"Pueden ser necesarios cambios en el modelo operativo de servicio, proceso y organizaci�n y otros aspectos adem�s de los componentes tecnol�gicos, y las soluciones deben mostrar c�mo se cumplen los requisitos acordados (como la automatizaci�n de los procesos empresariales), cualquier requisito que no se cumpla por completo y cualquier opci�n o consideraci�n que requieran una necesidad empresarial. La prestaci�n de orientaci�n exhaustiva sobre el desarrollo, y modificaciones, de los componentes de soluci�n para garantizar que estos consideren las arquitecturas, estrategias, pol�ticas, normas y pr�cticas pertinentes, y que los componentes de soluci�n actuales y previstos sigan siendo compatibles.",
					5, 6, cargarDetailValorHabil(20));
			habil[6] = new Habilidad(
					6,
					"Gestion de datos",
					"DATM",
					"Corresponde a la gesti�n de pr�cticas y procesos para garantizar la integridad, seguridad y disponibilidad de todas las formas de datos y estructuras de datos que componen la informaci�n de la organizaci�n. La gesti�n de datos e informaci�n en todas sus formas y el an�lisis de la estructura de la informaci�n (incluyendo el an�lisis l�gico de taxonom�as, datos y metadatos). El desarrollo de formas innovadoras de gestionar el activo de informaci�n de la organizaci�n.",
					4, 6, cargarDetailValorHabil(21));
			habil[7] = new Habilidad(
					7,
					"Metodos y herramientas",
					"METL",
					"Se trata de garantizar que se adopten y se utilicen de forma efectiva en toda la organizaci�n los m�todos e instrumentos adecuados para la planificaci�n, desarrollo, pruebas, operaci�n, gesti�n y mantenimiento de los sistemas.",
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
					"Aplicacion y dise�o de la organizacion", "ORDI", "", 5, 6,
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
					"Desarrollo del dise�o y el aprendizaje", "TMCR", "", 4, 5,
					cargarDetailValorHabil(38));
			habil[3] = new Habilidad(3, "Prestacion del aprendizaje", "ETDL",
					"", 3, 5, cargarDetailValorHabil(39));
			habil[4] = new Habilidad(4, "Ense�anza y formacion de sujetos",
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
			habil[2] = new Habilidad(2, "Dise�o de sistemas", "DESN", "", 2, 6,
					cargarDetailValorHabil(45));
			habil[3] = new Habilidad(3, "Dise�or de redes", "NTDS", "", 5, 6,
					cargarDetailValorHabil(46));
			habil[4] = new Habilidad(4, "Dise�o de bases de datos o almacenes",
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
			habil[1] = new Habilidad(1, "Dise�o ergonomico", "HCEV", "", 3, 6,
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
		//CATEGORIA 1:
		case 0:// Sub categoria 1
			detailValHabil = new String[3];
			detailValHabil[0] = "Revisa sistemas de informaci�n para comprobar su cumplimiento con la legislaci�n y especifica cualquier cambio necesario. Es responsable de garantizar el cumplimiento con las pol�ticas y procedimientos organizativos y la estrategia global de gesti�n de la informaci�n.";
			detailValHabil[1] = "Establece o confirma estructuras de personal para respaldar el trabajo de la plantilla y las correctas relaciones entre la organizaci�n y los auditores externos. Asume la responsabilidad de revisar los procesos de gesti�n (y decisiones) y confirma que cumplan con la estrategia de la organizaci�n para la gobernanza corporativa de la informaci�n de las TI. Est� familiarizado con las normas aplicables y los principios recogidos en ellas. Revisa nuevas propuestas empresariales y ofrece asesoramiento especializado acerca de cuestiones relacionadas con el cumplimiento. Act�a como el contacto de la organizaci�n con las autoridades reguladoras pertinentes. Establece pol�ticas y normas para el cumplimiento de la legislaci�n aplicable, adecuadas a los objetivos.";
			detailValHabil[2] = "Dirige el desarrollo y la comunicaci�n de las pol�ticas de la organizaci�n para la gobernanza corporativa de las TI. Colabora con los planes estrat�gicos para las TI, que satisfagan las necesidades actuales y en desarrollo de la estrategia empresarial de la organizaci�n, y las capacidades actuales y futuras de las TI. Promueve una toma de decisiones clara, que conduzca a motivos v�lidos para las adquisiciones de las TI. Supervisa la prestaci�n de servicios. Garantiza que los procesos empresariales de la organizaci�n cumplen con la legislaci�n pertinente, y que la organizaci�n funcione de acuerdo a los principios incorporados en las normas aplicables. Promueve pol�ticas, pr�cticas y decisiones sobre las TI que reconozcan las necesidades actuales y que vayan surgiendo de todas las partes interesadas.";
			break;
		case 1:
			detailValHabil = new String[4];
			detailValHabil[0] = "Comprende y cumple con las pol�ticas y procedimientos de la organizaci�n correspondientes, asumiendo la responsabilidad de la evaluaci�n y gesti�n de los riesgos en torno al uso de la informaci�n. Garantiza que la informaci�n se presente de manera eficaz. Garantiza que se establezcan controles efectivos para la delegaci�n, auditor�a y control internos y que el organismo reciba informes y asesoramiento oportunos que fundamentar�n sus decisiones.";
			detailValHabil[1] = "Redacta y mantiene la pol�tica, normas y procedimientos para el cumplimiento de la legislaci�n aplicable. Comprende las implicaciones de la informaci�n, tanto interna como externa, que puede extraerse de los sistemas empresariales y de otros lugares. Toma decisiones empresariales en base a esa informaci�n, incluyendo la necesidad de realizar cambios en los sistemas. Revisa nuevas propuestas empresariales y proporciona asesoramiento especializado sobre la gesti�n de la informaci�n, incluyendo el asesoramiento sobre la idea del trabajo cooperativo y de la evaluaci�n y gesti�n del riesgo, as� como la promoci�n de la misma. Crea y mantiene un inventario de los activos de informaci�n, est�n sujetos a la legislaci�n aplicable. Prepara y revisa la notificaci�n peri�dica de los datos de registro y la remite a las autoridades reguladoras correspondientes. Garantiza que las solicitudes y quejas formales sobre el acceso a la informaci�n se abordan seg�n los procedimientos acordados.";
			detailValHabil[2] = "Mantiene y comunica la estrategia de gesti�n de informaci�n de la organizaci�n, garantizando que se elaboren y apliquen definiciones de datos reconocidas y aceptadas por igual en toda la organizaci�n. Garantiza que los procesos empresariales y la informaci�n necesarios para respaldar la organizaci�n se elaboran de forma precisa y establece normas, procesos, y arquitecturas de datos pertinentes. Identifica el impacto de cualquier disposici�n reglamentaria, interna o externa, acerca del uso de la informaci�n de la organizaci�n y desarrolla estrategias para el cumplimiento. Coordina recursos informativos para cumplir objetivos empresariales concretos al mismo tiempo que se mantienen los principios de normas, transparencia, claridad, igualdad y diversidad profesionales y de claridad de objetivos. Aplica sistemas y controles de las TI para medir el rendimiento, gestionar el riesgo y garantizar que las TI y la empresa trabajan conjuntamente para respaldar el objetivo empresarial.";
			detailValHabil[3] = "Especifica, a nivel de estrategia, las funciones empresariales y los sujetos de dato necesarios para respaldar el futuro negocio, permitiendo as� el desarrollo de una Arquitectura de la Informaci�n. Establece y comunica la estrategia de gesti�n de la informaci�n de la organizaci�n, desarroll�ndola como una parte integrada de la estrategia empresarial. Dirige recursos informativos para crear valor para las partes interesadas mediante la mejora del rendimiento de la organizaci�n, al mismo tiempo que se mantienen los principios de la transparencia, claridad, igualdad y diversidad profesionales y de claridad de objetivos. Es responsable del cumplimiento con las regulaciones, normas y c�digos de buenas pr�cticas en relaci�n a la informaci�n y la documentaci�n. Registra la gesti�n, garant�a de informaci�n y protecci�n de datos.";
			break;
		case 2:
			detailValHabil = new String[2];
			detailValHabil[0] = "Est� al tanto de las necesidades globales de la organizaci�n, y promueve los beneficios que un enfoque com�n en la aplicaci�n de las TI aportar� a la empresa en su conjunto, entre los sistemas de informaci�n y gesti�n empresarial. Coordina el fomento, desarrollo, adquisici�n y aplicaci�n de los sistemas de informaci�n y servicios en estrecha colaboraci�n con los responsables de la gesti�n y estrategia.";
			detailValHabil[1] = "Establece, mantiene y comunica la estrategia de gesti�n de informaci�n de la organizaci�n, as� como las pol�ticas, normas, procedimientos y m�todos necesarios para aplicar la estrategia. Coordina todos los aspectos de la gesti�n del ciclo de vida de los sistemas de informaci�n. Representa los intereses de toda la organizaci�n ante �rganos externos y de gesti�n general acerca de cuestiones relacionadas con la estrategia de la informaci�n.";
			break;
		case 3:
			detailValHabil = new String[4];
			detailValHabil[0] = "Aplica y mantiene los controles de seguridad espec�ficos exigidos por la pol�tica de la organizaci�n y evaluaciones de los riesgos locales para mantener la confidencialidad, integridad y disponibilidad de los sistemas de informaci�n empresarial y para incrementar la resistencia al acceso no autorizado. Colabora en evaluaciones de vulnerabilidad. Reconoce cuando una red o sistema de TI ha sido atacado internamente, mediante un host remoto o un c�digo malintencionado, como un virus, un gusano, un troyano, etc., o cuando se ha producido una vulneraci�n de la seguridad. Toma medidas inmediatas para limitar los da�os, conforme a la pol�tica de seguridad de la organizaci�n, que puede incluir una derivaci�n al siguiente nivel, y registra el accidente y las medidas tomadas. Muestra una comunicaci�n eficaz de los problemas de seguridad a los directivos de la empresa y otros. Realiza evaluaciones de riesgos b�sicas para sistemas de informaci�n peque�os.";
			detailValHabil[1] = "Realiza evaluaciones de riesgos de seguridad y vulnerabilidad para las aplicaciones empresariales definidas o instalaciones de las IT en �reas definidas, y proporciona asesoramiento y orientaci�n sobre la aplicaci�n y funcionamiento de controles de seguridad t�cnica, f�sica y de procedimiento elementales (por ejemplo, controles clave definidos en la norma ISO27001). Realiza evaluaciones de riesgo y vulnerabilidad, as� como an�lisis del impacto comercial para los sistemas de informaci�n de tama�o medio. Investiga las sospechas de ataques y gestiona incidentes de seguridad.";
			detailValHabil[2] = "Obtiene y act�a en relaci�n a informaci�n sobre vulnerabilidades y realiza evaluaciones de riesgos de seguridad para aplicaciones empresariales e instalaciones inform�ticas; proporciona asesoramiento fidedigno y orientaci�n sobre las estrategias de seguridad para gestionar el riesgo detectado. Investiga las infracciones de seguridad m�s graves, y recomienda mejoras adecuadas en el control. Interpreta la pol�tica de seguridad y contribuye al desarrollo de normas y directrices que cumplan con esta. Realiza la evaluaci�n de riesgos, an�lisis de impacto comercial y acreditaci�n para todos los sistemas de informaci�n m�s importantes dentro de la organizaci�n. Garantiza una respuesta adecuada a la informaci�n sobre vulnerabilidades, incluyendo el uso adecuado de investigaci�n forense.";
			detailValHabil[3] = "Proporciona liderazgo y directrices sobre la experiencia en seguridad de garant�a de la informaci�n para la organizaci�n, mediante un trabajo efectivo con las funciones estrat�gicas de la organizaci�n, tales como expertos jur�dicos y servicio t�cnico para proporcionar asesoramiento fidedigno y orientaci�n sobre los requisitos para los controles de seguridad. Facilita el restablecimiento de los sistemas de informaci�n, garantizando que se incorporen las capacidades de protecci�n, detecci�n y reacci�n.";
			break;
		case 4:
			detailValHabil = new String[3];
			detailValHabil[0] = "Proporciona asesoramiento y orientaci�n fidedignos en estrategias y arquitectura de garant�a de la informaci�n para gestionar el riesgo detectado. Est� familiarizado con la legislaci�n aplicable m�s importante en relaci�n a la seguridad de la informaci�n. Interpreta las pol�ticas de seguridad y de garant�a y contribuye al desarrollo de normas y directrices que cumplan con estas. Realiza pruebas para respaldar la garant�a de la informaci�n.";
			detailValHabil[1] = "Desarrolla las pol�ticas de seguridad de la informaci�n de la empresa, normas y directrices. Prepara y mantiene las estrategias de la organizaci�n que abordan la evoluci�n de los riesgos empresariales y los requisitos de control de la informaci�n. Funciona como centro de experiencia gobernativa de garant�a de la informaci�n para la organizaci�n, mediante un trabajo efectivo con las funciones estrat�gicas de la organizaci�n, como expertos jur�dicos y soporte t�cnico para proporcionar asesoramiento y orientaci�n fidedignos sobre los requisitos de los controles de seguridad. Garantiza que se apliquen los principios arquitect�nicos durante el dise�o para reducir el riesgo, y promueve las normas de garant�a garantizando una comprobaci�n rigorosa de la seguridad.";
			detailValHabil[2] = "Establece y gestiona la estrategia y las pol�ticas de garant�a de la informaci�n conforme a las normas aplicables. Planifica y aplica procesos para hacer avanzar la estrategia y las pol�ticas. Proporciona liderazgo y directrices para la prestaci�n de los requisitos de garant�a de la informaci�n a trav�s de toda la informaci�n de la organizaci�n y los sistemas de informaci�n.";
			break;
		case 5:
			detailValHabil = new String[5];
			detailValHabil[0] = "Realiza actividades anal�ticas y proporciona resultados de los an�lisis, conforme a las necesidades del cliente y seg�n las normas acordadas.";
			detailValHabil[1] = "Eval�a la integridad de los datos procedentes de diversas fuentes (incluyendo, por ejemplo, de detectores y sistemas de medici�n). Aplica una variedad de t�cnicas anal�ticas y de presentaci�n, en consulta con expertos, si procede, y con prudencia en relaci�n a las limitaciones de las t�cnicas.";
			detailValHabil[2] = "Validar de forma independiente informaci�n externa procedente de diversas fuentes. Especifica y aplica las t�cnicas anal�ticas adecuadas e informa sobre los resultados a los clientes y al departamento de gesti�n.";
			detailValHabil[3] = "Es responsable del compromiso de la organizaci�n para lograr un an�lisis eficiente y eficaz de la informaci�n textual, num�rica visual o auditiva, incluyendo procesos para adquirir y validar informaci�n externa de forma regular y coherente.";
			detailValHabil[4] = "Establece y gestiona m�todos y t�cnicas de an�lisis de la informaci�n. Planifica y aplica la divulgaci�n de m�todos y t�cnicas, y proporciona liderazgo y orientaci�n para el an�lisis de informaci�n interna y externa. Identifica y establece la veracidad de las fuentes de informaci�n externas relevantes para las necesidades operativas de la empresa. Establece u gestiona los medios para validar de forma independiente informaci�n externa procedente de diversas fuentes. Planifica y aplica procesos para adquirir y validar informaci�n externa de forma regular y coherente.";
			break;
		case 6:
			detailValHabil = new String[6];
			detailValHabil[0] = "Contribuye, bajo instrucciones, a las actividades de respaldo de la publicaci�n y colabora en la recopilaci�n de informaci�n.";
			detailValHabil[1] = "Elabora actividades de respaldo de publicaciones como las de redacci�n, ilustraci�n, impresi�n, etc. Comprende los conceptos, herramientas y m�todos de publicaci�n t�cnica, instrumentos y la forma en la que estos se aplican. Obtiene y analiza informaci�n de uso y la presenta en forma efectiva.";
			detailValHabil[2] = "Especifica y crea procesos de gesti�n de contenido para satisfacer las necesidades de los usuarios. Utiliza herramientas en consenso para ofrecer material terminado en plataformas adecuadas.";
			detailValHabil[3] = "Define y gestiona los procesos de gesti�n de contenidos para satisfacer las necesidades de los usuarios. Utiliza t�cnicas y herramientas adecuadas para proporcionar interfaces moderadamente complejas a plataformas y aplicaciones nuevas o existentes.";
			detailValHabil[4] = "Desarrolla normas y procedimientos para respaldar la publicaci�n de contenido. Dise�a estructuras globales de informaci�n de respaldo. Asume la responsabilidad de las tareas de publicaci�n, incluyendo, por ejemplo, el dise�o de la estructura general y el estilo gr�fico de sitios web importantes, complejos o destacados. Selecciona las herramientas adecuadas, las plantillas y las normas para la publicaci�n en diversas formas, de acuerdo con las expectativas del cliente (distinguiendo, por ejemplo, entre necesidades tales como la optimizaci�n y la facilidad de modificaci�n). Establece normas de dise�o y codificaci�n, teniendo en cuenta el ancho de banda y la compatibilidad.";
			detailValHabil[5] = "Desarrolla estrategias para la entrega de informaci�n de respaldo, incluidos los medios de comunicaci�n preferidos, las reglas para el formato del contenido y la estrategia de reprograf�a, si procede. Garantiza que existan los procedimientos adecuados, normas, instrumentos y recursos para garantizar la calidad correcta del material elaborado por los responsables de publicaci�n de la informaci�n dentro de la organizaci�n. Asume la responsabilidad de estrategia de publicaci�n, incluyendo, por ejemplo, los marcos de la estructura general de la informaci�n y el estilo gr�fico de sitios web importantes, complejos o destacados. Dirige la selecci�n de las herramientas, plantillas y normas apropiadas para la publicaci�n en diversas formas, de acuerdo con las expectativas del cliente.";
			break;

		case 7: // Sub categoria 2
			detailValHabil = new String[3];
			detailValHabil[0] = "Asume la responsabilidad de la comprensi�n de los requisitos del cliente, la recopilaci�n de datos, la entrega de an�lisis y la resoluci�n de problemas. Identifica, eval�a y recomienda opciones, aplic�ndolas si es necesario. Facilita los grupos de interesados y colabora con ellos, como parte de acuerdos de consultor�a formales o informales. Intenta satisfacer por completo las necesidades del cliente, fomentando las capacidades y efectividad del personal encargado de los clientes y garantizando que las soluciones propuestas se comprenden bien y se aprovechan de la forma";
			detailValHabil[1] = "Gestiona la prestaci�n de servicios de consultor�a y la gesti�n de un equipo de consultores, ofrece asesoramiento y orientaci�n a los consultores o al cliente mediante la participaci�n en la prestaci�n de servicios de consultor�a. Se compromete con los clientes y mantiene relaciones con los clientes. Establece acuerdos/contratos y gesti�n el cumplimiento y el abandono de un compromiso.";
			detailValHabil[2] = "Asume la responsabilidad de una pr�ctica consultora importante, incluyendo el desarrollo de pr�cticas, las propuestas/ventas a clientes internos o externos, la gesti�n de cuentas y la gesti�n de la prestaci�n de servicios de consultor�a en una amplia variedad de TI y cuestiones relacionadas con las TI.";
			System.out.println("case 7: out");
			break;
		case 8:
			detailValHabil = new String[3];
			detailValHabil[0] = "Mantiene un conocimiento de especialidades t�cnicas concretas, ofrece asesoramiento detallado en cuanto a su aplicaci�n y lleva a cabo tareas especializadas. La especializaci�n puede ser en cualquier aspecto de la tecnolog�a, t�cnica, m�todo, producto o �rea de aplicaci�n relacionados con la informaci�n y la comunicaci�n.";
			detailValHabil[1] = "Mantiene un conocimiento profundo de especialidades t�cnicas concretas y ofrece asesoramiento experto en cuanto a su aplicaci�n. Puede supervisar el asesoramiento t�cnico especializado. La especializaci�n puede ser en cualquier aspecto de la tecnolog�a, t�cnica, m�todo, producto o �rea de aplicaci�n relacionados con la informaci�n y la comunicaci�n.";
			detailValHabil[2] = "Proporciona liderazgo y directrices organizativas para promover el desarrollo y el aprovechamiento de los conocimientos t�cnicos en la organizaci�n.";
			break;

		case 9: // Sub categoria 3
			detailValHabil = new String[4];
			detailValHabil[0] = "Dentro de objetivos de investigaci�n dados, se basa en ellos y sugiere un esquema de ideas apropiado para la investigaci�n, es decir, lleva a cabo la evaluaci�n, desarrollo, demostraci�n y aplicaci�n. Utiliza los recursos disponibles para obtener un conocimiento actualizado de cualquier campo relevante de las TI. Informa sobre los trabajos realizados y puede contribuir a con material con calidad de publicaci�n.";
			detailValHabil[1] = "Contribuye a los objetivos de investigaci�n, se basa en ellos, y sugiere un esquema de ideas apropiado para la evaluaci�n, desarrollo, demostraci�n y aplicaci�n de la investigaci�n. Utiliza los recursos disponibles para obtener un conocimiento actualizado de cualquier campo relevante de las TI. Informa sobre los trabajos realizados y puede contribuir con material con calidad de publicaci�n. Contribuye a los planes de investigaci�n e identifica oportunidades adecuadas para la publicaci�n y difusi�n de las conclusiones de la investigaci�n.";
			detailValHabil[2] = "Acuerda objetivos de investigaci�n y genera ideas originales y valiosas en un campo especializado de las TI. Desarrolla, eval�a y critica ideas de forma constructiva, que posiblemente deriven en un peque�o equipo de investigaci�n, haciendo observaciones y pruebas necesarias y llev�ndolas a cabo a trav�s de una completa demostraci�n pr�ctica, siempre que sea viable y factible. Cuando es necesario, dise�a herramientas y t�cnicas de recopilaci�n de datos cualitativos y cuantitativos. Presenta ponencias en conferencias, escribe art�culos con calidad de publicaci�n y presenta informes a clientes.";
			detailValHabil[3] = "Establece objetivos de investigaci�n, realiza propuestas efectivas de inversi�n de fondos en proyectos de investigaci�n, desempe�a un papel importante en el desarrollo de la pol�tica de investigaci�n de la organizaci�n empleadora y supervisa el trabajo de una funci�n de investigaci�n. Se hace una idea del trabajo de investigaci�n actual en una importante �rea de las TI y participa de forma destacada en actividades profesionales fuera de la organizaci�n para la que trabaja.";
			break;
		case 10:
			detailValHabil = new String[2];
			detailValHabil[0] = "Supervisa de forma activa, y busca, oportunidades, nuevos m�todos y tendencias en las capacidades y productos de las TI para hacer avanzar a la organizaci�n. Se expresa de forma clara e informa de manera formal sobre sus ventajas.";
			detailValHabil[1] = "Reconoce la aplicaci�n estrat�gica potencial de las TI e inicia la investigaci�n y el desarrollo de m�todos innovadores de explotaci�n de los activos de las TI en beneficio de las organizaciones y la comunidad. Desempe�a un papel activo en la mejora entre la empresa y las TI.";
			break;
		case 11:
			detailValHabil = new String[3];
			detailValHabil[0] = "Analiza los procesos empresariales, identifica soluciones alternativas, eval�a la viabilidad y recomienda nuevos m�todos. Contribuye a la evaluaci�n de los factores que se deben abordar en el programa de cambio. Ayuda a establecer requisitos para la aplicaci�n de cambios en el proceso empresarial.";
			detailValHabil[1] = "Analiza los procesos empresariales, identifica soluciones alternativas, eval�a la viabilidad y recomienda nuevos m�todos, por lo general, tratando de aprovechar los componentes tecnol�gicos. Eval�a los factores financieros, culturales, tecnol�gicos, organizativos y medioambientales que deben abordarse en el programa de cambio. Establece los requisitos del cliente para la aplicaci�n de cambios significativos en la misi�n de la organizaci�n, procesos y funciones empresariales, roles y responsabilidades de organizaci�n, y el alcance o la naturaleza de la prestaci�n de servicios.";
			detailValHabil[2] = "Aporta mejoras significativas y ventajas empresariales mensurables mediante la identificaci�n, propuesta, aplicaci�n y direcci�n de programas de mejora significativos. Refuerza los enfoques actuales de la mejora de procesos y desarrolla nuevos enfoques.";
			break;
		case 12:
			detailValHabil = new String[3];
			detailValHabil[0] = "5 Contribuye a la creaci�n y revisi�n de una estrategia de capacidad de los sistemas que cumpla con las necesidades estrat�gicas comerciales. Desarrolla modelos y planes para impulsar la estrategia, aprovechando de esta manera las oportunidades para mejorar el rendimiento empresarial. Asume la responsabilidad de la labor de investigaci�n para determinar los requisitos y especificar procesos de negocio efectivos, a trav�s de mejoras en los sistemas de informaci�n, administraci�n de datos, pr�cticas, procedimientos, organizaci�n y equipamiento.";
			detailValHabil[1] = "6 Captura y prioriza tendencias del entorno y el mercado, estrategias y objetivos comerciales, e identifica los beneficios comerciales de estrategias alternativas. Establece la contribuci�n que la tecnolog�a puede aportar a los objetivos comerciales, realizando estudios de viabilidad, produciendo modelos de negocio de alto nivel y preparando casos de negocios.Dirige la creaci�n y revisi�n de una estrategia de capacidad de los sistemas que cumpla con los requisitos estrat�gicos de la empresa. Desarrolla una arquitectura y unos procesos que afecten a toda la empresa y que garanticen que la aplicaci�n estrat�gica del cambio se refleja en la gesti�n de la organizaci�n, garantizando la aceptaci�n de todas las partes interesadas sobre iniciativas de alto nivel en relaci�n a la aprobaci�n, financiaci�n y priorizaci�n. Garantiza el cumplimiento entre las estrategias empresariales, las actividades de transformaci�n de la empresa y las instrucciones tecnol�gicas mediante el establecimiento de estrategias, pol�ticas, normas y pr�cticas.";
			detailValHabil[2] = "7 Conduce la creaci�n y revisi�n de la estrategia de capacidad de una empresa para respaldar las necesidades estrat�gicas comerciales. Identifica los beneficios de estrategias alternativas. Dirige el desarrollo de una arquitectura y procesos a nivel empresarial que garantizan que la aplicaci�n estrat�gica del cambio est� integrada en la gesti�n de la organizaci�n. Garantiza el cumplimiento entre las estrategias empresariales, las actividades de transformaci�n de la empresa y las instrucciones tecnol�gicas mediante el establecimiento de estrategias, pol�ticas, normas y pr�cticas.";
			break;
		case 13:
			detailValHabil = new String[4];
			detailValHabil[0] = "Investiga e informa acerca de los peligros y riesgos potenciales dentro de una funci�n o un �mbito empresarial concreto.";
			detailValHabil[1] = "Lleva a cabo la evaluaci�n del riesgo dentro de un �rea funcional o t�cnica definida de las empresas. Utiliza procesos coherentes para la identificaci�n de posibles eventos de riesgo, la cuantificaci�n y documentaci�n de la probabilidad de ocurrencia y el impacto en el negocio. Se refiere a los expertos en el �rea para la orientaci�n especializada en �reas de riesgo, como la arquitectura y el medioambiente. Coordina el desarrollo de las contramedidas y planes de contingencia.";
			detailValHabil[2] = "Planifica y gestiona la aplicaci�n de procesos y procedimientos a nivel de toda la organizaci�n,as� como herramientas y t�cnicas, para la identificaci�n, evaluaci�n y gesti�n de los riesgos inherentes al funcionamiento de los procesos empresariales y de los posibles riesgos que puedan surgir del cambio previsto que permiten las TI.";
			detailValHabil[3] = "Establece la estrategia para abordar los riesgos empresariales que surgen de operaciones de las TI y cambios posibilitados por las TI. Ofrece recursos para poner en pr�ctica la estrategia y delega la autoridad para la planificaci�n detallada y la ejecuci�n de actividades de gesti�n de riesgos.";
			break;
		case 14:
			detailValHabil = new String[2];
			detailValHabil[0] = "Contribuye a la formaci�n de la estrategia, proporcionando un an�lisis detallado de uno o m�s aspectos amplios de la utilizaci�n de energ�a y materiales por parte de la organizaci�n y recomendando elementos de la estrategia; ofrece un asesoramiento completo en el propio campo de especializaci�n. Facilita un an�lisis de los riesgos que surjan en los campos abarcados.";
			detailValHabil[1] = "Ofrece liderazgo y directrices sobre sostenibilidad; conduce al desarrollo de una estrategia de sostenibilidad para las TI, que abarca las fuentes de suministro, el control y la medici�n del uso interno, la obtenci�n de productos y servicios eficientes en materia de recursos, y factores legislativos.";

			break;

		case 15: // Sub categoria 4
			detailValHabil = new String[3];
			detailValHabil[0] = "Mantiene el conocimiento de oportunidades ofrecidas por las nuevas tecnolog�as para abordar desaf�os o permitir nuevas formas de trabajo. Dentro de su propia esfera de influencia, trabaja para conseguir m�s objetivos para la organizaci�n, mediante el uso de productos y tecnolog�as emergentes. Contribuye a las reuniones y presentaciones sobre su relevancia y valor potencial para la organizaci�n.";
			detailValHabil[1] = "Supervisa el mercado para adquirir conocimientos y comprensi�n sobre las tecnolog�as emergentes actuales. Identifica tecnolog�as nuevas y emergentes, como hardware, software y productos en funci�n de su propio campo de especializaci�n, eval�a su relevancia y su valor potencial para la organizaci�n y contribuye a reuniones de informaci�n del personal y el departamento de administraci�n.";
			detailValHabil[2] = "Coordina la identificaci�n y evaluaci�n de tecnolog�as nuevas y emergentes, tales como hardware, software y tecnolog�as de la comunicaci�n, productos, m�todos y t�cnicas. Eval�a la posible relevancia de estas para la organizaci�n. Ofrece sesiones informativas peri�dicas para el personal y el departamento de administraci�n.";
			break;
		case 16:
			detailValHabil = new String[2];
			detailValHabil[0] = "Proporciona la informaci�n para el proceso de planificaci�n de la continuidad del servicio y aplica los planes resultantes.";
			detailValHabil[1] = "Posee el proceso de planificaci�n de la continuidad del servicio y dirige la aplicaci�n de los planes resultantes. Coordina la identificaci�n realizada por especialistas a trav�s de la organizaci�n de sistemas de informaci�n y comunicaci�n que respaldan los procesos empresariales clave, y la evaluaci�n de los riesgos a la disponibilidad, integridad y confidencialidad de esos sistemas. Eval�a los riesgos fundamentales asociados a estos sistemas e identifica las �reas prioritariasde mejora. Coordina la planificaci�n, el dise�o y las pruebas de mantenimiento y planes de contingencia para hacer frente a la exposici�n al riesgo y garantizar que se mantengan los niveles de continuidad acordados.";
			break;
		case 17:
			detailValHabil = new String[3];
			detailValHabil[0] = "Desarrolla y mantiene un conocimiento detallado de la mejora de procesos de software. Contribuye eficazmente a la identificaci�n de nuevas �reas de mejora de procesos de software dentro de la organizaci�n. Lleva a cabo tareas de mejora de procesos de software justificadas mediante beneficios empresariales mensurables.";
			detailValHabil[1] = "Planifica y gestiona la evaluaci�nde los procesos de software. Identifica, propone e inicia actividades de mejora de proceso de software dentro de la organizaci�n, elaborando soluciones. Act�a para aprovechar las oportunidades que tendr�n un efecto mensurable sobre la eficacia operativa, con beneficios asociados para la empresa. Fomenta las ventajas de abordar la seguridad durante el desarrollo de sistemas y aplica pr�cticas de mejora del desarrollo seguro.";
			detailValHabil[2] = "Sirve de enlace con las funciones del cliente para establecer requisitos empresariales e identifica, propone, inicia y lidera programas de mejora significativa. Gestiona la cualidad y adecuaci�n del trabajo realizado y ofrece beneficios empresariales mensurables. Modifica los enfoques existentes de mejora del proceso de software o desarrolla nuevos enfoques para lograr mejoras.";
			break;
		case 18:
			detailValHabil = new String[2];
			detailValHabil[0] = "Planifica y aplica nuevas pr�cticas que garantizan que se abordan cuestiones relacionadas con la sostenibilidad en la especificaci�n, el dise�o y el funcionamiento de sistemas y servicios. Recomienda m�todos, herramientas y pr�cticas que deben utilizarse. Establece pr�cticas para toda la organizaci�n en relaci�n a la eliminaci�n de materiales. Establece est�ndares para la conformidad de los componentes y servicios con el objetivo de lograr un uso eficiente de la energ�a y los materiales.";
			detailValHabil[1] = "Establece el enfoque global de la incorporaci�n de los factores y requisitos de sostenibilidad en la especificaci�n y el dise�o de sistemas y servicios; determina las herramientas y m�todos relevantes que deben utilizarse para abordar cuestiones relacionadas con la eficiencia energ�tica en la especificaci�n, el dise�o y el funcionamiento.";
			break;
		case 19:
			detailValHabil = new String[2];
			detailValHabil[0] = "Crea y mantiene planes de red para su propio �mbito de responsabilidad, contribuye al establecimiento de acuerdos de nivel de servicio y planifica la infraestructura necesaria para prestar servicios de red con el fin de cumplir con dichos acuerdos.";
			detailValHabil[1] = "Crea y mantiene planes de red generales para respaldar la estrategia empresarial de una organizaci�n, establece acuerdos de nivel de servicio con los clientes y planifica todos los aspectos de la infraestructura necesarios para garantizar la prestaci�n de servicios de red con el fin de cumplir con dichos acuerdos.";
			break;
		case 20:
			detailValHabil = new String[2];
			detailValHabil[0] = "Utiliza instrumentos adecuados, incluyendo modelos l�gicos de componentes e interfaces, para contribuir al desarrollo de arquitecturas de sistemas �reas funcionales o empresariales. Produce especificaciones detalladas de componentes y las transforma en dise�os detallados para la aplicaci�n utilizando productos seleccionados. Dentro de un programa de cambio empresarial, ayuda en la preparaci�n de planes t�cnicos y colabora con el personal de garant�a empresarial y proyectos para garantizar que est�n disponibles los recursos t�cnicos apropiados. Proporciona asesoramiento sobre aspectos t�cnicos de desarrollo e integraci�n del sistema (incluyendo solicitudes de cambios, desviaciones de las especificaciones, etc.) y garantiza que las estrategias t�cnicas, pol�ticas, normas y pr�cticas se apliquen correctamente.";
			detailValHabil[1] = "Dirige el desarrollo de arquitecturas para sistemas complejos, garantizando la uniformidad con los requisitos especificados acordados tanto con los clientes externos como internos. Asume toda la responsabilidad del equilibrio entre la calidad funcional del servicio y los requisitos de gesti�n de sistemas dentro de un �rea importante de la organizaci�n. Establece la pol�tica y estrategia para la selecci�n de componentes de la arquitectura de sistemas y coordina las actividades de dise�o, fomentando la disciplina para garantizar la uniformidad. Garantiza que se cumplan las normas apropiadas (corporativas, industriales, nacionales e internacionales). Dentro de un programada de cambio empresarial, gestiona el dise�o del objetivo, las pol�ticas y normas, trabajando proactivamente para mantener una arquitectura estable y viable y garantizar la uniformidad del dise�o a trav�s de proyectos dentro del programa.";
			break;
		case 21:
			detailValHabil = new String[3];
			detailValHabil[0] = "Asume la responsabilidad de la accesibilidad, recuperabilidad y seguridad de grupos de informaci�n concretos. Proporciona asesoramiento sobre la transformaci�n de informaci�n de un formato/medio a otro, si es necesario. Mantiene y aplica procedimientos de tratamiento de la informaci�n. Permite la disponibilidad, integridad y trazabilidad de la informaci�n mediante la aplicaci�n de estructuras de datos formales y medidas de protecci�n. Maneja datos concretos de servicios de informaci�n para satisfacer necesidades informativas locales o concretas.";
			detailValHabil[1] = "Planifica un almacenamiento, intercambio y publicaci�n efectivos de informaci�n dentro de la organizaci�n. Eval�a problemas (como las `Islas de informaci�n`) que pueden impedir a la organizaci�n sacar el m�ximo partido a sus activos de informaci�n. Obtiene estructuras de gesti�n de datos para garantizar la recuperaci�n, la combinaci�n, el an�lisis, el reconocimiento de modelos y la interpretaci�n coherentes de la informaci�n dentro de la organizaci�n. Idea y aplica sistemas de registro de documentaci�n, incluyendo procesos de clasificaci�n, seguridad recuperaci�n y retenci�n.";
			detailValHabil[2] = "A partir de la comprensi�n de la empresa actual y futura, obtiene una estrategia global de gesti�n de datos, dentro de una Arquitectura de la informaci�n establecida, que respalda el modelo empresarial. Identifica estructuras de informaci�n y detalles para permitir el desarrollo y el funcionamiento seguro de nuevos servicios de informaci�n. Asume la responsabilidad global de la planificaci�n del almacenamiento, intercambio y publicaci�n efectivos de informaci�n dentro de la organizaci�n.";
			break;
		case 22:
			detailValHabil = new String[3];
			detailValHabil[0] = "Proporciona conocimiento y apoyo en el uso de m�todos y herramientas.";
			detailValHabil[1] = "Fomenta y garantiza el uso de t�cnicas, metodolog�as y herramientas adecuadas.";
			detailValHabil[2] = "6 Establece la direcci�n y dirige la introducci�n y el uso de t�cnicas, metodolog�as y herramientas, que coincidan con los requisitos empresariales generales (tanto actuales como futuros), garantizando as� la uniformidad en todos los grupos de usuarios.";
			break;
			
		//CATEGORIA 1:
		case 23://Sub Categoria 1
			detailValHabil = new String[3];
			break;
		case 24:
			detailValHabil = new String[3];
			break;
		default:
			detailValHabil = new String[3];
			detailValHabil[0] = "Coming Soon";
			detailValHabil[1] = "Coming Soon";
			detailValHabil[2] = "Coming Soon";
			break;
		}
		return detailValHabil;
	}
}
