package consola;

import logica.Electrodomestico;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico e1 = new Electrodomestico("Microondas","Panasonic",700);
		Electrodomestico e2 = new Electrodomestico();
		
		System.out.println("datos de e1: "+e1.getNombre());
		System.out.println("------------------------");
		System.out.println("datos de e2: "+e2);
		
		
	}

}
