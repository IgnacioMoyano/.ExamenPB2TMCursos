package ar.edu.unlam.dominio.EmpresaDeCursos;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSePuedaCrearUnAlumno() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer nota = 0;
		LocalDate edad = LocalDate.of(1994, 04, 3);

		alumno = new Alumno(nombre, apellido, edad);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		assertNotNull(alumno);
	}

	@Test
	public void queElAlumnoApruebeSiLasNotasSonMayores7() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer notaPrimerParcial = 8;
		Integer notaSegundoParcial = 9;
		Integer asistencias = 11;
		LocalDate edad = LocalDate.of(1994, 04, 3);
		CondicionNota condicionEsperada = CondicionNota.APROBADO;
		CursoHtml curso;
		alumno = new Alumno(nombre, apellido, edad);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		alumno.setNotaPrimerParcial(notaPrimerParcial);
		alumno.setNotaSegundoParcial(notaSegundoParcial);
		alumno.setAsistencias(asistencias);

		curso = new CursoHtml();

		alumno.condicion(curso);
		assertEquals(condicionEsperada, alumno.getCondicion());

	}

	@Test
	public void queElAlumnoDesapruebeSiLasNotasSonMenoresA4() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer notaPrimerParcial = 3;
		Integer notaSegundoParcial = 2;
		LocalDate edad = LocalDate.of(1994, 04, 3);
		CondicionNota condicionEsperada = CondicionNota.DESAPROBADO;
		CursoHtml curso;
		alumno = new Alumno(nombre, apellido, edad);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		alumno.setNotaPrimerParcial(notaPrimerParcial);
		alumno.setNotaSegundoParcial(notaSegundoParcial);

		curso = new CursoHtml();

		alumno.condicion(curso);
		assertEquals(condicionEsperada, alumno.getCondicion());

	}

	@Test
	public void queElAlumnoVayaAFinalSiSoloLaPrimeraNotaEstaAprobada() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer notaPrimerParcial = 9;
		Integer notaSegundoParcial = 5;
		Integer asistencias = 11;
		LocalDate fechaNacimiento = LocalDate.of(1994, 04, 3);

		nombre = "Nicolas";
		apellido = "Figal";
		dni = 32574859;
		email = "nicoFigal@gmail.com";
		telefono = "+541123345678";
		fechaNacimiento = LocalDate.of(1994, 04, 3);

		CondicionNota condicionEsperada = CondicionNota.FINAL;
		CursoHtml curso;

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		alumno.setNotaPrimerParcial(notaPrimerParcial);
		alumno.setNotaSegundoParcial(notaSegundoParcial);
		alumno.setAsistencias(asistencias);

		curso = new CursoHtml();

		alumno.condicion(curso);

		assertEquals(condicionEsperada, alumno.getCondicion());

	}

	@Test
	public void queElAlumnoVayaAFinalSiSoloLaSegundaNotaEstaAprobada() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer notaPrimerParcial = 4;
		Integer notaSegundoParcial = 10;
		Integer asistencias = 11;
		LocalDate edad = LocalDate.of(1994, 04, 3);
		CursoHtml curso;
		alumno = new Alumno(nombre, apellido, edad);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		alumno.setNotaPrimerParcial(notaPrimerParcial);
		alumno.setNotaSegundoParcial(notaSegundoParcial);
		alumno.setAsistencias(asistencias);
		CondicionNota condicionEsperada = CondicionNota.FINAL;

		curso = new CursoHtml();

		alumno.condicion(curso);
		assertEquals(condicionEsperada, alumno.getCondicion());

	}

	@Test
	public void queElAlumnoTengaLasAsistenciasParaAprobar() {
		Alumno alumno;
		String nombre = "Nicolas";
		String apellido = "Figal";
		Integer dni = 32574859;
		String email = "nicoFigal@gmail.com";
		String telefono = "+541123345678";
		Integer notaPrimerParcial = 4;
		Integer notaSegundoParcial = 10;
		Integer asistencias = 11;
		LocalDate edad = LocalDate.of(1994, 04, 3);
		CursoHtml curso;

		alumno = new Alumno(nombre, apellido, edad);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		alumno.setAsistencias(asistencias);

		curso = new CursoHtml();

		assertTrue(alumno.validarCantidadDeAsistencias(curso));

	}
}
