package it.abstractanimals.java;

public class Main {

	public static void main(String[] args) {
		
		Delfino ilDelfino = new Delfino( "Jerry");
		
		ilDelfino.mangia();
		ilDelfino.dormi();
		ilDelfino.verso();
		ilDelfino.getName();
		
		
		System.out.println();

		
		
		
		
		
		
		
//		Animale ilPasserotto = new Passerotto();
//		
//		ilPasserotto.mangia();
//		ilPasserotto.dormi();
//		ilPasserotto.verso();
//		
//		System.out.println();
//		
//		Palombo ilPalombo = new Palombo("Pinco");
//		
//		ilPalombo.faiNuotare();
//		ilPalombo.GrandezzaPinne();		
//		ilPalombo.getName();
//		
//		System.out.println();
//		
		
		Aquila  nessina = new Aquila("Nessina");
		
		nessina.mangia();
		nessina.dormi();
		nessina.verso();
		nessina.vola();
		nessina.toString();
		
		System.out.println();
		

	}


}
