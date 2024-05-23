package it.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		
		Delfino ilDelfino = new Delfino( "Jerry" , "Delfino");
		
		ilDelfino.mangia();
		ilDelfino.dormi();
		ilDelfino.verso();
		ilDelfino.getName();
		
		
		System.out.println();
	
		
		Animale ilPasserotto = new Passerotto("Cippi", "Passerotto");
		
		ilPasserotto.mangia();
		ilPasserotto.dormi();
		ilPasserotto.verso();
		
		System.out.println();
		
		
		Passerotto passi = new Passerotto("Passi" , "Passerotto");
		
		passi.vola();
		
		
		System.out.println();

		
		Aquila  nessina = new Aquila("Nessina" , "Aquila");
		
		nessina.mangia();
		nessina.dormi();
		nessina.verso();
		nessina.vola();
		nessina.toString();
		
		System.out.println();
		

	}


}
