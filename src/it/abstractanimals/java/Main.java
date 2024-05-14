package it.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		
		Delfino ilDelfino = new Delfino( "Jerry");
		
		ilDelfino.mangia();
		ilDelfino.dormi();
		ilDelfino.verso();
		ilDelfino.getName();
		
		
		System.out.println();
		
		Animale ilPasserotto = new Passerotto();
		
		
		
		ilPasserotto.mangia();
		ilPasserotto.dormi();
		ilPasserotto.verso();

		

	}


}
