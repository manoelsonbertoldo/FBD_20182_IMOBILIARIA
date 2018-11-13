package modelBO;

import java.util.List;

import modelVO.Corretor;


public interface ICorretorBO {
	public  void salvar(Corretor corretor);
	public Corretor  buscarPorId(int id);
	public List<Corretor > getALL();
	public  void editar(Corretor corretor);
	public  void ativarDesativar(int id);
}
