package modelDAO;

import java.util.List;

import modelVO.Endereco;

public interface IEnderecoDAO {
	public  void salvar(Endereco endereco);
	public Endereco  buscarPorId(int id);
	public List<Endereco > getALL();
	public  void editar(Endereco endereco);
	public  void ativarDesativar(int id);
}
