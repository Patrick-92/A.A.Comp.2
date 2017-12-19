package modelo;

public class Principal {

	public static void main(String[] args) {
		BatalhaNaval jogo = new BatalhaNaval();
		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
		jogo.configurarTabuleiro(1,1,2,4,8,7,5,4);
		jogo.configurarJogador(0, "Patrick", jogo.retornartabuleiro(0));
		jogo.configurarJogador(1, "Computador", jogo.retornartabuleiro(1));
		jogo.iniciarJogo();
	}

}
