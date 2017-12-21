package modelo;

import java.awt.EventQueue;
import java.io.IOException;

import definicaoJogo.JogoArquivo;
import fronteira.TelaInicial;

public class Principal {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
//		JogoArquivo configuracao = new JogoArquivo();
//		try {
//			configuracao.definirParametro();
//		} catch (ArrayIndexOutOfBoundsException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			System.out.println("Erro de leitura de arquivo!");
//			e.printStackTrace();
//		}
		
//		BatalhaNaval jogo = new BatalhaNaval();
//		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
//		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
//		jogo.configurarJogador(0, "Patrick", jogo.retornartabuleiro(0));
//		jogo.configurarJogador(1, "Computador", jogo.retornartabuleiro(1));
//		jogo.iniciarJogo();
	}

}
