package modelVO;

import java.util.List;

public interface ICasaDAO {
	public  void salvar(Casa casa);
	public Casa buscarPorId(int id);
	public List<Casa> getALL();
	public  void editar(Casa casa);
	public  void ativarDesativar(int id);
}
