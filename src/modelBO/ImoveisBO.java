package modelBO;

import java.util.List;

import modelDAO.IImoveisDAO;
import modelDAO.ImoveisDAO;
import modelVO.Imoveis;

public class ImoveisBO implements IImoveisBO {
	IImoveisDAO imoveisDAO;
	

	public ImoveisBO() {
		super();
		this.imoveisDAO=new ImoveisDAO();
	}

	@Override
	public void salvar(Imoveis imoveis) {
		this.imoveisDAO.salvar(imoveis);		
	}

	@Override
	public Imoveis buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.imoveisDAO.buscarPorId(id);
	}

	@Override
	public List<Imoveis> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Imoveis imoveis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}
}
