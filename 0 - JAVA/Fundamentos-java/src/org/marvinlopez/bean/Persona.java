package org.marvinlopez.bean;


public abstract class Persona {
	int Id;
	String apellidos;
	String nombres;
	String email;
	String direccion;
	String telefono;
	String dpi;

	public abstract void registraAsistencia();

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getApellidos() {
		return apellidos.toUpperCase();
	}

	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		} else {
			this.apellidos = "El apellido no fue ingresado correctamente";
		}
	}

	public String getNombres() {
		return nombres.toUpperCase();
	}

	public void setNombres(String nombres) {
		if (nombres != null && !nombres.isEmpty()) {
			this.nombres = nombres;
		} else {
			this.nombres = "El nombre no fue ingresado correctamente";
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDpi() {
		return dpi;
	}

	public void setDpi(String dpi) {
		this.dpi = dpi;
	}

}
