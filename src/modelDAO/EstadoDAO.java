package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Estado;
import sql.SQLConections;
import sql.SQLUtil;

public class EstadoDAO implements IEstadoDAO{
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Estado estado) {
		try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Estado.INSERT);
            this.statement.setString(1, estado.getNome());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	@Override
	public Estado buscarPorId(int id) {
		Estado estado  = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Estado.COL_NOME, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	estado = new Estado();
            	estado.setId(result.getInt(1));
            	estado.setNome(result.getString(SQLUtil.Estado.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estado;
    
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
