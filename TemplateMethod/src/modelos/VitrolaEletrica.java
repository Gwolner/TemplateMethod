package modelos;
import abstracts.Player;

public class VitrolaEletrica extends Player{

	@Override
	public void ligar() {
		System.out.println("Iniciando...");
		System.out.println("Vitrola elétrica ligada");
	};
	
	@Override
	public void sintonizar(){
		System.out.println("Sintonizando rádio...");
		System.out.println("Rádio sintonizada");
	};
	
	@Override	
	public void bufferizar(){
		System.out.println("Checando buffer ...");
		System.out.println("Preparando buffer ...");
		System.out.println("Buffer iniciado");
	};
	
	@Override
	public void tocar(){
		System.out.println("Tocando música");
	};
	
	@Override
	public void desligar(){
		System.out.println("Aguardando fim da música...");
		System.out.println("Vitrola elétrica desligada");
	};
	
	
}
