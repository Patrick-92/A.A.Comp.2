package fronteira;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import definicaoJogo.JogoAleatorio;
import definicaoJogo.JogoArquivo;
import modelo.BatalhaNaval;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class TelaDefinirJogo extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaDefinirJogo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 495, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Definir jogo");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(147, 11, 148, 35);
		contentPane.add(label);
		
		JButton button = new JButton("Carregar arquivo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JogoArquivo parametrosJogador = new JogoArquivo();
				try {
					parametrosJogador.definirParametro();
				} catch (ArrayIndexOutOfBoundsException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				JogoAleatorio parametrosComputador = new JogoAleatorio();
				parametrosComputador.definirParametro();
				
				for (int i = 0; i < 8; i++) {
					System.out.print(parametrosJogador.valorParametro(i) + " ");
					System.out.println(parametrosComputador.valorParametro(i));
				}
				
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
				
			}
		});
		button.setBounds(10, 57, 131, 33);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Definir Manualmente");
		button_1.setBounds(10, 95, 131, 33);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBounds(147, 139, 34, 28);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBounds(179, 139, 34, 28);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBounds(210, 139, 34, 28);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBounds(241, 139, 34, 28);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("");
		button_6.setBounds(274, 139, 34, 28);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("");
		button_7.setBounds(307, 139, 34, 28);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("");
		button_8.setBounds(340, 139, 34, 28);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("");
		button_9.setBounds(373, 139, 34, 28);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("");
		button_10.setBounds(404, 139, 34, 28);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("");
		button_11.setBounds(436, 139, 34, 28);
		contentPane.add(button_11);
		
		JButton button_12 = new JButton("");
		button_12.setBounds(147, 167, 34, 28);
		contentPane.add(button_12);
		
		JButton button_13 = new JButton("");
		button_13.setBounds(179, 167, 34, 28);
		contentPane.add(button_13);
		
		JButton button_14 = new JButton("");
		button_14.setBounds(210, 167, 34, 28);
		contentPane.add(button_14);
		
		JButton button_15 = new JButton("");
		button_15.setBounds(241, 167, 34, 28);
		contentPane.add(button_15);
		
		JButton button_16 = new JButton("");
		button_16.setBounds(274, 167, 34, 28);
		contentPane.add(button_16);
		
		JButton button_17 = new JButton("");
		button_17.setBounds(307, 167, 34, 28);
		contentPane.add(button_17);
		
		JButton button_18 = new JButton("");
		button_18.setBounds(340, 167, 34, 28);
		contentPane.add(button_18);
		
		JButton button_19 = new JButton("");
		button_19.setBounds(373, 167, 34, 28);
		contentPane.add(button_19);
		
		JButton button_20 = new JButton("");
		button_20.setBounds(404, 167, 34, 28);
		contentPane.add(button_20);
		
		JButton button_21 = new JButton("");
		button_21.setBounds(436, 167, 34, 28);
		contentPane.add(button_21);
		
		JButton button_22 = new JButton("");
		button_22.setBounds(147, 195, 34, 28);
		contentPane.add(button_22);
		
		JButton button_23 = new JButton("");
		button_23.setBounds(179, 195, 34, 28);
		contentPane.add(button_23);
		
		JButton button_24 = new JButton("");
		button_24.setBounds(210, 195, 34, 28);
		contentPane.add(button_24);
		
		JButton button_25 = new JButton("");
		button_25.setBounds(241, 195, 34, 28);
		contentPane.add(button_25);
		
		JButton button_26 = new JButton("");
		button_26.setBounds(274, 195, 34, 28);
		contentPane.add(button_26);
		
		JButton button_27 = new JButton("");
		button_27.setBounds(307, 195, 34, 28);
		contentPane.add(button_27);
		
		JButton button_28 = new JButton("");
		button_28.setBounds(340, 195, 34, 28);
		contentPane.add(button_28);
		
		JButton button_29 = new JButton("");
		button_29.setBounds(373, 195, 34, 28);
		contentPane.add(button_29);
		
		JButton button_30 = new JButton("");
		button_30.setBounds(404, 195, 34, 28);
		contentPane.add(button_30);
		
		JButton button_31 = new JButton("");
		button_31.setBounds(436, 195, 34, 28);
		contentPane.add(button_31);
		
		JButton button_32 = new JButton("");
		button_32.setBounds(147, 223, 34, 28);
		contentPane.add(button_32);
		
		JButton button_33 = new JButton("");
		button_33.setBounds(179, 223, 34, 28);
		contentPane.add(button_33);
		
		JButton button_34 = new JButton("");
		button_34.setBounds(210, 223, 34, 28);
		contentPane.add(button_34);
		
		JButton button_35 = new JButton("");
		button_35.setBounds(241, 223, 34, 28);
		contentPane.add(button_35);
		
		JButton button_36 = new JButton("");
		button_36.setBounds(274, 223, 34, 28);
		contentPane.add(button_36);
		
		JButton button_37 = new JButton("");
		button_37.setBounds(307, 223, 34, 28);
		contentPane.add(button_37);
		
		JButton button_38 = new JButton("");
		button_38.setBounds(340, 223, 34, 28);
		contentPane.add(button_38);
		
		JButton button_39 = new JButton("");
		button_39.setBounds(373, 223, 34, 28);
		contentPane.add(button_39);
		
		JButton button_40 = new JButton("");
		button_40.setBounds(404, 223, 34, 28);
		contentPane.add(button_40);
		
		JButton button_41 = new JButton("");
		button_41.setBounds(436, 223, 34, 28);
		contentPane.add(button_41);
		
		JButton button_42 = new JButton("");
		button_42.setBounds(147, 251, 34, 28);
		contentPane.add(button_42);
		
		JButton button_43 = new JButton("");
		button_43.setBounds(179, 251, 34, 28);
		contentPane.add(button_43);
		
		JButton button_44 = new JButton("");
		button_44.setBounds(210, 251, 34, 28);
		contentPane.add(button_44);
		
		JButton button_45 = new JButton("");
		button_45.setBounds(241, 251, 34, 28);
		contentPane.add(button_45);
		
		JButton button_46 = new JButton("");
		button_46.setBounds(274, 251, 34, 28);
		contentPane.add(button_46);
		
		JButton button_47 = new JButton("");
		button_47.setBounds(307, 251, 34, 28);
		contentPane.add(button_47);
		
		JButton button_48 = new JButton("");
		button_48.setBounds(340, 251, 34, 28);
		contentPane.add(button_48);
		
		JButton button_49 = new JButton("");
		button_49.setBounds(373, 251, 34, 28);
		contentPane.add(button_49);
		
		JButton button_50 = new JButton("");
		button_50.setBounds(404, 251, 34, 28);
		contentPane.add(button_50);
		
		JButton button_51 = new JButton("");
		button_51.setBounds(436, 251, 34, 28);
		contentPane.add(button_51);
		
		JButton button_52 = new JButton("");
		button_52.setBounds(147, 279, 34, 28);
		contentPane.add(button_52);
		
		JButton button_53 = new JButton("");
		button_53.setBounds(179, 279, 34, 28);
		contentPane.add(button_53);
		
		JButton button_54 = new JButton("");
		button_54.setBounds(210, 279, 34, 28);
		contentPane.add(button_54);
		
		JButton button_55 = new JButton("");
		button_55.setBounds(241, 279, 34, 28);
		contentPane.add(button_55);
		
		JButton button_56 = new JButton("");
		button_56.setBounds(274, 279, 34, 28);
		contentPane.add(button_56);
		
		JButton button_57 = new JButton("");
		button_57.setBounds(307, 279, 34, 28);
		contentPane.add(button_57);
		
		JButton button_58 = new JButton("");
		button_58.setBounds(340, 279, 34, 28);
		contentPane.add(button_58);
		
		JButton button_59 = new JButton("");
		button_59.setBounds(373, 279, 34, 28);
		contentPane.add(button_59);
		
		JButton button_60 = new JButton("");
		button_60.setBounds(404, 279, 34, 28);
		contentPane.add(button_60);
		
		JButton button_61 = new JButton("");
		button_61.setBounds(436, 279, 34, 28);
		contentPane.add(button_61);
		
		JButton button_62 = new JButton("");
		button_62.setBounds(147, 307, 34, 28);
		contentPane.add(button_62);
		
		JButton button_63 = new JButton("");
		button_63.setBounds(179, 307, 34, 28);
		contentPane.add(button_63);
		
		JButton button_64 = new JButton("");
		button_64.setBounds(210, 307, 34, 28);
		contentPane.add(button_64);
		
		JButton button_65 = new JButton("");
		button_65.setBounds(241, 307, 34, 28);
		contentPane.add(button_65);
		
		JButton button_66 = new JButton("");
		button_66.setBounds(274, 307, 34, 28);
		contentPane.add(button_66);
		
		JButton button_67 = new JButton("");
		button_67.setBounds(307, 307, 34, 28);
		contentPane.add(button_67);
		
		JButton button_68 = new JButton("");
		button_68.setBounds(340, 307, 34, 28);
		contentPane.add(button_68);
		
		JButton button_69 = new JButton("");
		button_69.setBounds(373, 307, 34, 28);
		contentPane.add(button_69);
		
		JButton button_70 = new JButton("");
		button_70.setBounds(404, 307, 34, 28);
		contentPane.add(button_70);
		
		JButton button_71 = new JButton("");
		button_71.setBounds(436, 307, 34, 28);
		contentPane.add(button_71);
		
		JButton button_72 = new JButton("");
		button_72.setBounds(147, 334, 34, 28);
		contentPane.add(button_72);
		
		JButton button_73 = new JButton("");
		button_73.setBounds(179, 334, 34, 28);
		contentPane.add(button_73);
		
		JButton button_74 = new JButton("");
		button_74.setBounds(210, 334, 34, 28);
		contentPane.add(button_74);
		
		JButton button_75 = new JButton("");
		button_75.setBounds(241, 334, 34, 28);
		contentPane.add(button_75);
		
		JButton button_76 = new JButton("");
		button_76.setBounds(274, 334, 34, 28);
		contentPane.add(button_76);
		
		JButton button_77 = new JButton("");
		button_77.setBounds(307, 334, 34, 28);
		contentPane.add(button_77);
		
		JButton button_78 = new JButton("");
		button_78.setBounds(340, 334, 34, 28);
		contentPane.add(button_78);
		
		JButton button_79 = new JButton("");
		button_79.setBounds(373, 334, 34, 28);
		contentPane.add(button_79);
		
		JButton button_80 = new JButton("");
		button_80.setBounds(404, 334, 34, 28);
		contentPane.add(button_80);
		
		JButton button_81 = new JButton("");
		button_81.setBounds(436, 334, 34, 28);
		contentPane.add(button_81);
		
		JButton button_82 = new JButton("");
		button_82.setBounds(147, 362, 34, 28);
		contentPane.add(button_82);
		
		JButton button_83 = new JButton("");
		button_83.setBounds(179, 362, 34, 28);
		contentPane.add(button_83);
		
		JButton button_84 = new JButton("");
		button_84.setBounds(210, 362, 34, 28);
		contentPane.add(button_84);
		
		JButton button_85 = new JButton("");
		button_85.setBounds(241, 362, 34, 28);
		contentPane.add(button_85);
		
		JButton button_86 = new JButton("");
		button_86.setBounds(274, 362, 34, 28);
		contentPane.add(button_86);
		
		JButton button_87 = new JButton("");
		button_87.setBounds(307, 362, 34, 28);
		contentPane.add(button_87);
		
		JButton button_88 = new JButton("");
		button_88.setBounds(340, 362, 34, 28);
		contentPane.add(button_88);
		
		JButton button_89 = new JButton("");
		button_89.setBounds(373, 362, 34, 28);
		contentPane.add(button_89);
		
		JButton button_90 = new JButton("");
		button_90.setBounds(404, 362, 34, 28);
		contentPane.add(button_90);
		
		JButton button_91 = new JButton("");
		button_91.setBounds(436, 362, 34, 28);
		contentPane.add(button_91);
		
		JButton button_92 = new JButton("Porta Avi\u00E3o");
		button_92.setBounds(30, 265, 111, 23);
		contentPane.add(button_92);
		
		JButton button_93 = new JButton("Submarino");
		button_93.setBounds(30, 299, 111, 23);
		contentPane.add(button_93);
		
		JButton button_94 = new JButton("Navio de Escolta");
		button_94.setBounds(30, 333, 111, 23);
		contentPane.add(button_94);
		
		JButton button_95 = new JButton("Ca\u00E7a");
		button_95.setBounds(30, 367, 111, 23);
		contentPane.add(button_95);
	}

}
