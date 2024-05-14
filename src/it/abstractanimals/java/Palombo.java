package it.abstractanimals.java;

public class Palombo extends Pesci{
	
private String name;
	


	public Palombo(String name) {
		
		this.name = name;
		
		
	}

	@Override
	public void faiVolare() {
		System.out.println("io non volo!");
		
	}

	@Override
	public void faiNuotare() {
		System.out.println("Sto nuotando");
		
	}

	@Override
	public void GrandezzaPinne() {
		System.out.println("Ho le pinne grandi");
		
	}
	
	public String getName() {
		System.out.println("Sono un Palombo " + "il mio nome è " + name);
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
