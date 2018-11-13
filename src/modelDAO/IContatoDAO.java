package modelDAO;

import java.util.List;

import modelVO.Contato;

public interface IContatoDAO {
	public  void salvar(Contato contato);
	public Contato  buscarPorId(int id);
	public List<Contato> getALL();
	public  void editar(Contato contato);
	public  void ativarDesativar(int id);
}
