package entornos.bMoveVariable;

public class TipoEmpleado {
	private String tipo;
	private double horabase;

	TipoEmpleado(String t, double h) {
		this.tipo = t;
		this.horabase = h;
	}

	public String getTipo() {
		return tipo;
	}

	public double getHoraBase() {
		return horabase;
	}

}
