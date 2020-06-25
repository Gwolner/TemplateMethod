package modelos;
import abstracts.Player;

public class RadioPortatil extends Player{
	
	@Override
	public void ligar() {
		System.out.println("Iniciando...");
		System.out.println("Radio portátil ligado.");
	};
	
	@Override
	public void sintonizar(){
		System.out.println("Sintonizando rádio...");
		System.out.println("Rádio sintonizada.");
	};
	
	@Override
	public void bufferizar(){
		System.out.println("Checando buffer ...");
		System.out.println("Não há buffer.");
	};
	
	@Override
	public void tocar(){
		System.out.println("Tocando música.");
	};
	
	@Override
	public void desligar(){
		System.out.println("Aguardando fim da música...");
		System.out.println("Radio portátil desligada");
	};
}
