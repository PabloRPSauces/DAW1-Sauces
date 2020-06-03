package entornos.aMoveMethod;

public class TipoEmpleado {
	private String tipo;
	private double horaBase;

	TipoEmpleado(String t, double h) {
		this.tipo = t;
		this.horaBase = h;
	}

	public String getTipo() {
		return tipo;
	}

	public double getHoraBase() {
		return horaBase;
	}

}
