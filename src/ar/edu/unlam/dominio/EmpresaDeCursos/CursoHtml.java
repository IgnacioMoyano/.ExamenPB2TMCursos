package ar.edu.unlam.dominio.EmpresaDeCursos;

public class CursoHtml extends Curso {

	private static final String CODIGO_PARA_HTML = "HTML";

	private static final Integer CANTIDAD_CLASES_HTML = 15;
	private static final Integer PRECIO_HTML = 7500;

	private static final Integer EDAD_MINIMA_HTML = 20;
	private static final Integer EDAD_MAXIMA_HTML = 35;

	public CursoHtml() {
		super();
		this.clases = CANTIDAD_CLASES_HTML;
		this.precio = PRECIO_HTML;
		this.codigoCurso = CODIGO_PARA_HTML;
	}

	@Override
	public boolean edadRequeridaParaCursar(Alumno alumno) {
		Boolean esValido = false;

		if (alumno.getEdad() >= EDAD_MINIMA_HTML && alumno.getEdad() <= EDAD_MAXIMA_HTML) {
			esValido = true;
		}

		return esValido;
	}
}
