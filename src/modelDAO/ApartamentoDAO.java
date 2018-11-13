package modelDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

import modelVO.Apartamento;

public class ApartamentoDAO implements IApartamentoDAO{
private Connection conexao;
//private PreparedStatemente statement;
private ResultSet result;

	@Override
	public void salvar(Apartamento apartamento) {
		// TODO Auto-generated method stub
		
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
