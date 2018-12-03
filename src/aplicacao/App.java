package aplicacao;

import controller.Controller;
import enuns.TipoContato;
import enuns.TipoDocumento;
import fachada.Fachada;
import fachada.IFachada;
import modelVO.Apartamento;
import modelVO.Casa;
import modelVO.Cliente;
import modelVO.Contato;
import modelVO.Corretor;
import modelVO.Endereco;
import modelVO.Estado;
import modelVO.Imoveis;
import modelVO.Municipio;
import modelVO.Proprietario;
import modelVO.Vender;
import view.TelaBuscar;
import view.TelaCadastro;
import view.TelaExibir;
import view.TelaInicial;
import view.TelaLogin;
import view.TelaVendas;

public class App {

	public static void main(String[] args) {
		 IFachada fachada1 = Fachada.getInstance();
//		 Imoveis imoveis= new Imoveis();
//		 imoveis.setValor(100.00);
//		 imoveis.setLargura(10.0);
//		 imoveis.setComprimento(10.0);
//		 imoveis.setRgImovel(100000);
//		 imoveis.setStatus("vendido");
//		 imoveis.setQntBanheiros(2);
//		 imoveis.setQntComodos(18);
//		 imoveis.setQntGarages(2);
//		 imoveis.setQntQuartos(3);
//		 imoveis.setQntSalas(2);
//		 imoveis.setAreaTotal(100.0);
//		 imoveis.setSuites(2);
//		 imoveis.setTipo("cazsa");
//		 fachada1.salvarImoveis(imoveis);
//		 Vender vender=new Vender();
//		 vender.setNumVendas(12);
//		 vender.setValorVenda(100.0);
//		 //vender.setValorTotal(vender.getValorVenda()-vender.getDesconto());
//		 vender.setDesconto(10);
//		 vender.setValorTotal(vender.getValorVenda()-vender.getDesconto());
//		 vender.setTipo("dinheiro");
//		 vender.setFormaPagamento("parcelado");
//		 vender.setDataVenda("10/10/18");
//		 fachada1.salvarVender(vender);
		 
		 //		 Municipio municipio=new Municipio();
//		 municipio.setNome("pernambuco");
//		 fachada1.salvarMunicipio(municipio);
		 
//		 Estado estado=new Estado();
//		 estado.setNome("manu");
//		 fachada1.salvarEstado(estado);
//		 Endereco endereco= new Endereco();
//		 endereco.setCep("4333");
//		 endereco.setRua("4333");
//		 endereco.setNumero("32");
//		 endereco.setBairro("redencao");
//		 endereco.setEstado("4333");
//		 fachada1.salvarEndereco(endereco);
		 
//       Proprietario proprietario=new Proprietario();
//    		   proprietario.setCpf("050");
//       proprietario.setNome("Heldon Jose");
//       proprietario.setTipo(TipoDocumento.CPF);
//       proprietario.setDocumento("11111");
//       fachada1.salvarProprietario(proprietario);
        
//        
//        Corretor corretor= new Corretor();
//        corretor.setCpf("050");
//        corretor.setNome("Heldon Jose");
//        corretor.setTipo(TipoDocumento.CPF);
//        corretor.setDocumento("11111");
//        fachada1.salvarCorretor(corretor);
//        0
//        Cliente cliente2 = new Cliente();
//        cliente2.setCpf("050");
//        cliente2.setNome("Heldon Jose");
//        cliente2.setTipo(TipoDocumento.CPF);
//        cliente2.setDocumento("11111");
//        
//        Apartamento apartamento =new Apartamento();
//        
//        apartamento.setPredio("edificio");
        
//        Endereco end  = new Endereco();
//        end.setCep("58701090");
//        end.setBairro("Santo Antonio");
//        end.setNumero("Q51L10");
//        end.setEstado("PB");
//        cliente.setEndereco(end);
//        
//        Contato contato1 = new Contato();
//        contato1.setTipo(TipoContato.EMAIL);
//        contato1.setDescricao("heldonjose@gmail.com");
        
        
//        Contato contato2 = new Contato();
//        contato2.setTipo(TipoContato.TELEFONE);
//        contato2.setDescricao("83-9-9627-9632");
//        
//        List<Contato> contatos = new ArrayList<>();
//        contatos.add(contato1);
//        contatos.add(contato2);
//        (
//        cliente.setContatos(contatos);
//       Casa casa= new Casa();
//       casa.setAreaConstruida(15.0);
//       fachada1.salvarCasa(casa);9
//       Contato contato= new Contato();
//       contato.setTipo(TipoContato.EMAIL);
//       contato.setDescricao("ekfioefhowiefoweif");
//       fachada1.salvarContato(contato);
       
//      // fachada1.salvarApartamento(apartamento);
		 TelaExibir telaExibir= new TelaExibir("EXIBIR", 900, 600);
		 TelaBuscar telaBuscar= new TelaBuscar("BUSCAR", 900, 600);
		 TelaVendas telaVendas= new TelaVendas("VENDAS", 900, 600);
      TelaCadastro telaCadastro= new TelaCadastro("CADASTRO", 900, 600);
      TelaLogin telaLogin= new TelaLogin("LOGIN", 900, 600);
      TelaInicial telaInicial= new TelaInicial("MENU", 900, 600);
      
//      		new TelaCadastro("CADASTRO", 900, 60
      Controller controller= new Controller(telaLogin, telaInicial, telaCadastro, telaExibir, telaBuscar, telaVendas);
        
    }

	

	

}
