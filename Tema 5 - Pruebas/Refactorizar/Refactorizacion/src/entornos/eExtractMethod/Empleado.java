package entornos.eExtractMethod;

public class Empleado {
private int horas;
private int horasExtra;
private TipoEmpleado tipo;
private double horaBase;

public Empleado(int horas, int horasExtra, TipoEmpleado tipo) {
	this.horas = horas;
	this.horasExtra = horasExtra;
	this.tipo = tipo;
	this.horaBase = 5;
}

public double getSueldo() {
	return horaBase*tipo.calculoHoras(this);
}

public int getHoras() {
	return horas;
}

public int getHorasExtra() {
	return horasExtra;
}

}
