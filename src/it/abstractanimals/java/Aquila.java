package it.abstractanimals.java;

public class Aquila extends Animale {
	
private String name;
	
	public void Delfino(String name) {
		
		this.name = name;
		
		
	}
	

	@Override
	
	protected void verso() {
		System.out.println("Il mio verso è un un grido");
		
	}
	
	@Override
	
	protected void mangia() {
		System.out.println("Mangio prede sono carnivora");
		
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
