package modelo;

import java.util.ArrayList;

public class Tabuleiro {
	static private int larguraTab;
	static private int alturaTab;
	private Quadrado[][] quadrados;
	private ArrayList<Maquina> maquinas;
	
	public Tabuleiro(int posicaoPortaAviaoX, int posicaoPortaAviaoY, 
					 int posicaoSubmarinoX, int posicaoSubmarinoY, int posicaoNavioX, int posicaoNavioY, int posicaoCacaY, int posicaoCacaX) {
		Tabuleiro.larguraTab = 10;
		Tabuleiro.alturaTab = 10;
		this.quadrados = new Quadrado[9][10];
		this.maquinas = new ArrayList<Maquina>(4);
		maquinas.add(new PortaAviao("Porta Avião", posicaoPortaAviaoX, posicaoPortaAviaoY));
		maquinas.add(new Submarino("Submarino", posicaoSubmarinoX, posicaoSubmarinoY));
		maquinas.add(new Navio("Navio", posicaoNavioX, posicaoNavioY));
		maquinas.add(new Caca("Caça", posicaoCacaX, posicaoCacaY));
		
		for (int i = 0; i < quadrados.length; i++) {
			for (int j = 0; j < quadrados[0].length; j++) {
				quadrados[i][j] = new Quadrado(0, i, j);
			}
		}
		
		for (Maquina maquina : maquinas) {
			if (maquina.getTipoMaquina().equals("Porta Avião")) {
				for (int j = 0; j < 4; j++) {
					quadrados[posicaoPortaAviaoX][posicaoPortaAviaoY+j].setValor(1);
				}
				
			}
			if (maquina.getTipoMaquina().equals("Submarino")) {
				for (int j = 0; j < 2; j++) {
					quadrados[posicaoSubmarinoX][posicaoSubmarinoY+j].setValor(2);
				}
			}
			if (maquina.getTipoMaquina().equals("Navio")) {
				for (int j = 0; j < 3; j++) {
					quadrados[posicaoNavioX][posicaoNavioY+j].setValor(3);
				}
			}
			else {
				for (int j = 0; j < 2; j++) {
					quadrados[posicaoCacaX][posicaoCacaY+j].setValor(4);
				}
			}
		}
	}
	
	public void desenharTabuleiro(){
		for (int i = 0; i < quadrados.length; i++) {
			for (int j = 0; j < quadrados[0].length; j++) {
				System.out.print(quadrados[i][j].getValor()/* + " " + quadrados[i][j].getPosicaoX() + " " + quadrados[i][j].getPosicaoY()*/);
			}
			System.out.println();
		}
		System.out.println(quadrados.length);
	}
	
	public static void setLarguraTab(int larguraTab) {
		Tabuleiro.larguraTab = larguraTab;
	}

	public static void setAlturaTab(int alturaTab) {
		Tabuleiro.alturaTab = alturaTab;
	}

	public void inserirMaquina (Maquina maquina){
		this.maquinas.add(maquina);
	}
	
	public Maquina recuperarMaquina (String tipoMaquina){
		for (Maquina maquina : maquinas) {
			if (maquina.getTipoMaquina().equals(tipoMaquina)) { 
				return maquina;
			}
		}
		return null;
	}

	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}

	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	
	public int valorQuadrado (int x, int y) {
		return quadrados[x][y].getValor();
	}
	
	public void inserirValorQuadrado (int x, int y, int valor) {
		quadrados[x][y].setValor(valor);
	}

	public Quadrado[][] getQuadrados() {
		return quadrados;
	}

	public void setQuadrados(Quadrado[][] quadrados) {
		this.quadrados = quadrados;
	}
	
	
}
