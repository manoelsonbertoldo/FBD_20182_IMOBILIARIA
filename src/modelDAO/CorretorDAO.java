package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Corretor;
import sql.SQLConections;
import sql.SQLUtil;

public class CorretorDAO implements ICorretorDAO{
	 private Connection conexao;
	    private PreparedStatement statement;
	    private ResultSet result;
	@Override
	public void salvar(Corretor corretor) {
		try {
		this.conexao = SQLConections.getInstance();
        this.statement = conexao.prepareStatement(SQLUtil.Corretor.INSERT);
        this.statement.setString(1,corretor.getCpf());
        this.statement.setString(2, corretor.getNome());
        this.statement.setString(3, corretor.getTipo().getValor());
        this.statement.setString(4,corretor.getDocumento());
        this.result = this.statement.executeQuery();
        this.statement.close();
		} catch (SQLException ex) {
            Logger.getLogger(CorretorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public Corretor buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
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
