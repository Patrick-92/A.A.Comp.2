package modelo;

public class PortaAviao extends Maquina {
	private int tamanhoPortaAviao = 4;
	
	public PortaAviao(String tipoMaquina, int posicaoX, int posicaoY) {
		super(tipoMaquina, posicaoX, posicaoY);
		// TODO Auto-generated constructor stub
	}
	
	public void disparar (int x, int y, Tabuleiro tabuleiro) {
		System.out.println("Porta Avião não realiza disparos!");
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
	public int getTamanhoPortaAviao() {
		return tamanhoPortaAviao;
	}
	public void setTamanhoPortaAviao(int tamanhoPortaAviao) {
		this.tamanhoPortaAviao = tamanhoPortaAviao;
	}
	
	public void guardarPosicao(){
		
	}
	
}
