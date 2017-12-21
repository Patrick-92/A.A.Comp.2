package fronteira;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.BatalhaNaval;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaFinalDeJogo extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public TelaFinalDeJogo(BatalhaNaval jogo, String resultado) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Fim de Jogo");
		label.setText(resultado);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(10, 11, 414, 31);
		contentPane.add(label);
		
		JButton button = new JButton("Reiniciar jogo");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//TelaJogo telaJogo = new TelaJogo(jogo);
				
				//dispose();
				//telaJogo.setVisible(true);
			}
		});
		button.setBounds(47, 95, 340, 45);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Novo Jogo");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaInicial telaInicio = new TelaInicial();
				
				dispose();				
				telaInicio.setVisible(true);
			}
		});
		button_1.setBounds(47, 151, 340, 45);
		contentPane.add(button_1);
	}
	
	public void backRealizado () {
		
	}
}
