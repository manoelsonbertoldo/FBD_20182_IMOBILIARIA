package modelDAO;

import java.util.List;

import modelVO.Imoveis;

public interface IImoveisDAO {
	public  void salvar(Imoveis imoveis);
	public Imoveis  buscarPorId(int id);
	public List<Imoveis> getALL();
	public  void editar(Imoveis imoveis);
	public  void ativarDesativar(int id);
}
