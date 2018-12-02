package modelBO;

import java.util.List;

import modelDAO.ContatoDAO;
import modelDAO.IContatoDAO;
import modelVO.Contato;

public class ContatoBO implements IContatoBO{
IContatoDAO contatoDAO;
	public ContatoBO() {
		super();
		this.contatoDAO= new ContatoDAO();
	}

	@Override
	public void salvar(Contato contato) {
		this.contatoDAO.salvar(contato);
		
	}

	@Override
	public Contato buscarPorId(int id) {
		
		return this.contatoDAO.buscarPorId(id);
	}

	@Override
	public List<Contato> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Contato contato) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
