package it.abstractanimals.java;

public class Delfino extends Animale implements Inuotante{
	
	public Delfino(String name) {
		super(name);
		
	}
	
	

	@Override
	protected void verso() {
		System.out.println("Il mio verso è un fischio grit grit grit");
		
	}

	@Override
	protected void mangia() {
		System.out.println("Mangio pesci più piccoli");
		
	}



	@Override
	public void nuota() {
		System.out.println("Sono un animale che nuota");
		
	}
	
	
	public String toString() {
		return super.toString() + "il mio nome è" + getName();
		}
	

}
