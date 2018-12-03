package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Mensagens;
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
		
		
		
		///////////////////////////Botões tela Login/////////////////
		telaLogin.getEntrarButton().addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				telaLogin.setVisible(false);
				telaInicial.setVisible(true);
				
				
			}
		});
		
		///////////////////////fim////////////////////
		
		///////////Botões tela Inicial "MENU"/////////////////
		
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

///////////////////////fim////////////////////

///////////Botões tela Vendas/////////////////


telaVendas.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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


///////////////////////fim////////////////////

///////////Botões tela Exibir/////////////////


telaExibir.getCadastraButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaExibir.setVisible(false);
		telaInicial.setVisible(true);
	}
});

telaExibir.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
});


///////////////////////fim////////////////////

///////////Botões tela Buscar/////////////////



telaBuscar.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
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


/////////////////////Botões tela Cadastro//////////////////////


telaCadastro.getSairButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
		
	}
});
telaCadastro.getVoltarButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		telaCadastro.setVisible(false);
		telaInicial.setVisible(true);
	}
});
telaCadastro.getSalvarButton().addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Mensagens.mensagemSalvar("Dados Salvo com Sucesso!");
	}
});



	}
}      
