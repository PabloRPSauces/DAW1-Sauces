package entornos.cExtractLocalVariable;

public class ExtractLocalVariable {

	public static void main(String[] args) {
		Dia dia = new Dia();
		System.out.println("Hola Mundo");
		if (dia.isEsDia()) {
			System.out.println("Hola Mundo"+", es de día.");
		} else {
			System.out.println("Hola Mundo"+", es de noche.");
		}
	}
}
