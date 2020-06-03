package entornos.gInlineMethods;

public class Cerveza {
  
	public static int numCervezas;
    String tipo;
	
    public Cerveza(String tipo) {
		this.tipo = tipo;
		numCervezas++;
	}

	public static int getNumCervezas() {
		return numCervezas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
    
	
  
}
