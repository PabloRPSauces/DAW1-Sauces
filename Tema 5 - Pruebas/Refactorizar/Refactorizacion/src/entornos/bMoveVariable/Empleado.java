package entornos.bMoveVariable;

public class Empleado {
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
		return horas + horasExtra*1.40;
	}
	if (tipo.getTipo().equals("Dependiente")) {
		return horas + horasExtra*1.75;
	}
	return horas + horasExtra*1.15;
	}

public double getSueldo() {
	return tipo.getHoraBase()*calculoHoras();
}
}
