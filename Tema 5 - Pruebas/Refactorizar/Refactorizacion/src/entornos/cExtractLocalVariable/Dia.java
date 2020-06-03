package entornos.cExtractLocalVariable;

import java.util.Random;

public class Dia {
	
	private boolean esDia;

	public Dia() {
		Random genera = new Random();
		this.esDia = genera.nextBoolean();
		System.out.println("Hola Mundo"+", dia = "+ esDia); // No se pone solo es una prueba.
	}

	public boolean isEsDia() {
		return esDia;
	}
	
	

}
