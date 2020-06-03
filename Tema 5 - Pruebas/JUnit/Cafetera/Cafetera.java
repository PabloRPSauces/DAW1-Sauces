package pruebas;

public class Cafetera {
	private int capacidadMaxima; 
	private int cantidadActual;

	public Cafetera() {
		this.capacidadMaxima=1000;
		this.cantidadActual=0;

	}

	public Cafetera(int capacidad) { 
		this.capacidadMaxima=capacidad;
		this.cantidadActual=capacidad;
	}

	public Cafetera(int capacidad, int actual) {
		if(actual>capacidad){
			this.cantidadActual=capacidad;
			this.capacidadMaxima=capacidad;
		}
		else{
			this.cantidadActual=actual;
			this.capacidadMaxima=capacidad;
		}		
	}



	public void setCapacidadMaxima(int c) { 
		this.capacidadMaxima=c;
	}
	public void setCantidadActual(int c) { 

	}

	public void llenarCafetera() { 
		cantidadActual=capacidadMaxima;
	}

	public int servirTaza(int cc) { 
		
	}

	public void vaciarCafetera() { 
		cantidadActual=0;
	}

	public void agregarCafe(int cc) { 
		if(cc<0){
			System.out.println("No se puede poner cafe negativo");
			//throw new Exception("Cafe negativo");		
		}
		//desbortamos la cafetera
		else if(cantidadActual+cc>capacidadMaxima){
			cantidadActual=capacidadMaxima;
		}
		//lleno parcialmente la cafetera
		else{
			cantidadActual=cantidadActual+cc;
		}


}
















