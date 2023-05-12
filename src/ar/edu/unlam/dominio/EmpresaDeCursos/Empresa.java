package ar.edu.unlam.dominio.EmpresaDeCursos;

import java.util.ArrayList;

public class Empresa {

	ArrayList<Curso> cursos;

	public Empresa(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}

	public ArrayList<Curso> getCurso() {
		return cursos;
	}

	public void setCurso(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	
	public void agregarCurso(Curso curso) {
		
		if (curso.getPrecio()!=null && curso.getClases() != null && curso.getProfesor()!=null) {
			cursos.add(curso);	
		}
		
		
	}
	
	
	
}
