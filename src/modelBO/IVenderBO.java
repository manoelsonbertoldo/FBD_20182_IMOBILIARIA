package modelBO;

import java.util.List;

import modelVO.Vender;

public interface IVenderBO {
	public  void salvar(Vender vender);
	public Vender buscarPorId(int id);
	public List<Vender> getALL();
	public  void editar(Vender vender);
	public  void ativarDesativar(int id);

}
