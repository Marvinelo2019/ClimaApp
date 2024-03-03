package org.marvinlopez.bean;

public class LlamadaInterior extends Llamada  {
	private int franjaHoraria;
	private static final double[] COSTOS_POR_FRANJA = { 0.20, 0.35, 0.85 };

	// Constructor
	public LlamadaInterior(String numeroOrigen, String numeroDestino, int duracionSegundos, int franjaHoraria) {
		super(numeroOrigen, numeroDestino, duracionSegundos);
		this.franjaHoraria = franjaHoraria;
		calcularCostoTotal();
	}

	// Método para calcular el costo total de la llamada del interior
	@Override
	public void calcularCostoTotal() {
		setCostoTotal(COSTOS_POR_FRANJA[franjaHoraria - 1] * getDuracionSegundos());
	}

	private void setCostoTotal(double d) {
		// TODO Auto-generated method stub
		
	}

	private double getDuracionSegundos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String toString() {
		return "";
	}
}
