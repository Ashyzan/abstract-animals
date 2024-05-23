package it.abstractanimals.java;

public abstract class Animale {
	
	//attributo private ereditato così da tutti i figli
	private String name;
	
	
	// costruttore che sarà ereditato da tutti i figli e 
	// dovrà essere implementato con i propri parametri dai figli
	public Animale(String name) {
		
		this.name = name;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected static void dormi() {

		System.out.println("Quando dormo faccio Zzzzzz");
	}

	protected abstract void verso();

	protected abstract void mangia();
	
	// metodo toString
	
	public String toString() {
	return " Nome animale: " + name ;
	}

}
