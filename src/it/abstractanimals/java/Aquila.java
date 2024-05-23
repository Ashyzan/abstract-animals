package it.abstractanimals.java;

public class Aquila extends Animale implements Ivolante {
	
	public Aquila(String name , String tipoAnimale) {
		super(name , tipoAnimale);	
	}
	
	@Override
	public void vola() {
		System.out.println("Io volo");
	}

	@Override
	
	protected void verso() {
		System.out.println("Il mio verso è un un grido");
		
	}
	
	@Override
	
	protected void mangia() {
		System.out.println("Mangio prede sono carnivora");
		
	}
	
	
	public String toString() {
		return super.toString() + "il mio nome è" + getName();
		}

}
