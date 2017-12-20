package definicaoJogo;

public abstract class DefinicaoJogo{
	protected int[] parametros; 
	
	public void definirParamentro ()  throws ArrayIndexOutOfBoundsException{
		
	}
	
	public int valorParametro (int posicao) {
		return parametros[posicao];
	}
}
