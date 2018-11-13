package modelBO;

import java.util.List;

import modelVO.Cliente;


public interface IClienteBO {
	public  void salvar(Cliente cliente);
	public Cliente  buscarPorId(int id);
	public List<Cliente> getALL();
	public  void editar(Cliente cliente);
	public  void ativarDesativar(int id);
}
