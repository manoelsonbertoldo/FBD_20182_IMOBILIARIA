package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends TelaGeral{
	private JButton voltarButton,salvarButton,sairButton;
	//label proprietario;
	private JLabel propLabel,pnomeLabel,pcpfLabel,prgLabel,pruaLabel,pbairroLabel
	               ,pcidadeLabel,pcepLabel,pestadoLabel,pcelularLabel,pemailLabel;
	private JTextField pnomeField,pcpfField,prgField,pruaField,pbairroField
    ,pcidadeField,pcepField,pestadoField,pcelularField,pemailField;
	//label imovel
	private JLabel dadosLabel,rgImovelLabel,valorLabel,ruaLabel,bairroLabel,cidadeLabel
    ,cepLabel,estadoLabel,larLabel,compLabel,areConsLabel,areTotLabel,
    comodosLabel,salasLabel,banLabel,quarLabel,suiLabel,cozLabel,garLabel;
    private JTextField rgImovelField,valorField,ruaField,bairroField,cidadeField
    ,cepLField,estadoField,larField,compField,areConsField,areTotField,
  comodosField,salasField,banField,quarField,suiField,cozField,garField;
	

	public TelaCadastro(String titulo, int x, int y) {
		super(titulo, x, y);
		proprietario();
		imovel();
		setSize(x,y);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		setVisible(false);
		voltarButton= new JButton(new ImageIcon ("resouce//botaoCad.png"));
		sairButton= new JButton(new ImageIcon ("resouce//botaoExit.png"));
		salvarButton= new JButton(new ImageIcon ("resouce//botaoVen.png"));
	}
	public void proprietario() {
		
		
		propLabel= new JLabel("DADOS PROPRIETÁRIO:");
		Font grande= new Font("serif", Font.BOLD, 20);
		propLabel.setFont(grande);
		propLabel.setForeground(Color.black);
		add(propLabel).setBounds(10, 0, 400, 20);
		
		pnomeLabel= new JLabel("NOME:");
		Font grande1= new Font("serif", Font.BOLD,15);
		pnomeLabel.setFont(grande1);
		pnomeLabel.setForeground(Color.black);
		add(pnomeLabel).setBounds(10, 35, 70, 20);
		pnomeField= new JTextField(20);
	    add(pnomeField).setBounds(100, 35, 200, 20);
	    
	    pcpfLabel= new JLabel("CPF:");
		Font grande2= new Font("serif", Font.BOLD,15);
		pcpfLabel.setFont(grande2);
		pcpfLabel.setForeground(Color.black);
		add(pcpfLabel).setBounds(320, 35, 50, 20);
		pcpfField= new JTextField(20);
	    add(pcpfField).setBounds(370, 35, 90, 20);
	    
	    prgLabel= new JLabel("RG:");
		Font grande3= new Font("serif", Font.BOLD,15);
		prgLabel.setFont(grande3);
		prgLabel.setForeground(Color.black);
		add(prgLabel).setBounds(500, 35, 50, 20);
		prgField= new JTextField(10);
	    add(prgField).setBounds(560, 35, 90, 20);
	    
	    
	    pruaLabel= new JLabel("RUA:");
		Font grande4= new Font("serif", Font.BOLD,15);
		pruaLabel.setFont(grande4);
		pruaLabel.setForeground(Color.black);
		add(pruaLabel).setBounds(10, 70, 100, 20);
		pruaField= new JTextField(20);
	    add(pruaField).setBounds(70, 70, 250, 20);
	    
	    pbairroLabel= new JLabel("BAIRRO:");
		Font grande5= new Font("serif", Font.BOLD,15);
		pbairroLabel.setFont(grande5);
		pbairroLabel.setForeground(Color.black);
		add(pbairroLabel).setBounds(400, 70, 70, 20);
		pbairroField= new JTextField(20);
	    add(pbairroField).setBounds(500, 70, 100, 20);
	    
	    pcidadeLabel= new JLabel("CIDADE:");
		Font grande6= new Font("serif", Font.BOLD,15);
		pcidadeLabel.setFont(grande6);
		pcidadeLabel.setForeground(Color.black);
		add(pcidadeLabel).setBounds(10, 105, 100, 20);
		pcidadeField= new JTextField(20);
	    add(pcidadeField).setBounds(90, 105, 120, 20);
	    
	    pcepLabel= new JLabel("CEP:");
		Font grande7= new Font("serif", Font.BOLD,15);
		pcepLabel.setFont(grande7);
		pcepLabel.setForeground(Color.black);
		add(pcepLabel).setBounds(250, 105, 80, 20);
		pcepField= new JTextField(20);
	    add(pcepField).setBounds(330, 105, 100, 20);
	    
	    pestadoLabel= new JLabel("ESTADO:");
		Font grande8= new Font("serif", Font.BOLD,15);
		pestadoLabel.setFont(grande8);
		pestadoLabel.setForeground(Color.black);
		add(pestadoLabel).setBounds(500, 105, 90, 20);
		pestadoField= new JTextField(20);
	    add(pestadoField).setBounds(600, 105, 100, 20);
	    
	    
	    pcelularLabel= new JLabel("TELEFONE:");
		Font grande9= new Font("serif", Font.BOLD,15);
		pcelularLabel.setFont(grande9);
		pcelularLabel.setForeground(Color.black);
		add(pcelularLabel).setBounds(10, 140, 100, 20);
		pcelularField= new JTextField(20);
	    add(pcelularField).setBounds(120, 140, 120, 20);
	    
	    pemailLabel= new JLabel("EMAIL:");
		Font grande10= new Font("serif", Font.BOLD,15);
		pemailLabel.setFont(grande10);
		pemailLabel.setForeground(Color.black);
		add(pemailLabel).setBounds(250,140, 80, 20);
		pemailField= new JTextField(20);
	    add(pemailField).setBounds(350, 140, 200, 20);
	    
	    
	    
		
		
		
		
		
		
		
		
		
	    
		
			
			
			
			
			
			
		    
			
			
		
		
	}
	public void imovel() {
		dadosLabel= new JLabel("DADOS IMÓVEL:");
		Font grande= new Font("serif", Font.BOLD, 20);
		dadosLabel.setFont(grande);
		dadosLabel.setForeground(Color.black);
		add(dadosLabel).setBounds(10, 175, 400, 20);
		
	}

}

