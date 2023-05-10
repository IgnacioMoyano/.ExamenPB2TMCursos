package ar.edu.unlam.dominio.EmpresaDeCursos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProfesor {

	@Test
	public void QueSePuedaCrearUnProfesor() {

		final String nombre;
		final String apellido;
		final Integer dni;
		final String email;
		final String telefono;

		nombre = "Jorge";
		apellido = "Almiron";
		dni = 202062955;
		email = "ElProfeAlmiron@gmail.com";
		telefono = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido, dni, email, telefono);

		assertNotNull(profesor);

	}

	@Test
	public void QueNoSePuedaAgregarUnDniSiNoContieneOchoCaracteres() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 202062985;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertNull(dniProfesor);

	}

	@Test
	public void QueSePuedaAgregarUnDniSiNoContieneOchoCaracteres() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertEquals(dniEsperado, dniProfesor);

	}

	@Test
	public void QueNoSePuedaAgregarUnEmailSiNoContieneArroba() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmirongmail.com";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertNull(emailProfesor);

	}
	
	@Test
	public void QueNoSePuedaAgregarUnEmailSiNoTerminaEnPuntoCom() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertNull(emailProfesor);

	}
	
	@Test
	public void QueSePuedaAgregarUnEmailSiContieneArrobaYTerminaEnPuntoCom() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertEquals(emailEsperado, emailProfesor);

	}
	
	@Test
	public void QueNoSePuedaAgregarUnTelefonoSiNoContieneCodigoDeAreaMasCincuentaYCuatro() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "1128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertNull(telefonoProfesor);

	}
	
	@Test
	public void QueNoSePuedaAgregarUnTelefonoSiNoTieneTreceNumerosDeLargo() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "+54112834174";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertNull(telefonoProfesor);

	}

	@Test
	public void QueSePuedaAgregarUnTelefonoSiContieneCodigoDeAreaMasCincuentaYCuatroYTieneTreceDeLargo() {

		final String nombre;
		final String apellido;
		final Integer dniEsperado;
		final Integer dniProfesor;
		final String emailEsperado;
		final String emailProfesor;
		final String telefonoEsperado;
		final String telefonoProfesor;

		nombre = "Jorge";
		apellido = "Almiron";
		dniEsperado = 20206295;
		emailEsperado = "ElProfeAlmiron@gmail.com";
		telefonoEsperado = "+541128341574";

		Profesor profesor = new Profesor(nombre, apellido);

		profesor.validarYAgregarDni(dniEsperado);
		dniProfesor = profesor.getDni();

		profesor.validarYAgregarEmail(emailEsperado);
		emailProfesor = profesor.getEmail();

		profesor.validarYAgregarTelefono(telefonoEsperado);
		telefonoProfesor = profesor.getTelefono();

		assertEquals(telefonoEsperado, telefonoProfesor);

	}
	
}
