package fronteira;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class telaFinalDeJogo extends JPanel {

	/**
	 * Create the panel.
	 */
	public telaFinalDeJogo() {
		setLayout(null);
		
		JLabel lbFimDeJogo = new JLabel("Fim de Jogo");
		lbFimDeJogo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbFimDeJogo.setHorizontalAlignment(SwingConstants.CENTER);
		lbFimDeJogo.setBounds(156, 11, 138, 31);
		add(lbFimDeJogo);
		
		JLabel lbResultado = new JLabel("");
		lbResultado.setHorizontalAlignment(SwingConstants.CENTER);
		lbResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lbResultado.setBounds(55, 53, 340, 31);
		add(lbResultado);
		
		JButton btnReiniciarJogo = new JButton("Reiniciar jogo");
		btnReiniciarJogo.setBounds(55, 95, 340, 45);
		add(btnReiniciarJogo);
		
		JButton btnNovoJogo = new JButton("Novo Jogo");
		btnNovoJogo.setBounds(55, 151, 340, 45);
		add(btnNovoJogo);

	}
}
