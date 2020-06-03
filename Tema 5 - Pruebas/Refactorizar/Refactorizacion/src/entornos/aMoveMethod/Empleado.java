package entornos.aMoveMethod;

public class Empleado {
	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(int horasExtra) {
		this.horasExtra = horasExtra;
	}

	public TipoEmpleado getTipo() {
		return tipo;
	}

	public void setTipo(TipoEmpleado tipo) {
		this.tipo = tipo;
	}

	private int horas;
	private int horasExtra;
	private TipoEmpleado tipo;

	public Empleado(int horas, int horasExtra, TipoEmpleado tipo) {
		super();
		this.horas = horas;
		this.horasExtra = horasExtra;
		this.tipo = tipo;
	}

	public double calculoHoras() {
		if (tipo.getTipo().equals("Supervisor")) {
			return horas + horasExtra * 1.40;
		}
		if (tipo.getTipo().equals("Dependiente")) {
			return horas + horasExtra * 1.75;
		}
		return horas + horasExtra * 1.15;
	}

	public double getSueldo() {
		return tipo.getHoraBase() * calculoHoras();
	}
}
