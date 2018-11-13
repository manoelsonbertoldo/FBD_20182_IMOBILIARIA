package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaLogin extends TelaGeral {
	
	private JLabel loginLabel,senhaLabel;
	private JTextField loginField,senhaField;
	private JButton entrarButton;
	

	public TelaLogin(String titulo, int x, int y) {
		super(titulo, x, y);
		
		setLayout(new FlowLayout());
		
		loginLabel = new JLabel("Login :");
		senhaLabel = new JLabel("Senha:");
		loginField= new JTextField(15);
		senhaField= new JTextField(15);
		entrarButton= new JButton("Enter");
		
		add(loginLabel);
		add(loginField);
		add(senhaLabel);
		add(senhaField);
		add(entrarButton);
		
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
