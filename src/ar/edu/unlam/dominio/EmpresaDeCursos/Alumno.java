package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.time.LocalDate;

public class Alumno extends Persona {
	private Integer notaPrimerParcial;
	private Integer notaSegundoParcial;
	private LocalDate fechaDeNacimiento;
	private CondicionNota condicion;

	public Alumno(String nombre, String apellido, LocalDate edad) {
		super(nombre, apellido);
		this.fechaDeNacimiento = edad;
	}

	public Alumno(String nombre, String apellido, Integer dni, String email, String telefono, LocalDate edad) {
		super(nombre, apellido, dni, email, telefono);
		this.fechaDeNacimiento = edad;
	}

	public void condicion(Integer notaPrimerParcial, Integer notaSegundoParcial) {

		if (notaPrimerParcial >= 7 && notaSegundoParcial >= 7) {
			setCondicion(condicion.APROBADO);
		}
		if (notaPrimerParcial < 4 || notaSegundoParcial < 4) {
			setCondicion(condicion.DESAPROBADO);
		}
		if (notaPrimerParcial >= 7 && notaSegundoParcial >= 4 && notaSegundoParcial < 7) {
			setCondicion(condicion.FINAL);
		}

		if (notaPrimerParcial >= 4 && notaSegundoParcial >= 7 && notaPrimerParcial < 7) {
			setCondicion(condicion.FINAL);
		}
	}

	public Integer getNotaPrimerParcial() {
		return notaPrimerParcial;
	}

	public void setNotaPrimerParcial(Integer notaPrimerParcial) {
		this.notaPrimerParcial = notaPrimerParcial;
	}

	public Integer getNotaSegundoParcial() {
		return notaSegundoParcial;
	}

	public void setNotaSegundoParcial(Integer notaSegundoParcial) {
		this.notaSegundoParcial = notaSegundoParcial;
	}

	public CondicionNota getCondicion() {
		return condicion;
	}

	public void setCondicion(CondicionNota condicion) {
		this.condicion = condicion;
	}

	public Integer getEdad() {
		
		LocalDate fechaActual = LocalDate.now();
		Integer edad;
		
		edad =  fechaActual.getYear() - this.fechaDeNacimiento.getYear();
		
		if (fechaDeNacimiento.getDayOfYear() < fechaActual.getDayOfYear()) {
			edad--;
		}
		
		return edad;
	}

	public void setEdad(LocalDate edad) {
		this.fechaDeNacimiento = edad;
	}

}
