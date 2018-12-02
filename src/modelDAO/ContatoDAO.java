package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Contato;
import sql.SQLConections;
import sql.SQLUtil;

public class ContatoDAO implements IContatoDAO{
	 private Connection conexao;
	    private PreparedStatement statement;
	    private ResultSet result;
	@Override
	public void salvar(Contato contato) {
		try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Contato.INSERT);
            statement.setString(1, contato.getTipo().getValor());
            statement.setString(2, contato.getDescricao());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

    
		
	}

	@Override
	public Contato buscarPorId(int id) {
		Contato contato = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Contato.COL_DESCRICAO, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	contato = new Contato();
            	contato.setId(result.getInt(1));
            	contato.setDescricao(result.getString(SQLUtil.Contato.COL_DESCRICAO));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contato;
    
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
