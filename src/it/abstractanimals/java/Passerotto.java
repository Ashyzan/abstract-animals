package it.abstractanimals.java;

public class Passerotto extends Animale {
	
	
	public Passerotto(String name) {
	super(name);
	
	}


	@Override
	protected void verso() {
		System.out.println("Il mio verso è un cippettio");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio lombrichi e insetti");
		
	}
	

}
