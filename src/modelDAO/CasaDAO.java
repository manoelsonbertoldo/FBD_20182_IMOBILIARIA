package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Casa;
import sql.SQLConections;
import sql.SQLUtil;

public class CasaDAO implements ICasaDAO{
	private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;
	@Override
	public void salvar(Casa casa) {
		try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Casa.INSERT);
            this.statement.setDouble(1, casa.getAreaConstruida());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CasaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	@Override
	public Casa buscarPorId(int id) {
		
		return null;
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
