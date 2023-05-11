package ar.edu.unlam.dominio.EmpresaDeCursos;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestCurso {

	@Test
	public void queSePuedaCrearUnCursoHTML() {

		CursoHtml html;

		html = new CursoHtml();

		assertNotNull(html);
	}

	@Test
	public void queSePuedaAñadirUnAlumno() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		Curso curso;

		cantidadDeAlumnosEsperados = 1;
		tipoCurso = TipoCurso.HTML;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		curso = new Curso(tipoCurso);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		curso.añadirAlumnos(alumno, tipoCurso);

		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirMasDeUnAlumno() {
		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		Alumno alumno;
		Curso curso;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 4;
		tipoCurso = TipoCurso.HTML;
		curso = new Curso(tipoCurso);

		Integer datosAux = 0;

		for (int i = 0; i < 4; i++) {
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			datosAux++;
			curso.añadirAlumnos(alumno, tipoCurso);
		}

		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinDniValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		Curso curso;

		cantidadDeAlumnosEsperados = 0;
		tipoCurso = TipoCurso.HTML;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 404027052;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		curso = new Curso(tipoCurso);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		curso.añadirAlumnos(alumno, tipoCurso);

		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinEmailValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		Curso curso;

		cantidadDeAlumnosEsperados = 0;
		tipoCurso = TipoCurso.HTML;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla%gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		curso = new Curso(tipoCurso);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		curso.añadirAlumnos(alumno, tipoCurso);

		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinTelefonoValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		Curso curso;

		cantidadDeAlumnosEsperados = 0;
		tipoCurso = TipoCurso.HTML;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+5411283415222";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		curso = new Curso(tipoCurso);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		curso.añadirAlumnos(alumno, tipoCurso);

		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirUnProfesor() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final TipoCurso tipoCurso;
		Profesor profesor;
		Curso curso;

		tipoCurso = TipoCurso.HTML;
		nombre = "Jorge";
		apellido = "Almiron";
		dni = 20206295;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		curso = new Curso(tipoCurso);

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarYAgregarTelefono(telefono);

		curso.añadirProfesor(profesor);

		assertEquals(profesor, curso.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinDniValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final TipoCurso tipoCurso;
		Profesor profesor;
		Curso curso;

		tipoCurso = TipoCurso.HTML;
		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		curso = new Curso(tipoCurso);

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		curso.añadirProfesor(profesor);

		assertNull(curso.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinEmailValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final TipoCurso tipoCurso;
		Profesor profesor;
		Curso curso;

		tipoCurso = TipoCurso.HTML;
		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron%gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		curso = new Curso(tipoCurso);

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		curso.añadirProfesor(profesor);

		assertNull(curso.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinTelefonoValido() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final TipoCurso tipoCurso;
		Profesor profesor;
		Curso curso;

		tipoCurso = TipoCurso.HTML;
		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+5411283415745";

		profesor = new Profesor(nombre, apellido);
		curso = new Curso(tipoCurso);

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		curso.añadirProfesor(profesor);

		assertNull(curso.getProfesor());
	}

	@Test
	public void queNoSePuedanAgregarMasDeDiezPersonasAUnCurso() {

		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;
		final TipoCurso tipoCurso;
		Alumno alumno;
		Curso curso;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 10;
		tipoCurso = TipoCurso.HTML;
		curso = new Curso(tipoCurso);

		Integer datosAux = 0;
		// Intenta agregar 11 alumnos
		for (int i = 0; i < 11; i++) {
			datosAux++;
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			curso.añadirAlumnos(alumno, tipoCurso);
		}

		// Comprueba que el ultimo alumno no se agrega xq no hay mas tamaño
		assertEquals(cantidadDeAlumnosEsperados, curso.cantidadAlumnos());
	}

}
