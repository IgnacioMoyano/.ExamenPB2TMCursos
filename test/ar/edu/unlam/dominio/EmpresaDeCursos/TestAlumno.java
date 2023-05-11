package ar.edu.unlam.dominio.EmpresaDeCursos;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class TestAlumno {

	@Test
	public void queSePuedaCrearUnAlumno() {
		Alumno alumno;
		String nombre="Nicolas";
		String apellido="Figal";
		Integer dni=32574859;
		String email="nicoFigal@gmail.com";
		String telefono="+541123345678";
		Integer nota=0;
		LocalDate edad= LocalDate.of(1994,04, 3) ;
		
		alumno= new Alumno(nombre, apellido, edad);
		
		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);
		
		assertNotNull(alumno);
	}
	
	
	@Test
	public void queElAlumnoApruebeSiLasNotasSonMayores7() {
		Alumno alumno;
		String nombre="Nicolas";
		String apellido="Figal";
		Integer dni=32574859;
		String email="nicoFigal@gmail.com";
		String telefono="+541123345678";
		Integer notaPrimerParcial=8;
		Integer notaSegundoParcial=9;
		LocalDate edad= LocalDate.of(1994,04, 3) ;
		
		alumno= new Alumno(nombre, apellido, edad);
		
		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);
		

		
		CondicionNota condicionEsperada= CondicionNota.APROBADO;
		alumno.condicion(notaPrimerParcial,notaSegundoParcial);
		assertEquals(condicionEsperada,alumno.getCondicion() );
		
	
		
	}
	
	
	
	@Test
	public void queElAlumnoDesapruebeSiLasNotasSonMenoresA4() {
		Alumno alumno;
		String nombre="Nicolas";
		String apellido="Figal";
		Integer dni=32574859;
		String email="nicoFigal@gmail.com";
		String telefono="+541123345678";
		Integer notaPrimerParcial=3;
		Integer notaSegundoParcial=2;
		LocalDate edad= LocalDate.of(1994,04, 3) ;
		
		alumno= new Alumno(nombre, apellido, edad);
		
		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);

		
		CondicionNota condicionEsperada= CondicionNota.DESAPROBADO;
		alumno.condicion(notaPrimerParcial,notaSegundoParcial);
		assertEquals(condicionEsperada,alumno.getCondicion() );
		
	
		
	}
	
	
	@Test
	public void queElAlumnoVayaAFinalSiSoloLaPrimeraNotaEstaAprobada() {
		Alumno alumno;
		String nombre="Nicolas";
		String apellido="Figal";
		Integer dni=32574859;
		String email="nicoFigal@gmail.com";
		String telefono="+541123345678";
		Integer notaPrimerParcial=9;
		Integer notaSegundoParcial=5;
		LocalDate fechaNacimiento= LocalDate.of(1994,04, 3) ;
		
		nombre="Nicolas";
		apellido="Figal";
		dni=32574859;
		email="nicoFigal@gmail.com";
		telefono="+541123345678";
		fechaNacimiento= LocalDate.of(1994,04, 3) ;
		
		alumno= new Alumno(nombre, apellido, fechaNacimiento);
		
		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);
		
		CondicionNota condicionEsperada= CondicionNota.FINAL;
		alumno.condicion(notaPrimerParcial,notaSegundoParcial);
		assertEquals(condicionEsperada,alumno.getCondicion() );
		
	
		
	}
	
	
	@Test
	public void queElAlumnoVayaAFinalSiSoloLaSegundaNotaEstaAprobada() {
		Alumno alumno;
		String nombre="Nicolas";
		String apellido="Figal";
		Integer dni=32574859;
		String email="nicoFigal@gmail.com";
		String telefono="+541123345678";
		Integer notaPrimerParcial=4;
		Integer notaSegundoParcial=10;
		LocalDate edad= LocalDate.of(1994,04, 3) ;
		
		alumno= new Alumno(nombre, apellido, edad);
		
		alumno.validarYAgregarDni(dni);
		alumno.validarYAgregarEmail(email);
		alumno.validarYAgregarTelefono(telefono);
	

		
		CondicionNota condicionEsperada= CondicionNota.FINAL;
		alumno.condicion(alumno);
		assertEquals(condicionEsperada,alumno.getCondicion() );
		
	
		
	}

	
	    @Test
	    public void queElAlumnoTengaLasAsistenciasParaAprobar() {
	    	Alumno alumno;
			String nombre="Nicolas";
			String apellido="Figal";
			Integer dni=32574859;
			String email="nicoFigal@gmail.com";
			String telefono="+541123345678";
			Integer notaPrimerParcial=4;
			Integer notaSegundoParcial=10;
			Integer asistencias=7;
			LocalDate edad= LocalDate.of(1994,04, 3) ;
			
			final TipoCurso tipoCurso;
			tipoCurso = TipoCurso.HTML;
			
			alumno= new Alumno(nombre, apellido, edad);
			
			alumno.validarYAgregarDni(dni);
			alumno.validarYAgregarEmail(email);
			alumno.validarYAgregarTelefono(telefono);
	        
			alumno.setAsistencias(asistencias);
			
			Curso curso = new Curso(tipoCurso);
		
	      assertTrue(alumno.validarCantidadDeAsistencias(alumno,curso));
			
	    }
}
