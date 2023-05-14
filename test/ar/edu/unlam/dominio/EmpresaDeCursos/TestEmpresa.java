package ar.edu.unlam.dominio.EmpresaDeCursos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestEmpresa {

	@Test
	public void SePuedeCrearUnaEmpresa() {
		Empresa empresa;

		empresa = new Empresa();

		assertNotNull(empresa);
	}

	@Test
	public void siSePuedeAñadirUnCursoJava() {
		Empresa empresa;
		CursoJava curso;
		Integer cantidadCursoEsperado = 1;

		curso = new CursoJava();
		empresa = new Empresa();

		empresa.agregarCurso(curso);

		assertEquals(cantidadCursoEsperado, empresa.cantidadCursosJava());

	}

	@Test
	public void siSePuedeAñadirUnCursoCss() {
		Empresa empresa;
		CursoCss curso;
		Integer cantidadCursoEsperado = 1;

		curso = new CursoCss();
		empresa = new Empresa();

		empresa.agregarCurso(curso);

		assertEquals(cantidadCursoEsperado, empresa.cantidadCursosCss());

	}

	@Test
	public void siSePuedeAñadirUnCursoHtml() {
		Empresa empresa;
		CursoHtml curso;
		Integer cantidadCursoEsperado = 1;

		curso = new CursoHtml();
		empresa = new Empresa();

		empresa.agregarCurso(curso);

		assertEquals(cantidadCursoEsperado, empresa.cantidadCursosHtml());

	}

	@Test
	public void queElCodigoDelPrimerCursosSeAgregueSeaCorrecto() {
		Empresa empresa;
		CursoHtml curso;
		String codigoCursoEsperado = "HTML1";

		curso = new CursoHtml();
		empresa = new Empresa();

		empresa.agregarCurso(curso);

		assertEquals(codigoCursoEsperado, curso.codigoCurso);

	}

	@Test
	public void queElCodigoDelSegundoCursosSeAgregueSeaCorrecto() {
		Empresa empresa;
		CursoHtml curso;
		CursoHtml curso2;
		String codigoCursoEsperado = "HTML2";

		curso = new CursoHtml();
		curso2 = new CursoHtml();
		empresa = new Empresa();

		empresa.agregarCurso(curso);
		empresa.agregarCurso(curso2);

		assertEquals(codigoCursoEsperado, curso2.codigoCurso);

	}
}
