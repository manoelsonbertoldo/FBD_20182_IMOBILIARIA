package modelBO;

import java.util.List;

import modelDAO.ApartamentoDAO;
import modelDAO.IApartamentoDAO;
import modelVO.Apartamento;

public class ApartamentoBO implements IApartamentoBO{
IApartamentoDAO apartamenentoDAO;
	public ApartamentoBO() {
		super();
		this.apartamenentoDAO=new ApartamentoDAO();
	}

	@Override
	public void salvar(Apartamento apartamento) {
		this.apartamenentoDAO.salvar(apartamento);
		
	}

	@Override
	public Apartamento buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Apartamento> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
