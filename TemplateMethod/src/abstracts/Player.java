package abstracts;

public abstract class Player {
	
	public abstract void ligar();
	public abstract void sintonizar();	
	public abstract void bufferizar();	
	public abstract void tocar();	
	public abstract void desligar();
	
	public final void realizarRotina() {
	
		ligar();
		
		sintonizar();
		
		bufferizar();
		
		tocar();
		
		desligar();
	}
}
