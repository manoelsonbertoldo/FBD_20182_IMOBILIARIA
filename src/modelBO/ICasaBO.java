package modelBO;

import java.util.List;

import modelVO.Casa;


public interface ICasaBO {
	public  void salvar(Casa casa);
	public Casa buscarPorId(int id);
	public List<Casa> getALL();
	public  void editar(Casa casa);
	public  void ativarDesativar(int id);
}
