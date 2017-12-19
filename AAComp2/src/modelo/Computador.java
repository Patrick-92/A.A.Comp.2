package modelo;

import java.util.Random;

public class Computador {
	private Tabuleiro tabuleiro;
	private int idMaquina;
	private int posicaoX;
	private int posicaoY;
	private Random gerador = new Random();
	
	public int[] decisaoComputador (Tabuleiro tabuleiro) {
		boolean flagPosicaoValida = false;
		int[] valores = new int[3];
		
		while (!flagPosicaoValida) {
			idMaquina = gerador.nextInt(2)+1;
			posicaoX = gerador.nextInt(8);
			posicaoY = gerador.nextInt(9);
			
			if (idMaquina == 1){
				if (posicaoX >= 0 && posicaoX <= 8) {
					if (posicaoY >= 0 && posicaoY <= 9) {
						if (tabuleiro.valorQuadrado(posicaoX, posicaoY) != 5 && tabuleiro.valorQuadrado(posicaoX, posicaoY) != 6){
							valores[0] = idMaquina;
							valores[1] = posicaoX;
							valores[2] = posicaoY;
							flagPosicaoValida = true;
						}
					}
				}
			}
			if (idMaquina == 2){
				if (posicaoX >= 0 && posicaoX <= 8) {
					if (posicaoY >= 0 && posicaoY <= 8) {
						if (tabuleiro.valorQuadrado(posicaoX, posicaoY) != 5 && tabuleiro.valorQuadrado(posicaoX, posicaoY) != 6){
							valores[0] = idMaquina;
							valores[1] = posicaoX;
							valores[2] = posicaoY;
							flagPosicaoValida = true;
						}
					} 
				}
			}
			if (idMaquina == 3){
				if (posicaoX >= 1 && posicaoX <= 7) {
					if (posicaoY >= 1 && posicaoY <= 8) {
						if (tabuleiro.valorQuadrado(posicaoX, posicaoY) != 5 && tabuleiro.valorQuadrado(posicaoX, posicaoY) != 6){
							valores[0] = idMaquina;
							valores[1] = posicaoX;
							valores[2] = posicaoY;
							flagPosicaoValida = true;
						}
					} 
				}
			}	
		}
		return valores;
	}
}
