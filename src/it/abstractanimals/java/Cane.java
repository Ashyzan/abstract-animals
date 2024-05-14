package it.abstractanimals.java;

public class Cane extends Animale {
	
	private String name;
	
		public void Delfino(String name) {
		
		this.name = name;
		
		
	}


	@Override
	protected void verso() {
		System.out.println("Il mio verso è bau");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio carne");
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
