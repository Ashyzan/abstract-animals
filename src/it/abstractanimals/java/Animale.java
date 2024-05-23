package it.abstractanimals.java;

public abstract class Animale {
	
	//attributo private ereditato così da tutti i figli
	private String name;
	private String tipoAnimale;
	
	// costruttore che sarà ereditato da tutti i figli e 
	// dovrà essere implementato con i propri parametri dai figli
	public Animale(String name , String tipoAnimale) {
		this.tipoAnimale = tipoAnimale;
		this.name = name;
		System.out.println("Il mio nome è " + name );
		System.out.println("Sono un " + tipoAnimale );
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
	return "Gli animali sono parte della natura";
	}

}
