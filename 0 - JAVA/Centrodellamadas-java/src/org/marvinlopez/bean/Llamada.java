package org.marvinlopez.bean;

public class Llamada {
	 	private String numeroOrigen;
	    private String numeroDestino;
	    private int duracionSegundos;
	    private double costoTotal;

	    // Constructor
	    public Llamada(String numeroOrigen, String numeroDestino, int duracionSegundos) {
	        this.numeroOrigen = numeroOrigen;
	        this.numeroDestino = numeroDestino;
	        this.duracionSegundos = duracionSegundos;
	    }

	    // Método para calcular el costo total de la llamada
	    public void calcularCostoTotal() {
	        // Implementación en clases derivadas
	    }

	    // Getter para el costo total de la llamada
	    public double getCostoTotal() {
	        return costoTotal;
	    }

	    // Método para mostrar la información de la llamada por pantalla
	    public void mostrarInformacionLlamada() {
	        System.out.println("Número de origen: " + numeroOrigen);
	        System.out.println("Número de destino: " + numeroDestino);
	        System.out.println("Duración (segundos): " + duracionSegundos);
	        System.out.println("Costo total: $" + costoTotal);
	    }
	}
