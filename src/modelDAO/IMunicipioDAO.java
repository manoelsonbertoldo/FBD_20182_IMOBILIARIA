package modelDAO;

import java.util.List;

import modelVO.Municipio;

public interface IMunicipioDAO {
	public  void salvar(Municipio municipio);
	public Municipio buscarPorId(int id);
	public List<Municipio> getALL();
	public  void editar(Municipio municipio);
	public  void ativarDesativar(int id);
}
