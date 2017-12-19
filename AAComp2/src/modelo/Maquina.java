package modelo;

public abstract class Maquina {
	protected String tipoMaquina;
	protected int posicaoX;
	protected int posicaoY;
	protected int idJogador;
	
	public Maquina (){
		
	}
	
	public Maquina(String tipoMaquina, int posicaoX, int posicaoY) {
		this.tipoMaquina = tipoMaquina;
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
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
	
	public void disparar (int x, int y, Tabuleiro tabuleiro) {
		
	}
}
