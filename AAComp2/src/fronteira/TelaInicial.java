package fronteira;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import definicaoJogo.JogoAleatorio;
import modelo.BatalhaNaval;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Batalha Naval");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 40));
		label.setBounds(34, 23, 375, 62);
		contentPane.add(label);
		
		JButton button = new JButton("Jogo Aleat\u00F3rio");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				JogoAleatorio parametrosJogador = new JogoAleatorio();
				JogoAleatorio parametrosComputador = new JogoAleatorio();
				
				parametrosJogador.definirParametro();
				parametrosComputador.definirParametro();
				
//				for (int i = 0; i < 8; i++) {
//					System.out.print(parametrosJogador.valorParametro(i) + " ");
//					System.out.println(parametrosComputador.valorParametro(i));
//				}
				
				BatalhaNaval jogo = new BatalhaNaval();
				jogo.configurarTabuleiro(parametrosJogador.valorParametro(0), parametrosJogador.valorParametro(1), parametrosJogador.valorParametro(2),
										parametrosJogador.valorParametro(3), parametrosJogador.valorParametro(4), parametrosJogador.valorParametro(5),
										parametrosJogador.valorParametro(6), parametrosJogador.valorParametro(7));
				jogo.configurarTabuleiro(parametrosComputador.valorParametro(0), parametrosComputador.valorParametro(1), parametrosComputador.valorParametro(2),
										parametrosComputador.valorParametro(3), parametrosComputador.valorParametro(4), parametrosComputador.valorParametro(5), 
										parametrosComputador.valorParametro(6), parametrosComputador.valorParametro(7));
				jogo.configurarJogador(0, "Patrick", jogo.retornartabuleiro(0));
				jogo.configurarJogador(1, "Computador", jogo.retornartabuleiro(1));
				
				TelaJogo frameJogo = new TelaJogo(jogo);
				
				dispose();				
				frameJogo.setVisible(true);
				
				//jogo.iniciarJogo();
			}
		});
		button.setBounds(126, 96, 196, 44);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Definir Jogo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaDefinirJogo telaDefinicao = new TelaDefinirJogo();
				
				dispose();				
				telaDefinicao.setVisible(true);
			}
		});
		button_1.setBounds(126, 151, 196, 44);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Sair");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button_2.setBounds(126, 206, 196, 44);
		contentPane.add(button_2);
	}
}
