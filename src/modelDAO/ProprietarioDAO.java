package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Proprietario;
import sql.SQLConections;
import sql.SQLUtil;

public class ProprietarioDAO implements IProprietarioDAO{
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Proprietario proprietario) {
		try {
			this.conexao = SQLConections.getInstance();
	        this.statement = conexao.prepareStatement(SQLUtil.Proprietario.INSERT);
	        this.statement.setString(1,proprietario.getCpf());
	        this.statement.setString(2, proprietario.getNome());
	        this.statement.setString(3, proprietario.getTipo().getValor());
	        this.statement.setString(4,proprietario.getDocumento());
	        this.result = this.statement.executeQuery();
	        this.statement.close();
			} catch (SQLException ex) {
	            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

	@Override
	public Proprietario buscarPorId(int id) {
		Proprietario proprietario = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Proprietario.COL_NOME, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	proprietario  = new Proprietario ();
            	proprietario .setId(result.getInt(1));
            	proprietario .setNome(result.getString(SQLUtil.Proprietario.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(ProprietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proprietario ;
    
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
