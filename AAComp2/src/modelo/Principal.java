package modelo;

import java.io.IOException;

import definicaoJogo.JogoArquivo;

public class Principal {

	public static void main(String[] args) {
		JogoArquivo configuracao = new JogoArquivo();
		try {
			configuracao.definirParametro();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Erro de leitura de arquivo!");
			e.printStackTrace();
		}
		
		for (int i = 0; i < 8; i++) {
			System.out.println(configuracao.valorParametro(i));
		}
		
//		BatalhaNaval jogo = new BatalhaNaval();
//		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
//		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
//		jogo.configurarJogador(0, "Patrick", jogo.retornartabuleiro(0));
//		jogo.configurarJogador(1, "Computador", jogo.retornartabuleiro(1));
//		jogo.iniciarJogo();
	}

}
