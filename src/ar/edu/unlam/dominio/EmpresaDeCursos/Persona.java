package ar.edu.unlam.dominio.EmpresaDeCursos;

public abstract class Persona {

	private String nombre;
	private String apellido;
	private Integer dni;
	private String email;
	private String telefono;

	public Persona() {

	}

	public Persona(String nombre, String apellido, Integer dni, String email, String telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;

	}

	public Persona(String nombre2, String apellido2) {

		this.nombre=nombre2;
		this.apellido=apellido2;


	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public boolean validarDni(Integer dni) {

		if (dni.toString().length() == 8) {
			return true;
		} else {
			return false;
		}

	}

	public boolean validarEmail(String email) {

		if (email.contains("@")) {
			if (email.endsWith(".com")) {
				return true;
			}

		}
		return false;

	}

	public boolean validarTelefono(String telefono) {
		if (telefono.startsWith("+54")) {
			if (telefono.length() == 13) {
				return true;
			}
		}

		return false;

	}

	public void validarYAgregarDni(Integer dni) {
		if (validarDni(dni)) {
			setDni(dni);
		}
	}

	public void validarYAgregarEmail(String email) {
		if (validarEmail(email)) {
			setEmail(email);
		}
	}

	public void validarYAgregarTelefono(String telefono) {
		if (validarTelefono(telefono)) {
			setTelefono(telefono);
		}
	}

}
