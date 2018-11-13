package modelDAO;

import java.util.List;

import modelVO.Proprietario;

public interface IProprietarioDAO {
	public  void salvar(Proprietario proprietario);
	public Proprietario buscarPorId(int id);
	public List<Proprietario> getALL();
	public  void editar(Proprietario proprietario);
	public  void ativarDesativar(int id);
}
