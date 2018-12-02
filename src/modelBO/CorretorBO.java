package modelBO;

import java.util.List;

import modelDAO.CorretorDAO;
import modelDAO.ICorretorDAO;
import modelVO.Corretor;

public class CorretorBO implements ICorretorBO{
ICorretorDAO corretorDAO;
	public CorretorBO() {
		super();
		this.corretorDAO=new CorretorDAO();
	}

	@Override
	public void salvar(Corretor corretor) {
		this.corretorDAO.salvar(corretor);
		
	}

	@Override
	public Corretor buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.corretorDAO.buscarPorId(id);
	}

	@Override
	public List<Corretor> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Corretor corretor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
