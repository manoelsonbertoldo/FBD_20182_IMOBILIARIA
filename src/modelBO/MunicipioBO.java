package modelBO;

import java.util.List;

import modelDAO.IMunicipioDAO;
import modelDAO.MunicipioDAO;
import modelVO.Municipio;

public class MunicipioBO implements IMunicipioBO {
IMunicipioDAO municipioDAO;
	public MunicipioBO() {
		super();
		this.municipioDAO=new MunicipioDAO();
	}

	@Override
	public void salvar(Municipio municipio) {
		this.municipioDAO.salvar(municipio);
		
	}

	@Override
	public Municipio buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.municipioDAO.buscarPorId(id);
	}

	@Override
	public List<Municipio> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Municipio municipio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
