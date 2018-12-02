package modelBO;

import java.util.List;

import modelDAO.ClienteDAO;
import modelDAO.IClientaDAO;
import modelVO.Cliente;

public class ClienteBO implements IClienteBO{
IClientaDAO clienteDAO;
	public ClienteBO() {
		super();
		this.clienteDAO=new ClienteDAO();
	}

	@Override
	public void salvar(Cliente cliente) {
         this.clienteDAO.salvar(cliente);

		
	}

	@Override
	public Cliente buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.clienteDAO.buscarPorId(id);
	}

	@Override
	public List<Cliente> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
