package modelo;

import java.util.ArrayList;
import java.util.Scanner;

import computador.Computador;

public class BatalhaNaval {
	private ArrayList<Tabuleiro> tabuleiros = new ArrayList<Tabuleiro>(2);
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>(2);
	
	public void configurarTabuleiro(int posicaoPortaAviaoX, int posicaoPortaAviaoY, int posicaoSubmarinoX, int posicaoSubmarinoY, 
									int posicaoNavioX, int posicaoNavioY, int posicaoCacaY, int posicaoCacaX){
		
		Tabuleiro tabuleiroJogador = new Tabuleiro(posicaoPortaAviaoX, posicaoPortaAviaoY, 
				  posicaoSubmarinoX, posicaoSubmarinoY, posicaoNavioX, posicaoNavioY, posicaoCacaY, posicaoCacaX);
		tabuleiros.add(tabuleiroJogador);
	}
	
	public void configurarJogador(int idJogador, String nomeJogador, Tabuleiro tabuleiroJogador){
		Jogador jogador = new Jogador(idJogador, nomeJogador, tabuleiroJogador);
		jogadores.add(jogador);
		
	}
	
	public void iniciarJogo(){
		int idJogadorVencedor = 0, idMaquina = 0, posicaoX, posicaoY;
		Scanner entrada = new Scanner(System.in);
		
		tabuleiros.get(0).desenharTabuleiro();
		tabuleiros.get(1).desenharTabuleiro();
		
		while (idJogadorVencedor != 1 || idJogadorVencedor != 2) {
			Computador computador = new Computador();
			int[] parametros = new int[3];
			
			System.out.println("Digite o id da máquina que você vai utilizar:");
			idMaquina = entrada.nextInt();
			System.out.println("Digite a posição x de ataque:");
			posicaoX = entrada.nextInt();
			System.out.println("Digite a posição y de ataque:");
			posicaoY = entrada.nextInt();
			System.out.println("Id da Máquina: " + idMaquina + "\nPosição de ataque x: " + posicaoX + "\nPosição de ataque y: " + posicaoY);
			jogadores.get(0).recuperarMaquina(idMaquina)
														.disparar(posicaoX, posicaoY, jogadores.get(1).getTabuleiro());
			
			if (verificarTabuleiro(jogadores.get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
			} else if (verificarTabuleiro(jogadores.get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
			}
			
			parametros = computador.decisaoComputador(jogadores.get(1).getTabuleiro());
			
			jogadores.get(1).recuperarMaquina(parametros[0])
														.disparar(parametros[1], parametros[2], jogadores.get(0).getTabuleiro());
			
			if (verificarTabuleiro(jogadores.get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
			} else if (verificarTabuleiro(jogadores.get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
			}
			
			
			
			tabuleiros.get(0).desenharTabuleiro();
			tabuleiros.get(1).desenharTabuleiro();
		}
	} 
	
	public boolean verificarTabuleiro (Quadrado[][] quadrado) {
		for (int i = 0; i < quadrado.length; i++) {
			for (int j = 0; j < quadrado[0].length; j++) {
				if (quadrado[i][j].getValor() == 1 || quadrado[i][j].getValor() == 2 || quadrado[i][j].getValor() == 3 || quadrado[i][j].getValor() == 4) {
					return true;
				}
			}
		}
		return false;
	}
	
	public Tabuleiro retornartabuleiro (int numeroTabuleiro){
		return tabuleiros.get(numeroTabuleiro);
	}
	
	public ArrayList<Tabuleiro> getTabuleiros() {
		return tabuleiros;
	}
	public void setTabuleiros(ArrayList<Tabuleiro> tabuleiros) {
		this.tabuleiros = tabuleiros;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
}
