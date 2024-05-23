package it.abstractanimals.java;

public class Passerotto extends Animale {
	
private String name;
	
	public void nomePasserotto(String name) {
		
		this.name = name;
		
		
	}


	@Override
	protected void verso() {
		System.out.println("Il mio verso è un cippettio");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio lombrichi e insetti");
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
