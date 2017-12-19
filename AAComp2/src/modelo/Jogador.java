package modelo;

import java.util.ArrayList;

public class Jogador {
	private int idJogador;
	private String nomeJogador;
	private ArrayList<Maquina> maquinas;
	private Tabuleiro tabuleiro;
	
	public Jogador(int idJogador, String nomeJogador, Tabuleiro tabuleiro) {
		this.idJogador = idJogador;
		this.nomeJogador = nomeJogador;
		this.tabuleiro = tabuleiro;
		this.maquinas = tabuleiro.getMaquinas();
		
		for (Maquina maquina : maquinas) {
			maquina.setIdJogador(idJogador);
		}
		
	}
	public Maquina recuperarMaquina (int idMaquina) {
		return maquinas.get(idMaquina);
	}
	
	public int getIdJogador() {
		return idJogador;
	}
	public void setIdJogador(int idJogador) {
		this.idJogador = idJogador;
	}
	public String getNomeJogador() {
		return nomeJogador;
	}
	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}
	public ArrayList<Maquina> getMaquinas() {
		return maquinas;
	}
	public void setMaquinas(ArrayList<Maquina> maquinas) {
		this.maquinas = maquinas;
	}
	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}
	
}
