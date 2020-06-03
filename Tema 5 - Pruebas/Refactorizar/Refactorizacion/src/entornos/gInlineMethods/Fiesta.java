package entornos.gInlineMethods;

public class Fiesta {
	
	public static void main(String[] args) {
		Cerveza cerveza1 = new Cerveza("RUBIA");
		Cerveza cerveza2 = new Cerveza("NEGRA");
		Cerveza cerveza3 = new Cerveza("RUBIA");
		System.out.println(" Te has tomado: "+ Cerveza.getNumCervezas()+" cervezas.");
		
		Cerveza cerveza4 = new Cerveza("MALTA");
		Cerveza cerveza5 = new Cerveza("NEGRA");
		Cerveza cerveza6 = new Cerveza("RUBIA");
		System.out.println(" Te has tomado: "+ Cerveza.getNumCervezas()+" cervezas.");
	
                String cerve="RUBIA";
                Cerveza cerveza7;
                cerveza7=new Cerveza(cerve);
                
		if (rondaGratis()==2) {
			System.out.println(" Enhorabuena tienes una ronda gratis. ");
		} else
			System.out.println(" Tienes que tomarte mas cerveza. ");
	}

	private static  int rondaGratis() {
		return (masde3cervezas()?2:1);
	}
 
	private static boolean masde3cervezas() {
	 return (Cerveza.getNumCervezas()>3);
}
}
