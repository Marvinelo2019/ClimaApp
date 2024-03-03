package org.marvinlopez.sistema;

import org.marvinlopez.bean.Estudiante;
import org.marvinlopez.bean.Profesor;
import org.marvinlopez.utilities.IOperaciones;

public class Principal {

	public static void main(String[] args) {
		
		Estudiante marvinGilberto = new Estudiante();
		marvinGilberto.setId(202401);
		marvinGilberto.setNombres("Marvin Gilberto");
		marvinGilberto.setApellidos("Lopez Espinoza");
		marvinGilberto.setDireccion("Guatemala,Guatemala");
		marvinGilberto.setEmail("amdmarvin.lopez@gmail.com");
		marvinGilberto.setTelefono("33128076");
		((Estudiante)marvinGilberto).setCarne("19832047");
		marvinGilberto.registraAsistencia();
		
		Profesor edwinTumax = new Profesor();
		edwinTumax.setId(202401);
		edwinTumax.setNombres("Edwin");
		edwinTumax.setApellidos("Tumax");
		edwinTumax.setDireccion("Guatemala,Guatemala");
		edwinTumax.setEmail("edwintumax@kalume.edu.gt");
		edwinTumax.setTelefono("73737373");
		edwinTumax.setSueldo(1250L);
		edwinTumax.registraAsistencia();
		
		registrarEvento(marvinGilberto);
		registrarEvento(edwinTumax);
		
		
		System.out.println(marvinGilberto.getApellidos() + " " + marvinGilberto.getNombres() + " " + marvinGilberto.getEmail());
		
	}
	public static void registrarEvento(IOperaciones operador) {
		
		operador.enviarNotificacion();
		operador.revisarAsistencia();
	}

}
