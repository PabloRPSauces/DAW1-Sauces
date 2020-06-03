package entornos.eExtractMethod;

public class TipoEmpleado {
	private String tipo;
	TipoEmpleado(String t) {
		this.tipo = t;
		
	}

	public String getTipo() {
		return tipo;
	}

	public double calculoHoras(Empleado empleado) {
		if (getTipo().equals("Supervisor")) {
			return empleado.getHoras() + empleado.getHorasExtra()*1.40;
		}
		if (getTipo().equals("Dependiente")) {
			return empleado.getHoras() + empleado.getHorasExtra()*1.75;
		}
		// Imprimo los datos:
		if (getTipo().equals("Supervisor")) {
			System.out.println(" Soy el Supervisor. ");
		}
		if (getTipo().equals("Dependiente")) {
			System.out.println(" Soy el Dependiente. ");
		}
		return empleado.getHoras() + empleado.getHorasExtra()*1.15;
		}

  }
