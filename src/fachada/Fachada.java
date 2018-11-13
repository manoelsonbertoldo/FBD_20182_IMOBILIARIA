package fachada;

import java.util.List;

import modelBO.ApartamentoBO;
import modelBO.CasaBO;
import modelBO.ClienteBO;
import modelBO.ContatoBO;
import modelBO.CorretorBO;
import modelBO.EnderecoBO;
import modelBO.EstadoBO;
import modelBO.IApartamentoBO;
import modelBO.ICasaBO;
import modelBO.IClienteBO;
import modelBO.IContatoBO;
import modelBO.ICorretorBO;
import modelBO.IEnderecoBO;
import modelBO.IEstadoBO;
import modelBO.IImoveisBO;
import modelBO.IMunicipioBO;
import modelBO.IProprietarioBO;
import modelBO.IVenderBO;
import modelBO.ImoveisBO;
import modelBO.MunicipioBO;
import modelBO.ProprietarioBO;
import modelBO.VenderBO;
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

public class Fachada implements IFachada{
	
	private static Fachada instance;
	
	private IApartamentoBO apartamentoBO;
	private ICasaBO casaBO;
	private IClienteBO clienteBO;
	private IContatoBO contatoBO;
	private ICorretorBO corretorBO;
	private IEnderecoBO enderecoBO;
	private IEstadoBO estadoBO;
	private IImoveisBO imoveisBO;
	private IMunicipioBO municipioBO;
	private IProprietarioBO proprietarioBO;
	private IVenderBO venderBO;
	
	
	
	
	private Fachada() {
		
		this.apartamentoBO = new ApartamentoBO();
		this.casaBO = new CasaBO();
		this.clienteBO = new ClienteBO();
		this.contatoBO = new ContatoBO();
		this.corretorBO = new CorretorBO();
		this.enderecoBO = new EnderecoBO();
		this.estadoBO = new EstadoBO();
		this.imoveisBO = new ImoveisBO();
		this.municipioBO =new  MunicipioBO();
		this.proprietarioBO = new ProprietarioBO();
		this.venderBO = new VenderBO();
	}


	public static Fachada getInstance() {
		if(instance==null) {
			instance= new Fachada();
		}
		return instance;
	}

	@Override
	public void salvarApartamento(Apartamento apartamento) {
		this.apartamentoBO.salvar(apartamento);
		
	}

	@Override
	public Apartamento buscarApartamentoPorId(int id) {
		
		return this.apartamentoBO.buscarPorId(id);
	}

	@Override
	public List<Apartamento> getALLApartamneto() {
		
		return this.apartamentoBO.getALL();
	}

	@Override
	public void editarAparatamento(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarApartamento(int id) {
		// TODO Auto-generated method stub
		
	}

//casa
	@Override
	public void salvarCasa(Casa casa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Casa buscarCasaPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Casa> getALLCasa() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarCasa(Casa casa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarCasa(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Cliente buscarClientePorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getALLCliente() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarCliente(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Contato buscarContatoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Contato> getALLContato() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarContato(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarContato(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarCorretor(Corretor corretor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Corretor buscarCorretorPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Corretor> getALLCorretor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarCorretor(Corretor corretor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarCorretor(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Endereco buscarEnderecoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Endereco> getALLEndereco() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarEndereco(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarEndereco(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarEstado(Estado estado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Estado buscarEstadoPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estado> getALLEstado() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarEstado(Estado estado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarEstado(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarImoveis(Imoveis imoveis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Imoveis buscarImoveisPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Imoveis> getALLImoveis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarImoveis(Imoveis imoveis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarImoveis(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Municipio buscarMunicipioPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Municipio> getALLMunicipio() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarMunicipio(Municipio municipio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarMunicipio(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarProprietario(Proprietario proprietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Proprietario buscarProprietarioPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Proprietario> getALLProprietario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarProprietario(Proprietario proprietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarProprietario(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvarVender(Vender vender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vender buscarVenderPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vender> getALLVender() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editarVender(Vender vender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativarVender(int id) {
		// TODO Auto-generated method stub
		
	}

}
