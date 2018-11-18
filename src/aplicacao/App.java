package aplicacao;

import enuns.TipoDocumento;
import fachada.Fachada;
import fachada.IFachada;
import modelVO.Cliente;

public class App {

	public static void main(String[] args) {
		 IFachada fachada1 = Fachada.getInstance();
        Cliente cliente = new Cliente();
        cliente.setCpf("050");
        cliente.setNome("Heldon Jose");
        cliente.setTipo(TipoDocumento.CPF);
        cliente.setDocumento("11111");
        
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
        
        fachada1.salvarCliente(cliente);
     
        
    }

	

}
