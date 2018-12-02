package modelBO;

import java.util.List;

import modelDAO.IVenderDAO;
import modelDAO.VenderDAO;
import modelVO.Vender;

public class VenderBO implements IVenderBO {
	
	IVenderDAO venderDAO;

	public VenderBO() {
		this.venderDAO=new VenderDAO();
	}

	@Override
	public void salvar(Vender vender) {
		this.venderDAO.salvar(vender);
		
	}

	@Override
	public Vender buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.venderDAO.buscarPorId(id);
	}

	@Override
	public List<Vender> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Vender vender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
