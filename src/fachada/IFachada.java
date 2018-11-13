package fachada;

import java.util.List;

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

public interface IFachada {
//	Apartamento
	
	public  void salvarApartamento(Apartamento apartamento);
	public Apartamento buscarApartamentoPorId(int id);
	public List<Apartamento> getALLApartamneto();
	public  void editarAparatamento(Apartamento apartamento);
	public  void ativarDesativarApartamento(int id);
	
//Casa

	public  void salvarCasa(Casa casa);
	public Casa buscarCasaPorId(int id);
	public List<Casa> getALLCasa();
	public  void editarCasa(Casa casa);
	public  void ativarDesativarCasa(int id);

//Cliente
	
	public  void salvarCliente(Cliente cliente);
	public Cliente  buscarClientePorId(int id);
	public List<Cliente> getALLCliente();
	public  void editarCliente(Cliente cliente);
	public  void ativarDesativarCliente(int id);
	
//	Contato
	
	public  void salvarContato(Contato contato);
	public Contato  buscarContatoPorId(int id);
	public List<Contato> getALLContato();
	public  void editarContato(Contato contato);
	public  void ativarDesativarContato(int id);
	
//	Corretor
	
	public  void salvarCorretor(Corretor corretor);
	public Corretor  buscarCorretorPorId(int id);
	public List<Corretor > getALLCorretor();
	public  void editarCorretor(Corretor corretor);
	public  void ativarDesativarCorretor(int id);
	
//	Endereco
	
	public  void salvarEndereco(Endereco endereco);
	public Endereco  buscarEnderecoPorId(int id);
	public List<Endereco > getALLEndereco();
	public  void editarEndereco(Endereco endereco);
	public  void ativarDesativarEndereco(int id);
	
//	estado
	
	public  void salvarEstado(Estado estado);
	public Estado  buscarEstadoPorId(int id);
	public List<Estado> getALLEstado();
	public  void editarEstado(Estado estado);
	public  void ativarDesativarEstado(int id);
	
//	Imoveis
	
	public  void salvarImoveis(Imoveis imoveis);
	public Imoveis  buscarImoveisPorId(int id);
	public List<Imoveis> getALLImoveis();
	public  void editarImoveis(Imoveis imoveis);
	public  void ativarDesativarImoveis(int id);
	
//	Munucipios
	
	
	public  void salvarMunicipio(Municipio municipio);
	public Municipio buscarMunicipioPorId(int id);
	public List<Municipio> getALLMunicipio();
	public  void editarMunicipio(Municipio municipio);
	public  void ativarDesativarMunicipio(int id);
	
//	Proprietario
	
	public  void salvarProprietario (Proprietario proprietario);
	public Proprietario buscarProprietarioPorId(int id);
	public List<Proprietario> getALLProprietario ();
	public  void editarProprietario (Proprietario proprietario);
	public  void ativarDesativarProprietario (int id);
	
//	Vender
	
	public  void salvarVender(Vender vender);
	public Vender buscarVenderPorId(int id);
	public List<Vender> getALLVender();
	public  void editarVender(Vender vender);
	public  void ativarDesativarVender(int id);
	
	
	
	
}
