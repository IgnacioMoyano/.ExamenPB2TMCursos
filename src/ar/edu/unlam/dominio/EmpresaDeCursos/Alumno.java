package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.time.LocalDate;

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

	public Alumno(String nombre, String apellido, Integer dni, String email, String telefono, LocalDate edad) {
		super(nombre, apellido, dni, email, telefono);
		this.fechaDeNacimiento = edad;

	}

	public void condicion(Curso curso) {

		if (this.getNotaPrimerParcial() >= 7 && this.getNotaSegundoParcial() >= 7
				&& validarCantidadDeAsistencias(curso)) {
			setCondicion(CondicionNota.APROBADO);
		}
		if (this.getNotaPrimerParcial() < 4 || this.getNotaSegundoParcial() < 4
				|| validarCantidadDeAsistencias(curso) == false) {
			setCondicion(CondicionNota.DESAPROBADO);
		}
		if (this.getNotaPrimerParcial() >= 4 && this.getNotaSegundoParcial() >= 4 && this.getNotaSegundoParcial() < 7
				&& validarCantidadDeAsistencias(curso)) {
			setCondicion(CondicionNota.FINAL);
		}

		if (this.getNotaPrimerParcial() >= 4 && this.getNotaPrimerParcial() < 7 && this.getNotaSegundoParcial() >= 4
				&& validarCantidadDeAsistencias(curso)) {
			setCondicion(CondicionNota.FINAL);
		}
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

	public Integer getEdad() {

		LocalDate fechaActual = LocalDate.now();
		Integer edad;

		edad = fechaActual.getYear() - this.fechaDeNacimiento.getYear();

		if (fechaDeNacimiento.getDayOfYear() < fechaActual.getDayOfYear()) {
			edad--;
		}

		return edad;

	}

	public Boolean validarCantidadDeAsistencias(Curso curso) {
		if (this.getAsistencias() >= curso.getClases() * 0.7) {
			return true;
		}
		return false;
	}

	public void setEdad(LocalDate edad) {
		this.fechaDeNacimiento = edad;
	}

}
