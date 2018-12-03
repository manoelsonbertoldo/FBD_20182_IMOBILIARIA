package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.TelaBuscar;
import view.TelaCadastro;
import view.TelaExibir;
import view.TelaInicial;
import view.TelaLogin;
import view.TelaVendas;

public class Controller {
	TelaLogin telaLogin;
	TelaInicial telaInicial;
	TelaCadastro  telaCadastro;
	TelaExibir telaExibir;
	TelaBuscar telaBuscar;
	TelaVendas telaVendas;
	public Controller(TelaLogin telaLogin, TelaInicial telaInicial,TelaCadastro  telaCadastro,TelaExibir telaExibir,TelaBuscar telaBuscar,TelaVendas telaVendas) {
		super();
		this.telaLogin = telaLogin;
		this.telaInicial = telaInicial;
		this.telaCadastro = telaCadastro;
		this.telaExibir=telaExibir;
		this.telaBuscar=telaBuscar;
		this.telaVendas=telaVendas;
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
telaInicial.getExibirButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaInicial.setVisible(false);
		telaExibir.setVisible(true);
	}
});
telaInicial.getBuscarButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaInicial.setVisible(false);
		telaBuscar.setVisible(true);
	}
});
telaInicial.getVendasButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaInicial.setVisible(false);
		telaVendas.setVisible(true);
	}
});
telaVendas.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
});
telaExibir.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
});
telaBuscar.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
});
telaExibir.getCadastraButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaExibir.setVisible(false);
		telaInicial.setVisible(true);
	}
});
telaBuscar.getCadastraButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaBuscar.setVisible(false);
		telaInicial.setVisible(true);
	}
});
telaVendas.getCadastraButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaVendas.setVisible(false);
		telaInicial.setVisible(true);
	}
});


	}
}      
