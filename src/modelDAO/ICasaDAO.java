package modelDAO;

import java.util.List;

import modelVO.Casa;

public interface ICasaDAO {
	public  void salvar(Casa casa);
	public Casa buscarPorId(int id);
	public List<Casa> getALL();
	public  void editar(Casa casa);
	public  void ativarDesativar(int id);
}
