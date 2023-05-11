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
	public void queSePuedaCrearUnCursoCSS() {

		CursoCss css;

		css = new CursoCss();

		assertNotNull(css);
	}

	@Test
	public void queSePuedaCrearUnCursoJAVA() {

		CursoJava java;

		java = new CursoJava();

		assertNotNull(java);
	}

	@Test
	public void queSePuedaAñadirUnAlumnoACursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoHtml cursoHtml;

		cantidadDeAlumnosEsperados = 1;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cursoHtml = new CursoHtml();
		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoHtml.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirUnAlumnoACursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoCss cursoCss;

		cantidadDeAlumnosEsperados = 1;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cursoCss = new CursoCss();
		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoCss.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirUnAlumnoACursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoJava cursoJava;

		cantidadDeAlumnosEsperados = 1;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cursoJava = new CursoJava();
		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoJava.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirMasDeUnAlumnoEnCursoHTML() {
		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoHtml cursoHtml;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 4;

		cursoHtml = new CursoHtml();

		Integer datosAux = 0;

		for (int i = 0; i < 4; i++) {
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			datosAux++;
			cursoHtml.añadirAlumnos(alumno);
		}

		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirMasDeUnAlumnoEnCursoCSS() {
		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoCss cursoCss;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 4;

		cursoCss = new CursoCss();

		Integer datosAux = 0;

		for (int i = 0; i < 4; i++) {
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			datosAux++;
			cursoCss.añadirAlumnos(alumno);
		}

		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirMasDeUnAlumnoEnCursoJAVA() {
		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoJava cursoJava;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 4;

		cursoJava = new CursoJava();

		Integer datosAux = 0;

		for (int i = 0; i < 4; i++) {
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			datosAux++;
			cursoJava.añadirAlumnos(alumno);
		}

		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinDniValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoHtml cursoHtml;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 404027052;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoHtml = new CursoHtml();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoHtml.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinDniValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoCss cursoCss;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 404027052;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoCss = new CursoCss();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoCss.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinDniValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoJava cursoJava;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 404027052;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoJava = new CursoJava();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		cursoJava.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinEmailValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoHtml cursoHtml;

		cantidadDeAlumnosEsperados = 0;
		cursoHtml = new CursoHtml();
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla%gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoHtml.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinEmailValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoCss cursoCss;

		cantidadDeAlumnosEsperados = 0;
		cursoCss = new CursoCss();
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla%gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoCss.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinEmailValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoJava cursoJava;

		cantidadDeAlumnosEsperados = 0;
		cursoJava = new CursoJava();
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla%gmail.com";
		telefono = "+541128341522";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoJava.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinTelefonoValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoHtml cursoHtml;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+5411283415222";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoHtml = new CursoHtml();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoHtml.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinTelefonoValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoCss cursoCss;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+5411283415222";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoCss = new CursoCss();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoCss.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedaAñadirUnAlumnoSinTelefonoValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		final Integer cantidadDeAlumnosEsperados;
		final LocalDate fechaNacimiento;
		Alumno alumno;
		CursoJava cursoJava;

		cantidadDeAlumnosEsperados = 0;
		nombre = "Sebastian";
		apellido = "Villa";
		dni = 40402705;
		email = "ElAlumnoVilla@gmail.com";
		telefono = "+5411283415222";
		fechaNacimiento = LocalDate.of(1996, 5, 19);

		alumno = new Alumno(nombre, apellido, fechaNacimiento);

		cursoJava = new CursoJava();

		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarTelefono(telefono);

		cursoJava.añadirAlumnos(alumno);

		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

	@Test
	public void queSePuedaAñadirUnProfesorEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoHtml cursoHtml;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 20206295;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoHtml = new CursoHtml();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarYAgregarTelefono(telefono);

		cursoHtml.añadirProfesor(profesor);

		assertEquals(profesor, cursoHtml.getProfesor());
	}

	@Test
	public void queSePuedaAñadirUnProfesorEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoCss cursoCss;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 20206295;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoCss = new CursoCss();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarYAgregarTelefono(telefono);

		cursoCss.añadirProfesor(profesor);

		assertEquals(profesor, cursoCss.getProfesor());
	}

	@Test
	public void queSePuedaAñadirUnProfesorEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoJava cursoJava;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 20206295;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoJava = new CursoJava();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarYAgregarTelefono(telefono);

		cursoJava.añadirProfesor(profesor);

		assertEquals(profesor, cursoJava.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinDniValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoHtml cursoHtml;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoHtml = new CursoHtml();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoHtml.añadirProfesor(profesor);

		assertNull(cursoHtml.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinDniValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoCss cursoCss;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoCss = new CursoCss();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoCss.añadirProfesor(profesor);

		assertNull(cursoCss.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinDniValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoJava cursoJava;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoJava = new CursoJava();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoJava.añadirProfesor(profesor);

		assertNull(cursoJava.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinEmailValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoHtml cursoHtml;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron%gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoHtml = new CursoHtml();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoHtml.añadirProfesor(profesor);

		assertNull(cursoHtml.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinEmailValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoCss cursoCss;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron%gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoCss = new CursoCss();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoCss.añadirProfesor(profesor);

		assertNull(cursoCss.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinEmailValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;
		Profesor profesor;
		CursoJava cursoJava;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron%gmail.com";
		telefono = "+541128341574";

		profesor = new Profesor(nombre, apellido);
		cursoJava = new CursoJava();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoJava.añadirProfesor(profesor);

		assertNull(cursoJava.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinTelefonoValidoEnCursoHTML() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;

		Profesor profesor;
		CursoHtml cursoHtml;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+5411283415745";

		profesor = new Profesor(nombre, apellido);
		cursoHtml = new CursoHtml();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoHtml.añadirProfesor(profesor);

		assertNull(cursoHtml.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinTelefonoValidoEnCursoCSS() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;

		Profesor profesor;
		CursoCss cursoCss;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+5411283415745";

		profesor = new Profesor(nombre, apellido);
		cursoCss = new CursoCss();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoCss.añadirProfesor(profesor);

		assertNull(cursoCss.getProfesor());
	}

	@Test
	public void queNoSePuedaAñadirUnProfesorSinTelefonoValidoEnCursoJAVA() {
		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;

		Profesor profesor;
		CursoJava cursoJava;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+5411283415745";

		profesor = new Profesor(nombre, apellido);
		cursoJava = new CursoJava();

		profesor.validarYAgregarDni(dni);
		profesor.validarYAgregarEmail(email);
		profesor.validarTelefono(telefono);

		cursoJava.añadirProfesor(profesor);

		assertNull(cursoJava.getProfesor());
	}

	@Test
	public void queNoSePuedanAgregarMasDeDiezPersonasAUnCursoHTML() {

		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoHtml cursoHtml;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 10;

		cursoHtml = new CursoHtml();

		Integer datosAux = 0;
		// Intenta agregar 11 alumnos
		for (int i = 0; i < 11; i++) {
			datosAux++;
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			cursoHtml.añadirAlumnos(alumno);
		}

		// Comprueba que el ultimo alumno no se agrega xq no hay mas tamaño
		assertEquals(cantidadDeAlumnosEsperados, cursoHtml.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedanAgregarMasDeDiezPersonasAUnCursoCSS() {

		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoCss cursoCss;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 10;

		cursoCss = new CursoCss();

		Integer datosAux = 0;
		// Intenta agregar 11 alumnos
		for (int i = 0; i < 11; i++) {
			datosAux++;
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			cursoCss.añadirAlumnos(alumno);
		}

		// Comprueba que el ultimo alumno no se agrega xq no hay mas tamaño
		assertEquals(cantidadDeAlumnosEsperados, cursoCss.cantidadAlumnos());
	}

	@Test
	public void queNoSePuedanAgregarMasDeDiezPersonasAUnCursoJAVA() {

		final LocalDate fechaNacimiento;
		Integer cantidadDeAlumnosEsperados;

		Alumno alumno;
		CursoJava cursoJava;

		fechaNacimiento = LocalDate.of(1996, 5, 19);
		cantidadDeAlumnosEsperados = 10;

		cursoJava = new CursoJava();

		Integer datosAux = 0;
		// Intenta agregar 11 alumnos
		for (int i = 0; i < 11; i++) {
			datosAux++;
			alumno = new Alumno(datosAux.toString(), datosAux.toString(), datosAux, datosAux.toString(),
					datosAux.toString(), fechaNacimiento);
			cursoJava.añadirAlumnos(alumno);
		}

		// Comprueba que el ultimo alumno no se agrega xq no hay mas tamaño
		assertEquals(cantidadDeAlumnosEsperados, cursoJava.cantidadAlumnos());
	}

}
