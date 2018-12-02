package modelBO;

import java.util.List;

import modelDAO.IProprietarioDAO;
import modelDAO.ProprietarioDAO;
import modelVO.Proprietario;

public class ProprietarioBO implements IProprietarioBO {
IProprietarioDAO proprietarioDAO;
	public ProprietarioBO() {
		super();
this.proprietarioDAO=new ProprietarioDAO();

	}

	@Override
	public void salvar(Proprietario proprietario) {
		this.proprietarioDAO.salvar(proprietario);// TODO Auto-generated method stub
		
	}

	@Override
	public Proprietario buscarPorId(int id) {
		// TODO Auto-generated method stub
		return this.proprietarioDAO.buscarPorId(id);
	}

	@Override
	public List<Proprietario> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Proprietario proprietario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
