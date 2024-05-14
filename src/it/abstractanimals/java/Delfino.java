package it.abstractanimals.java;

public class Delfino extends Animale {
	
	private String name;
	


	public Delfino(String name) {
		
		this.name = name;
		
		
	}
	
	

	@Override
	protected void verso() {
		System.out.println("Il mio verso è un fischio grit grit grit");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio pesci più piccoli");
		
	}
	
	public String getName() {
		System.out.println("Sono un Delfino " + "il mio nome è " + name);
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
