package definicaoJogo;

import java.util.Scanner;

public class JogoManualmente extends DefinicaoJogo{
	Scanner entrada = new Scanner(System.in);
	
	public void definirParametro ()  throws ArrayIndexOutOfBoundsException{
		parametros = new int[8];
		
		System.out.println("Digite o valor da posi��o x para o Porta Avi�o:");
		parametros[0] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o y para o Porta Avi�o:");
		parametros[1] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o x para o Submarino:");
		parametros[2] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o y para o Submarino:");
		parametros[3] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o x para o Navio de Escolta:");
		parametros[4] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o y para o Navio de Escolta:");
		parametros[5] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o x para o Ca�a:");
		parametros[6] = entrada.nextInt();
		System.out.println("Digite o valor da posi��o y para o Ca�a:");
		parametros[7] = entrada.nextInt();
	}
	
	public int valorParametro (int posicao) {
		return parametros[posicao];
	}
}
