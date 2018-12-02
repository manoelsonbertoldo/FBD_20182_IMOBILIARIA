package modelBO;

import java.util.List;

import modelDAO.CasaDAO;
import modelVO.Casa;
import modelVO.ICasaDAO;

public class CasaBO implements ICasaBO{
ICasaDAO casaDAO;
	public CasaBO() {
		super();
		this.casaDAO=new CasaDAO();
		
	}

	@Override
	public void salvar(Casa casa) {
		this.casaDAO.salvar(casa);
		
	}

	@Override
	public Casa buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.casaDAO.buscarPorId(id);
	}

	@Override
	public List<Casa> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Casa casa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
