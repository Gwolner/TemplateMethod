package modelos;
import abstracts.Player;

public class VitrolaEletrica extends Player{

	@Override
	public void ligar() {
		System.out.println("Iniciando...");
		System.out.println("Vitrola el�trica ligada");
	};
	
	@Override
	public void sintonizar(){
		System.out.println("Sintonizando r�dio...");
		System.out.println("R�dio sintonizada");
	};
	
	@Override	
	public void bufferizar(){
		System.out.println("Checando buffer ...");
		System.out.println("Preparando buffer ...");
		System.out.println("Buffer iniciado");
	};
	
	@Override
	public void tocar(){
		System.out.println("Tocando m�sica");
	};
	
	@Override
	public void desligar(){
		System.out.println("Aguardando fim da m�sica...");
		System.out.println("Vitrola el�trica desligada");
	};
	
	
}
