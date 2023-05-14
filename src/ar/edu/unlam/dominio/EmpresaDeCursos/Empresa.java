package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Empresa {

	private static final String CODIGO_PARA_JAVA = "JAVA";
	private static final String CODIGO_PARA_CSS = "CSS";
	private static final String CODIGO_PARA_HTML = "HTML";

	LinkedHashSet<Curso> cursosHtml;
	LinkedHashSet<Curso> cursosCss;
	LinkedHashSet<Curso> cursosJava;

	public Empresa() {
		this.cursosHtml = new LinkedHashSet<>();
		this.cursosCss = new LinkedHashSet<>();
		this.cursosJava = new LinkedHashSet<>();
	}

	public void agregarCurso(Curso curso) {

		if (curso.getPrecio() != null && curso.getClases() != null) {

			if (curso.codigoCurso.equals(CODIGO_PARA_JAVA)) {
				curso.setCodigoCurso(CODIGO_PARA_JAVA + (cursosJava.size() + 1));
				cursosJava.add(curso);
			} else {

				if (curso.codigoCurso.equals(CODIGO_PARA_CSS)) {
					curso.setCodigoCurso(CODIGO_PARA_CSS + (cursosCss.size() + 1));
					cursosCss.add(curso);
				} else {

					if (curso.codigoCurso.equals(CODIGO_PARA_HTML)) {
						curso.setCodigoCurso(CODIGO_PARA_HTML + (cursosHtml.size() + 1));
						cursosHtml.add(curso);
					}

				}

			}

		}
	}

	public Integer cantidadCursosJava() {
		return cursosJava.size();
	}

	public Integer cantidadCursosCss() {
		return cursosCss.size();
	}

	public Integer cantidadCursosHtml() {
		return cursosHtml.size();
	}
}
