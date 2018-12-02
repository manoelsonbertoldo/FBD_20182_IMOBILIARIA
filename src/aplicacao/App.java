package aplicacao;

import controller.Controller;
import enuns.TipoDocumento;
import fachada.Fachada;
import fachada.IFachada;
import modelVO.Apartamento;
import modelVO.Cliente;
import view.TelaCadastro;
import view.TelaInicial;
import view.TelaLogin;

public class App {

	public static void main(String[] args) {
		 IFachada fachada1 = Fachada.getInstance();
        Cliente cliente = new Cliente();
        cliente.setCpf("050");
        cliente.setNome("Heldon Jose");
        cliente.setTipo(TipoDocumento.CPF);
        cliente.setDocumento("11111");
        
//        
//        Cliente cliente1 = new Cliente();
//        cliente1.setCpf("050");
//        cliente1.setNome("Heldon Jose");
//        cliente1.setTipo(TipoDocumento.CPF);
//        cliente1.setDocumento("11111");
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
//        
//        cliente.setContatos(contatos);
        
       //fachada1.salvarCliente(cliente);
      // fachada1.salvarApartamento(apartamento);
      TelaCadastro cadastro= new TelaCadastro("CADASTRO", 900, 600);
      TelaLogin telaLogin= new TelaLogin("LOGIN", 900, 600);
      TelaInicial telaInicial= new TelaInicial("MENU", 900, 600);
      Controller control= new Controller(telaLogin, telaInicial,cadastro);
//      		new TelaCadastro("CADASTRO", 900, 600);
    
        
    }

	

}
