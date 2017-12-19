package modelo;

public class Submarino extends Maquina{
	private int tamanhoSubmarino = 2;
	
	public Submarino(String tipoMaquina, int posicaoX, int posicaoY) {
		super(tipoMaquina, posicaoX, posicaoY);
		// TODO Auto-generated constructor stub
	}
	
	public void disparar (int x, int y, Tabuleiro tabuleiro) {
		if (tabuleiro.valorQuadrado(x, y) == 1 || tabuleiro.valorQuadrado(x, y) == 2 || tabuleiro.valorQuadrado(x, y) == 3 || tabuleiro.valorQuadrado(x, y) == 4) {
			System.out.println("Acertou uma máquina inimiga!");
			tabuleiro.inserirValorQuadrado(x, y, 5);
		}
		else {
			System.out.println("Acertou na água!");
			tabuleiro.inserirValorQuadrado(x, y, 6);
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
	public int getTamanhoSubmarino() {
		return tamanhoSubmarino;
	}
	public void setTamanhoSubmarino(int tamanhoSubmarino) {
		this.tamanhoSubmarino = tamanhoSubmarino;
	}
	public void guardarPosicao () {
		
	}
}
