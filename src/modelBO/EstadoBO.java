package modelBO;

import java.util.List;

import modelDAO.EstadoDAO;
import modelDAO.IEstadoDAO;
import modelVO.Estado;

public class EstadoBO implements IEstadoBO{
IEstadoDAO estadoDAO;
	public EstadoBO() {
		super();
		this.estadoDAO=new EstadoDAO();
	}

	@Override
	public void salvar(Estado estado) {
		this.estadoDAO.salvar(estado);		
	}

	@Override
	public Estado buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.estadoDAO.buscarPorId(id);
	}

	@Override
	public List<Estado> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Estado estado) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
