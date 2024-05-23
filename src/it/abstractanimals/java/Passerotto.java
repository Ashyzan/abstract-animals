package it.abstractanimals.java;

public class Passerotto extends Animale implements Ivolante {
	
	
	public Passerotto(String name , String tipoAnimale) {
		super(name , tipoAnimale);
	
	}


	@Override
	protected void verso() {
		System.out.println("Il mio verso è un cippettio");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio lombrichi e insetti");
		
	}


	@Override
	public void vola() {
		System.out.println("Io VOLOOOOOO cip cip ..");
		
	}
	

}
