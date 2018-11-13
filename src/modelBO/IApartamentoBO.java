package modelBO;

import java.util.List;

import modelVO.Apartamento;


public interface IApartamentoBO {
	public  void salvar(Apartamento apartamento);
	public Apartamento buscarPorId(int id);
	public List<Apartamento> getALL();
	public  void editar(Apartamento apartamento);
	public  void ativarDesativar(int id);
}
