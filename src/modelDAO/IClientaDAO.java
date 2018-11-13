package modelDAO;

import java.util.List;

import modelVO.Cliente;

public interface IClientaDAO {
	public  void salvar(Cliente cliente);
	public Cliente  buscarPorId(int id);
	public List<Cliente> getALL();
	public  void editar(Cliente cliente);
	public  void ativarDesativar(int id);
}
