package view;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin extends TelaGeral {
	
	private JLabel loginLabel,senhaLabel,mbsLabel;
	private JTextField loginField,senhaField;
	private JButton entrarButton;
	

	public TelaLogin(String titulo, int x, int y) {
		super(titulo, x, y);
		JLabel	fundo= new JLabel(new ImageIcon(getClass().getClassLoader().getResource("fundo1.png")));
		mbsLabel= new JLabel("IMOBILIÁRIA");
		Font grande1= new Font("serif", Font.BOLD, 30);
		mbsLabel.setFont(grande1);
		mbsLabel.setForeground(Color.LIGHT_GRAY);
		setLayout(null);
		
		loginLabel = new JLabel("Login :");
		senhaLabel = new JLabel("Senha:");
		loginField= new JTextField(15);
		senhaField= new JTextField(15);
		entrarButton= new JButton("Enter");
		
		add(loginLabel).setBounds(600, 50, 100, 20);
		add(loginField).setBounds(650, 50, 200, 20);
		add(senhaLabel).setBounds(600, 100, 100, 20);
		add(senhaField).setBounds(650, 100, 200, 20);
		add(entrarButton).setBounds(750, 150, 100, 20);
		add(mbsLabel).setBounds(350, 420, 300, 50);
		add(fundo).setBounds(0, 0, 900, 600);
		setVisible(true);
		
	}


	public JTextField getLoginField() {
		return loginField;
	}


	public JTextField getSenhaField() {
		return senhaField;
	}


	public JButton getEntrarButton() {
		return entrarButton;
	}

}
