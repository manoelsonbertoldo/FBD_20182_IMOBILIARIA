package view;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaVendas extends TelaGeral{
//	private JButton cadastraButton,sairButton,buscarButton,exibirButton,vendasButton;
//	private JLabel cadastrarLabel,sairLabel,buscarLabel,exibirLabel,vendasLabel,mbsLabel;
	private JLabel cadastrarLabel,sairLabel;
	private JButton cadastraButton,sairButton;
	public TelaVendas(String titulo, int x, int y) {
		super(titulo, x, y);
		JLabel	fundo= new JLabel(new ImageIcon(getClass().getClassLoader().getResource("fundo1.png")));
		
	cadastrarLabel= new JLabel("VOLTAR");
//	buscarLabel=new JLabel("BUSCAR IMÓVEL");
//	exibirLabel=new JLabel("EXIBIR IMÓVEL");
	sairLabel=new JLabel("SAIR");
//	vendasLabel= new JLabel("VENDAS");
//mbsLabel= new JLabel("IMOBILIÁRIA");
	Font grande= new Font("serif", Font.BOLD, 18);
	Font grande1= new Font("serif", Font.BOLD, 30);
//	vendasLabel.setFont(grande);
//	vendasLabel.setForeground(Color.black);
//	mbsLabel.setFont(grande1);
//	mbsLabel.setForeground(Color.LIGHT_GRAY);
	cadastrarLabel.setFont(grande);
//	exibirLabel.setFont(grande);
//	buscarLabel.setFont(grande);
	sairLabel.setFont(grande);
	
    
	
		cadastraButton= new JButton(new ImageIcon ("resouce//botaoVolt.png"));
		sairButton= new JButton(new ImageIcon ("resouce//botaoExit.png"));
		//vendasButton= new JButton(new ImageIcon ("resouce//botaoVen.png"));
		
		//buscarButton =new JButton((new ImageIcon ("resouce//botaoPesq.png")));
		//exibirButton= new JButton(new ImageIcon ("resouce//botaoExibir.png"));
		
		add(cadastraButton).setBounds(650, 430, 100, 100);
		add(cadastrarLabel).setBounds(670, 530, 200, 50);
//		add(buscarButton).setBounds(300, 50, 100, 100);
//		add(buscarLabel).setBounds(300, 150, 150, 50);
//		add(exibirButton).setBounds(500, 50, 100, 100);
//		add(exibirLabel).setBounds(500, 150, 150, 50);
//		add(vendasButton).setBounds(700, 50, 100, 100);
//		add(vendasLabel).setBounds(720, 150, 150, 50);
		add(sairButton).setBounds(780, 430, 95, 95);
		add(sairLabel).setBounds(800, 530, 150, 50);
//		add(mbsLabel).setBounds(350, 420, 300, 50);
		add(fundo).setBounds(0, 0, 900, 600);
		
	setSize(x,y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		setVisible(false);
	}
	public JLabel getSairLabel() {
		return sairLabel;
	}
	public void setSairLabel(JLabel sairLabel) {
		this.sairLabel = sairLabel;
	}
	public JButton getSairButton() {
		return sairButton;
	}
	public void setSairButton(JButton sairButton) {
		this.sairButton = sairButton;
	}
	public JButton getCadastraButton() {
		return cadastraButton;
	}
	
	
		
	}


