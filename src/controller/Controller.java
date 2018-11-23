package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaCadastro;
import view.TelaInicial;
import view.TelaLogin;

public class Controller {
	TelaLogin telaLogin;
	TelaInicial telaInicial;
	TelaCadastro  telaCadastro;
	public Controller(TelaLogin telaLogin, TelaInicial telaInicial,TelaCadastro  telaCadastro) {
		super();
		this.telaLogin = telaLogin;
		this.telaInicial = telaInicial;
		this.telaCadastro = telaCadastro;
		
		telaLogin.getEntrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaLogin.setVisible(false);
				telaInicial.setVisible(true);
				
				
			}
		});
		telaInicial.getSairButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
telaInicial.getCadastraButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				telaInicial.setVisible(false);
				telaCadastro.setVisible(true);
			}
		});
	}
}      
