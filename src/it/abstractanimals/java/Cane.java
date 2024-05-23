package it.abstractanimals.java;

public class Cane extends Animale {
	
	public Cane(String name , String tipoAnimale) {
		super(name , tipoAnimale);
		
	}


	@Override
	protected void verso() {
		System.out.println("Il mio verso è bau");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio carne");
		
	}


	
	

}
