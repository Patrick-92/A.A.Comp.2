package definicaoJogo;

import java.util.Random;

public class JogoAleatorio extends DefinicaoJogo {
	private Random gerador = new Random();
	
	public void definirParametro ()  throws ArrayIndexOutOfBoundsException{
		parametros = new int[8];
		
			parametros[0] = gerador.nextInt(6);
			parametros[1] = gerador.nextInt(8);
			
			do {
				parametros[2] = gerador.nextInt(8);
				parametros[3] = gerador.nextInt(8);
			} while (parametros[1]-1 <= parametros[3] && parametros[3] <= parametros[1]+3 && parametros[0] == parametros[2]);
			
			do {
				parametros[4] = gerador.nextInt(7);
				parametros[5] = gerador.nextInt(8);
			} while ((parametros[1]-2 <= parametros[5] && parametros[5] <= parametros[1]+3 && parametros[0] == parametros[4])
					|| (parametros[3]-2 <= parametros[5] && parametros[5] <= parametros[3]+1 && parametros[2] == parametros[4]));
			
			do {
				parametros[6] = gerador.nextInt(8);
				parametros[7] = gerador.nextInt(8);
			} while ((parametros[1]-1 <= parametros[7] && parametros[7] <= parametros[1]+3 && parametros[0] == parametros[6])
					|| (parametros[3]-1 <= parametros[7] && parametros[7] <= parametros[3]+1 && parametros[2] == parametros[6])
					|| (parametros[5]-1 <= parametros[7] && parametros[7] <= parametros[5]+2 && parametros[4] == parametros[6]));
	}
	
	public int valorParametro (int posicao) {
		return parametros[posicao];
	}
}
