package modelBO;

import java.util.List;


import modelVO.Municipio;



public interface IMunicipioBO {
	public  void salvar(Municipio municipio);
	public Municipio buscarPorId(int id);
	public List<Municipio> getALL();
	public  void editar(Municipio municipio);
	public  void ativarDesativar(int id);
}
