package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.util.ArrayList;

public class Curso {

	private final static Integer CLASESHTML = 10;
	private final static Integer CLASESCSS = 15;
	private final static Integer CLASESJAVA = 20;
	
	private final Integer EDAD_MINIMA_HTML = 15;
	private final Integer EDAD_MAXIMA_HTML = 30;

	private final Integer EDAD_MINIMA_CSS = 18;
	private final Integer EDAD_MAXIMA_CSS = 35;

	private final Integer EDAD_MINIMA_JAVA = 20;
	private final Integer EDAD_MAXIMA_JAVA = 40;

	private ArrayList<Alumno> alumnos;
	private Profesor profesor;
	private TipoCurso tipoCurso;
	private Integer precio;
	private String codigoCurso;
	private Integer clases;

	public Curso(TipoCurso tipoCurso) {
		this.alumnos = new ArrayList<>();
		this.tipoCurso = tipoCurso;
		if (getTipoCurso() == TipoCurso.HTML) {
			setClases(CLASESHTML);
		}

		if (getTipoCurso() == TipoCurso.CSS) {
			setClases(CLASESCSS);
		}

		if (getTipoCurso() == TipoCurso.JAVA) {
			setClases(CLASESJAVA);
		}

	}

	public void añadirProfesor(Profesor profesor) {

		if (profesor.getNombre() != null && profesor.getApellido() != null && profesor.getDni() != null
				&& profesor.getEmail() != null && profesor.getTelefono() != null) {
			setProfesor(profesor);
		}

	}

	public void añadirAlumnos(Alumno alumno, TipoCurso tipoCurso) {
		Integer capacidadMaximaPersonas = 10;

		if (alumno.getNombre() != null && alumno.getApellido() != null && alumno.getDni() != null
				&& alumno.getEmail() != null && alumno.getTelefono() != null) {
			if (edadRequeridaParaCursar(alumno, tipoCurso)) {
				if (alumnos.size() < capacidadMaximaPersonas) {
					alumnos.add(alumno);
				}
			}
		}
	}

	public Integer cantidadAlumnos() {
		return alumnos.size();
	}

	public void clasesSegunTipoCurso() {
		

		
	}

	public boolean edadRequeridaParaCursar(Alumno alumno, TipoCurso tipoCurso) {

		boolean validado = false;

		if (tipoCurso == TipoCurso.HTML && alumno.getEdad() > EDAD_MINIMA_HTML && alumno.getEdad() < EDAD_MAXIMA_HTML) {
			validado = true;
		}

		if (tipoCurso == TipoCurso.CSS && alumno.getEdad() > EDAD_MINIMA_CSS && alumno.getEdad() < EDAD_MAXIMA_CSS) {
			validado = true;
		}

		if (tipoCurso == TipoCurso.JAVA && alumno.getEdad() > EDAD_MINIMA_JAVA && alumno.getEdad() < EDAD_MAXIMA_JAVA) {
			validado = true;
		}

		return validado;

	}

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

	public TipoCurso getTipoCurso() {
		return tipoCurso;
	}

	public void setTipoCurso(TipoCurso tipoCurso) {
		this.tipoCurso = tipoCurso;
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
