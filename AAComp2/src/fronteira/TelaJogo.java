package fronteira;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import computador.Computador;
import modelo.BatalhaNaval;
import modelo.Quadrado;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TelaJogo extends JFrame {

	private Quadrado[][] quadrados;
	private Quadrado[][] quadradosComputador;
	private int idJogadorVencedor = 0, posicaoXDisparo, posicaoYDisparo, posicaoXDisparoComputador, posicaoYDisparoComputador;
	private Computador computador = new Computador();
	private int[] parametros = new int[3];
	private int x, y;

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	/**
	 * Create the frame.
	 */
	public TelaJogo(BatalhaNaval jogo) {
		BatalhaNaval jogoBackup = jogo.retornaClone();
		quadrados = jogo.retornartabuleiro(0).getQuadrados();
		quadradosComputador = jogo.retornartabuleiro(1).getQuadrados();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton[][] buttons = new JButton[9][10];
		JButton[][] buttons2 = new JButton[9][10];
		
		int bPosicaoX = 10; //posição da coluna
		int bPosicaoY = 39; //posicao da linha
		
		for (int i = 0; i < 9; i++) {
			x = i;
			for (int j = 0; j < 10; j++) {
				y = j;
				buttons[i][j] = new JButton(String.valueOf(quadrados[i][j].getValor()));
				buttons[i][j].setFont(new Font("Tahoma", Font.PLAIN, 10));
//				buttons[i][j].addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent e) {
//						posicaoXDisparo = x;
//						posicaoYDisparo = y;
//					}
//				});
				if (quadrados[i][j].getValor() == 5){
					buttons[i][j].setBackground(Color.RED);
				}
				if (quadrados[i][j].getValor() == 6){
					buttons[i][j].setBackground(Color.cyan);
				}
				buttons[i][j].setBounds(bPosicaoX, bPosicaoY, 40, 34);
				contentPane.add(buttons[i][j]);
				bPosicaoX = bPosicaoX + 40;
			}
			bPosicaoY = bPosicaoY + 32;
			bPosicaoX = 10;
		}
		
		bPosicaoX = 450; //posição da coluna
		bPosicaoY = 39; //posicao da linha
		
		for (int i = 0; i < 9; i++) {
			x = i;
			for (int j = 0; j < 10; j++) {
				y = j;
					buttons2[i][j] = new JButton();
				buttons2[i][j].setFont(new Font("Tahoma", Font.PLAIN, 10));
				buttons2[i][j].addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				if (quadradosComputador[i][j].getValor() == 5){
					buttons2[i][j].setBackground(Color.RED);
				}
				if (quadradosComputador[i][j].getValor() == 6){
					buttons2[i][j].setBackground(Color.cyan);
				}
				buttons2[i][j].setText(String.valueOf(i)+String.valueOf(j));
				buttons2[i][j].setBounds(bPosicaoX, bPosicaoY, 40, 34);
				contentPane.add(buttons2[i][j]);
				bPosicaoX = bPosicaoX + 37;
			}
			bPosicaoY = bPosicaoY + 32;
			bPosicaoX = 450;
		}
		
		JButton button_180 = new JButton("Dica");
		button_180.setBounds(751, 11, 66, 23);
		contentPane.add(button_180);
		
		JButton button_181 = new JButton("Porta Avi\u00E3o");
		button_181.setBounds(10, 339, 111, 23);
		button_181.setEnabled(false);
		contentPane.add(button_181);
		
		JButton button_182 = new JButton("Submarino");
		button_182.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean EnabledButtonflag = false;
				
				for (int i = 0; i < quadrados.length; i++) {
					for (int j = 0; j < quadrados[0].length; j++) {
						if (quadrados[i][j].getValor() == 2){
							EnabledButtonflag = true;
						}
					}
				}
				
				if (!EnabledButtonflag) {
					button_182.setEnabled(false);
				}
				
				posicaoXDisparo = Integer.parseInt(textField.getText());
				posicaoYDisparo = Integer.parseInt(textField_1.getText());
				
				jogo.getJogadores().get(0).recuperarMaquina(1)
															.disparar(posicaoXDisparo, posicaoYDisparo, jogo.getJogadores().get(1).getTabuleiro());

				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
					idJogadorVencedor = 2;
					TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
					
					dispose();
					telaFinal.setVisible(true);
				
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
					idJogadorVencedor = 1;
					TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Você venceu o jogo!");
					
					dispose();
					telaFinal.setVisible(true);
				}
				
				parametros = computador.decisaoComputador(jogo.getJogadores().get(1).getTabuleiro());
				
				jogo.getJogadores().get(1).recuperarMaquina(parametros[0])
																.disparar(parametros[1], parametros[2], jogo.getJogadores().get(0).getTabuleiro());
				
				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
					idJogadorVencedor = 2;
					TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
					
					dispose();
					telaFinal.setVisible(true);
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
					idJogadorVencedor = 1;
					TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Você venceu o jogo!");
					
					dispose();
					telaFinal.setVisible(true);
				}
				jogo.getTabuleiros().get(0).desenharTabuleiro();
				jogo.getTabuleiros().get(1).desenharTabuleiro();
				
				posicaoXDisparo = 0;
				posicaoYDisparo = 0;
				
				TelaJogo atualizar = new TelaJogo(jogo);
				
				dispose();
				atualizar.setVisible(true);
				
				repaint();
				validate();
			}
		});
		button_182.setBounds(10, 373, 111, 23);
		contentPane.add(button_182);
		
		JButton button_183 = new JButton("Navio de Escolta");
		button_183.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean EnabledButtonflag = false;
				
				for (int i = 0; i < quadrados.length; i++) {
					for (int j = 0; j < quadrados[0].length; j++) {
						if (quadrados[i][j].getValor() == 3){
							EnabledButtonflag = true;
						}
					}
				}
				
				if (!EnabledButtonflag) {
					button_183.setEnabled(false);
				}
				
				posicaoXDisparo = Integer.parseInt(textField.getText());
				posicaoYDisparo = Integer.parseInt(textField_1.getText());
				
				jogo.getJogadores().get(0).recuperarMaquina(2)
															.disparar(posicaoXDisparo, posicaoYDisparo, jogo.getJogadores().get(1).getTabuleiro());

				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Você venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				}
				
				parametros = computador.decisaoComputador(jogo.getJogadores().get(1).getTabuleiro());
				
				jogo.getJogadores().get(1).recuperarMaquina(parametros[0])
																		.disparar(parametros[1], parametros[2], jogo.getJogadores().get(0).getTabuleiro());
				
				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup,"Você venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				}
				jogo.getTabuleiros().get(0).desenharTabuleiro();
				jogo.getTabuleiros().get(1).desenharTabuleiro();
				
				TelaJogo atualizar = new TelaJogo(jogo);
				
				dispose();
				atualizar.setVisible(true);
				
				repaint();
				validate();
			}
		});
		button_183.setBounds(10, 407, 111, 23);
		contentPane.add(button_183);
		
		JButton button_184 = new JButton("Caca");
		button_184.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean EnabledButtonflag = false;
				
				for (int i = 0; i < quadrados.length; i++) {
					for (int j = 0; j < quadrados[0].length; j++) {
						if (quadrados[i][j].getValor() == 4){
							EnabledButtonflag = true;
						}
					}
				}
				
				if (!EnabledButtonflag) {
					button_184.setEnabled(false);
				}
				
				posicaoXDisparo = Integer.parseInt(textField.getText());
				posicaoYDisparo = Integer.parseInt(textField_1.getText());
				
				jogo.getJogadores().get(0).recuperarMaquina(3)
															.disparar(posicaoXDisparo, posicaoYDisparo, jogo.getJogadores().get(1).getTabuleiro());

				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Você venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				}
				
				parametros = computador.decisaoComputador(jogo.getJogadores().get(1).getTabuleiro());
				
				jogo.getJogadores().get(1).recuperarMaquina(parametros[0])
																		.disparar(parametros[1], parametros[2], jogo.getJogadores().get(0).getTabuleiro());
				
				if (jogo.verificarTabuleiro(jogo.getJogadores().get(0).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 2;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "O computador venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				} else if (jogo.verificarTabuleiro(jogo.getJogadores().get(1).getTabuleiro().getQuadrados()) == false) {
				idJogadorVencedor = 1;
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Você venceu o jogo!");
				
				dispose();
				telaFinal.setVisible(true);
				}
				jogo.getTabuleiros().get(0).desenharTabuleiro();
				jogo.getTabuleiros().get(1).desenharTabuleiro();

				TelaJogo atualizar = new TelaJogo(jogo);
				
				dispose();
				atualizar.setVisible(true);
				
				repaint();
				validate();
			}
		});
		button_184.setBounds(10, 441, 111, 23);
		contentPane.add(button_184);
		
		JButton button_185 = new JButton("Sair");
		button_185.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaFinalDeJogo telaFinal = new TelaFinalDeJogo(jogoBackup, "Não houveram vencedores!");
				
				dispose();
				telaFinal.setVisible(true);
			}
		});
		button_185.setBounds(751, 439, 66, 23);
		contentPane.add(button_185);
		
		textField = new JTextField();
		textField.setBounds(164, 340, 39, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(164, 374, 39, 20);
		contentPane.add(textField_1);
		
		JLabel lblX = new JLabel("X:");
		lblX.setBounds(144, 343, 18, 14);
		contentPane.add(lblX);
		
		JLabel lblY = new JLabel("Y:");
		lblY.setBounds(144, 377, 18, 14);
		contentPane.add(lblY);
	}
}
