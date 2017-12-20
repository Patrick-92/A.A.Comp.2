package modelo;

public class Caca extends Maquina {
	private int tamanhoCaca = 2;
	
	public Caca(String tipoMaquina, int posicaoX, int posicaoY) {
		super(tipoMaquina, posicaoX, posicaoY);
		// TODO Auto-generated constructor stub
	}

	public void disparar (int x, int y, Tabuleiro tabuleiro) {
		boolean flag = false;
		for (int i = x-1; i < x+2; i++) {
			for (int j = y-1; j < y+2; j++) {
				if (flag == true & (tabuleiro.valorQuadrado(i, j) == 1 || tabuleiro.valorQuadrado(i, j) == 2 || tabuleiro.valorQuadrado(i, j) == 3 || tabuleiro.valorQuadrado(i, j) == 4)) {
					System.out.println("Acertou uma máquina inimiga!");
					tabuleiro.inserirValorQuadrado(i, j, 5);
				}
				else if (flag == true & (tabuleiro.valorQuadrado(i, j) == 0)) {
					System.out.println("Acertou na água!");
					tabuleiro.inserirValorQuadrado(i, j, 6);
				}
				flag = !flag;
			}
			if (tabuleiro.valorQuadrado(x, y) == 1 && tabuleiro.valorQuadrado(x, y) == 2 && tabuleiro.valorQuadrado(x, y) == 3 && tabuleiro.valorQuadrado(x, y) == 4) {
				System.out.println("Acertou uma máquina inimiga!");
				tabuleiro.inserirValorQuadrado(x, y, 5);
			}
			else {
				System.out.println("Acertou na água!");
				tabuleiro.inserirValorQuadrado(x, y, 6);
			}
		}
		
		
//		if (tabuleiro.valorQuadrado(x, y) == 1 && tabuleiro.valorQuadrado(x, y) == 2 && tabuleiro.valorQuadrado(x, y) == 3 && tabuleiro.valorQuadrado(x, y) == 4) {
//			System.out.println("Acertou uma máquina inimiga!");
//			tabuleiro.inserirValorQuadrado(x, y, 5);
//		}
//		if (tabuleiro.valorQuadrado(x, y+1) == 1 && tabuleiro.valorQuadrado(x, y+1) == 2 && tabuleiro.valorQuadrado(x, y+1) == 3 && tabuleiro.valorQuadrado(x, y+1) == 4) {
//			System.out.println("Acertou uma máquina inimiga!");
//			tabuleiro.inserirValorQuadrado(x, y+1, 5);
//		}
//		if (tabuleiro.valorQuadrado(x+1, y) == 1 && tabuleiro.valorQuadrado(x+1, y) == 2 && tabuleiro.valorQuadrado(x+1, y) == 3 && tabuleiro.valorQuadrado(x+1, y) == 4) {
//			System.out.println("Acertou uma máquina inimiga!");
//			tabuleiro.inserirValorQuadrado(x+1, y, 5);
//		}
//		if (tabuleiro.valorQuadrado(x, y-1) == 1 && tabuleiro.valorQuadrado(x, y-1) == 2 && tabuleiro.valorQuadrado(x, y-1) == 3 && tabuleiro.valorQuadrado(x, y-1) == 4) {
//			System.out.println("Acertou uma máquina inimiga!");
//			tabuleiro.inserirValorQuadrado(x, y+1, 5);
//		}
//		if (tabuleiro.valorQuadrado(x-1, y) == 1 && tabuleiro.valorQuadrado(x-1, y) == 2 && tabuleiro.valorQuadrado(x-1, y) == 3 && tabuleiro.valorQuadrado(x-1, y) == 4) {
//			System.out.println("Acertou uma máquina inimiga!");
//			tabuleiro.inserirValorQuadrado(x, y+1, 5);
//		}
//		else {
//			System.out.println("Acertou na água!");
//			tabuleiro.inserirValorQuadrado(x, y, 6);
//		}
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
	public int getTamanhoCaca() {
		return tamanhoCaca;
	}
	public void setTamanhoCaca(int tamanhoCaca) {
		this.tamanhoCaca = tamanhoCaca;
	}
	public void guardarPosicao () {
		
	}
}
