package modelDAO;

import java.util.List;

import modelVO.Vender;

public interface IVenderDAO {
	public  void salvar(Vender vender);
	public Vender buscarPorId(int id);
	public List<Vender> getALL();
	public  void editar(Vender vender);
	public  void ativarDesativar(int id);
}
