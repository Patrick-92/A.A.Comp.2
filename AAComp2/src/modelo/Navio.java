package modelo;

public class Navio extends Maquina {
	private int tamanhoNavio = 3; 
	
	public Navio(String tipoMaquina, int posicaoX, int posicaoY) {
		super(tipoMaquina, posicaoX, posicaoY);
		// TODO Auto-generated constructor stub
	}
	
	public void disparar (int x, int y, Tabuleiro tabuleiro) {
		for (int j = y; j < y+2; j++) {
			if (tabuleiro.valorQuadrado(x, j) == 1 || tabuleiro.valorQuadrado(x, j) == 2 || tabuleiro.valorQuadrado(x, j) == 3 || tabuleiro.valorQuadrado(x, j) == 4) {
				System.out.println("Acertou uma máquina inimiga!");
				tabuleiro.inserirValorQuadrado(x, j, 5);
			}
			else {
				System.out.println("Acertou na água!");
				tabuleiro.inserirValorQuadrado(x, j, 6);
			}
		}
	}
	
	public String getTipoMaquina() {
		return tipoMaquina;
	}
	public void setTipoMaquina(String tipoMaquina) {
		this.tipoMaquina = tipoMaquina;
	}
	public int getPosicaoX() {
		return posicaoX;
	}
	public int getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoXY(int posicaoX, int posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public int getTamanhoNavio() {
		return tamanhoNavio;
	}
	public void setTamanhoNavio(int tamanhoNavio) {
		this.tamanhoNavio = tamanhoNavio;
	}
	public void guardarPosicao () {
		
	}
}
