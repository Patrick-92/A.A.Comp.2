package fronteira;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JPanel {

	/**
	 * Create the panel.
	 */
	public TelaInicial() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Batalha Naval");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 23, 375, 62);
		add(lblNewLabel);
		
		JButton btnJogoAleatorio = new JButton("Jogo Aleat\u00F3rio");
		btnJogoAleatorio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnJogoAleatorio.setBounds(131, 96, 196, 44);
		add(btnJogoAleatorio);
		
		JButton btnDefinirJogo = new JButton("Definir Jogo");
		btnDefinirJogo.setBounds(131, 151, 196, 44);
		add(btnDefinirJogo);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setBounds(131, 206, 196, 44);
		add(btnSair);

	}
}
