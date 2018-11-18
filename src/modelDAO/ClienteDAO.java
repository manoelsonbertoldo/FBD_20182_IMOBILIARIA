package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import sql.SQLConections;
import sql.SQLUtil;

public class ClienteDAO implements IClientaDAO{
	private Connection conexao;
    private PreparedStatement statement;
    private ResultSet result;

	@Override
	public void salvar(Cliente cliente) {
		try {
            //int id_endereco = CommumDao.salvarEndereco(cliente.getEndereco());
            this.conexao = SQLConections.getInstance();
            this.statement = conexao.prepareStatement(SQLUtil.Cliente.INSERT);
            this.statement.setString(1, cliente.getCpf());
            this.statement.setString(2, cliente.getNome());
            this.statement.setString(3, cliente.getTipo().getValor());
            this.statement.setString(4, cliente.getDocumento());
           // this.statement.setInt(5, id_endereco);
            this.result = this.statement.executeQuery();
//            int id_cliente = 0;
//            if (result.next()) {
//                id_cliente = result.getInt(1);
//            }
            this.statement.close();
            
//            for (Contato c : cliente.getContatos()) {
//                CommumDao.salvarContato(c, id_cliente);
//            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	@Override
	public Cliente buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cliente> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
