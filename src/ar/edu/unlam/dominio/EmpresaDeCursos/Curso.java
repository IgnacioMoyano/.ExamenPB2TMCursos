package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.util.ArrayList;

public abstract class Curso {

	private ArrayList<Alumno> alumnos;
	private Profesor profesor;
	protected Integer precio;
	protected String codigoCurso;
	protected Integer clases;

	public Curso() {
		this.alumnos = new ArrayList<>();
	}

	public void añadirProfesor(Profesor profesor) {

		if (profesor.getNombre() != null && profesor.getApellido() != null && profesor.getDni() != null
				&& profesor.getEmail() != null && profesor.getTelefono() != null) {
			setProfesor(profesor);
		}

	}

	public void añadirAlumnos(Alumno alumno) {
		Integer capacidadMaximaPersonas = 10;

		if (alumno.getNombre() != null && alumno.getApellido() != null && alumno.getDni() != null
				&& alumno.getEmail() != null && alumno.getTelefono() != null) {
			if (edadRequeridaParaCursar(alumno)) {
				if (alumnos.size() < capacidadMaximaPersonas) {
					alumnos.add(alumno);
				}
			}
		}
	}

	public Integer cantidadAlumnos() {
		return alumnos.size();
	}

	public abstract boolean edadRequeridaParaCursar(Alumno alumno);

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Integer getClases() {
		return clases;
	}

	public void setClases(Integer clases) {
		this.clases = clases;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}

	public String getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(String codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

}
