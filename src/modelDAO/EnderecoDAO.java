package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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
            statement = conexao.prepareStatement(SQLUtil.Endereco.INSERT);
            statement.setString(1, endereco.getCep());
            statement.setString(2, endereco.getRua());
            statement.setString(3, endereco.getNumero());
            statement.setString(4, endereco.getBairro());
            statement.setString(5, endereco.getEstado());

            result = statement.executeQuery();

            

        } catch (SQLException ex) {
            Logger.getLogger(EnderecoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
	}

	@Override
	public Endereco buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
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
