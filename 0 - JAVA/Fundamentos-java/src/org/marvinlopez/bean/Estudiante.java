package org.marvinlopez.bean;

import org.marvinlopez.utilities.IOperaciones;

public class Estudiante extends Persona implements IOperaciones {
	private String carne;

	public String getCarne() {
		if(carne != null ) {
			return carne;
		}
		return "";
	}

	public void setCarne(String carne) {
		this.carne = carne;
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Enviando su ausencia a clase");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void revisarAsistencia() {
		System.out.println("Registrando asistencia en la materia MAT01");
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void registraAsistencia() {
		
		System.out.println("Registrando asistencia Jornada Matutina  ".concat(getApellidos()).concat("  ").concat(getNombres().concat(" ").concat(getCarne())));   

	}
	
}
