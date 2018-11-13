package modelBO;

import java.util.List;

import modelVO.Estado;


public interface IEstadoBO {
	public  void salvar(Estado estado);
	public Estado  buscarPorId(int id);
	public List<Estado> getALL();
	public  void editar(Estado estado);
	public  void ativarDesativar(int id);
}
