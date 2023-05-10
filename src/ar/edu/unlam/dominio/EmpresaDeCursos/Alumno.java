package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.time.LocalDate;
import java.util.Set;

public class Alumno extends Persona {
	private Integer notaPrimerParcial;
	private Integer notaSegundoParcial;
	private LocalDate fechaDeNacimiento;
	private CondicionNota condicion;
	private Integer asistencias;

	public Alumno(String nombre, String apellido, LocalDate edad) {
		super(nombre, apellido);
		this.fechaDeNacimiento = edad;
	}

	public void condicion(Integer notaPrimerParcial, Integer notaSegundoParcial) {

		if (notaPrimerParcial >= 7 && notaSegundoParcial >= 7 && asistencias>=7) {
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

	public boolean asistenciasCorrectas(Integer asistencias) {
		return asistencias >= 0.7 * TOTAL_ASISTENCIAS;
}
	
	
	
	public Integer getNotaPrimerParcial() {
		return notaPrimerParcial;
	}
	
	public Integer getAsistencias() {
		return asistencias;
	}

	public void setAsistencias(Integer asistencias) {
		this.asistencias = asistencias;
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

	public LocalDate getEdad() {
		return fechaDeNacimiento;
	}

	public void setEdad(LocalDate edad) {
		this.fechaDeNacimiento = edad;
	}

}
