package org.marvinlopez.bean;

public class LlamadaLocal extends Llamada {

	private static final double COSTO_SEGUNDO_LOCAL = 0.25;

    // Constructor
    public LlamadaLocal(String numeroOrigen, String numeroDestino, int duracionSegundos) {
        super(numeroOrigen, numeroDestino, duracionSegundos);
        calcularCostoTotal();
    }

    // Método para calcular el costo total de la llamada local
    @Override
    public void calcularCostoTotal() {
        setCostoTotal(COSTO_SEGUNDO_LOCAL * getDuracionSegundos());
    }

	private void setCostoTotal(double d) {
		// TODO Auto-generated method stub
		
	}

	private double getDuracionSegundos() {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * @return the costoSegundoLocal
	 */
	public static double getCostoSegundoLocal() {
		return COSTO_SEGUNDO_LOCAL;
	}
	
	public String tostring() {
		return "";
	}
	
}
