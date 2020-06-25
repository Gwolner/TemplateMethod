package main;
import abstracts.Player;
import modelos.RadioPortatil;
import modelos.VitrolaEletrica;

public class TocadorDeMusica {
	
	public static void main(String[] args) {
		
		Player tocadorDeMusica = new VitrolaEletrica();
		tocadorDeMusica.realizarRotina();
		
		System.out.println();
		
		tocadorDeMusica = new RadioPortatil();
		tocadorDeMusica.realizarRotina();
	}
}
