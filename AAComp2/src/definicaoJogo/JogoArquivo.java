package definicaoJogo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class JogoArquivo extends DefinicaoJogo {
	
	public void definirParametro () throws ArrayIndexOutOfBoundsException, IOException{
		String caminho = "C:/Users/Patrick/Dropbox/Faculdade/2º período/A.A. Comp. 2/entrada.txt";
		BufferedReader leitura = new BufferedReader(new FileReader(caminho));
		String linha = "";
		char[] dados = new char[20];
		boolean flag = false;
		parametros = new int[8];
		
        while (true) {
            if (linha != null) {
            	dados = linha.toCharArray();
            	if (dados.length != 0) {
            		switch (Integer.parseInt(Character.toString(dados[0]))) {
					case 2:
						if (!flag) {
							parametros[2] = decodificarLinha(dados[2]);
							parametros[3] = Integer.parseInt(Character.toString(dados[3]))-1;
							flag = !flag;
						}else{
							parametros[6] = decodificarLinha(dados[2]);
							parametros[7] = Integer.parseInt(Character.toString(dados[3]))-1;
						}
						break;
					case 3:
						parametros[4] = decodificarLinha(dados[2]);
						parametros[5] = Integer.parseInt(Character.toString(dados[3]))-1;
						break;
					case 4:
						parametros[0] = decodificarLinha(dados[2]);
						parametros[1] = Integer.parseInt(Character.toString(dados[3]))-1;
						break;
					default:
						throw new ArrayIndexOutOfBoundsException();
					}
            	} 
            } else
                break;
            linha = leitura.readLine();
        }
        leitura.close();
		
		if (!(parametros[1]-1 <= parametros[3] && parametros[3] <= parametros[1]+3 && parametros[0] == parametros[2])) {
			if (!((parametros[1]-2 <= parametros[5] && parametros[5] <= parametros[1]+3 && parametros[0] == parametros[4])
				|| (parametros[3]-2 <= parametros[5] && parametros[5] <= parametros[3]+1 && parametros[2] == parametros[4]))) {
				if (!((parametros[1]-1 <= parametros[7] && parametros[7] <= parametros[1]+3 && parametros[0] == parametros[6])
					|| (parametros[3]-1 <= parametros[7] && parametros[7] <= parametros[3]+1 && parametros[2] == parametros[6])
					|| (parametros[5]-1 <= parametros[7] && parametros[7] <= parametros[5]+2 && parametros[4] == parametros[6]))) {
					
				} else {
					throw new ArrayIndexOutOfBoundsException();
				}
			} else {
				throw new ArrayIndexOutOfBoundsException();
			}
		} else {
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
	public int valorParametro (int posicao) {
		return parametros[posicao];
	}
	
	public int decodificarLinha (char letra) {
		switch (letra) {
		case 'A':
			return 0;		
		case 'B':
			return 1;
		case 'C':
			return 2;
		case 'D':
			return 3;
		case 'E':
			return 4;
		case 'F':
			return 5;
		case 'G':
			return 6;
		case 'H':
			return 7;
		case 'I':
			return 8;
		default:
			throw new ArrayIndexOutOfBoundsException();
		}
	}
	
}
