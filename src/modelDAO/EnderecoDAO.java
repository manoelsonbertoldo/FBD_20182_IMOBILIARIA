package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Endereco;
import sql.SQLConections;
import sql.SQLUtil;

public class EnderecoDAO implements IEnderecoDAO {

	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Endereco endereco) {
		try {
            conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Endereco.INSERT);
            this.statement.setString(1, endereco.getCep());
            this.statement.setString(2, endereco.getRua());
            this.statement.setString(3, endereco.getNumero());
            this.statement.setString(4, endereco.getBairro());
            this.statement.setString(5, endereco.getEstado());

            this.statement.executeQuery();
            this.statement.close();
            

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public Endereco buscarPorId(int id) {
		Endereco endereco = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Endereco.COL_RUA, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	endereco  = new Endereco ();
            	endereco .setId(result.getInt(1));
            	endereco .setRua(result.getString(SQLUtil.Endereco.COL_RUA));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return endereco ;
    
	}

	@Override
	public List<Endereco> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Endereco endereco) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
