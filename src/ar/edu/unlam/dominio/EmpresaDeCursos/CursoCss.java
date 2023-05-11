package ar.edu.unlam.dominio.EmpresaDeCursos;

public class CursoCss extends Curso {

	private static final Integer CANTIDAD_CLASES_CSS = 20;
	private static final Integer PRECIO_CSS = 1000;

	private static final Integer EDAD_MINIMA_CSS = 25;
	private static final Integer EDAD_MAXIMA_CSS = 40;

	public CursoCss() {
		super();
		this.clases = CANTIDAD_CLASES_CSS;
		this.precio = PRECIO_CSS;
	}

	@Override
	public boolean edadRequeridaParaCursar(Alumno alumno) {
		Boolean esValido = false;

		if (alumno.getEdad() >= EDAD_MINIMA_CSS && alumno.getEdad() <= EDAD_MAXIMA_CSS) {
			esValido = true;
		}

		return esValido;
	}
}
