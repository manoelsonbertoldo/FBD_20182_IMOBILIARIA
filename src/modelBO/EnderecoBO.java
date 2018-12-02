package modelBO;

import java.util.List;

import modelDAO.EnderecoDAO;
import modelDAO.IEnderecoDAO;
import modelVO.Endereco;

public class EnderecoBO implements IEnderecoBO{
IEnderecoDAO enderecoDAO;
	public EnderecoBO() {
		super();
		this.enderecoDAO=new EnderecoDAO();
	}

	@Override
	public void salvar(Endereco endereco) {
		this.enderecoDAO.salvar(endereco);
		
	}

	@Override
	public Endereco buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.enderecoDAO.buscarPorId(id);
	}

	@Override
	public List<Endereco> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}
	

}
