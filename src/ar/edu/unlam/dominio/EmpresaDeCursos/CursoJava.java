package ar.edu.unlam.dominio.EmpresaDeCursos;

public class CursoJava extends Curso {

	private static final Integer CANTIDAD_CLASES_JAVA = 10;
	private static final Integer PRECIO_JAVA = 5000;

	private static final Integer EDAD_MINIMA_JAVA = 15;
	private static final Integer EDAD_MAXIMA_JAVA = 30;

	public CursoJava() {
		super();
		this.clases = CANTIDAD_CLASES_JAVA;
		this.precio = PRECIO_JAVA;
	}

	@Override
	public boolean edadRequeridaParaCursar(Alumno alumno) {
		Boolean esValido = false;

		if (alumno.getEdad() >= EDAD_MINIMA_JAVA && alumno.getEdad() <= EDAD_MAXIMA_JAVA) {
			esValido = true;
		}

		return esValido;
	}

}
