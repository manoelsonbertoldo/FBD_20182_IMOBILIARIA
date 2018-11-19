package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Apartamento;
import sql.SQLConections;
import sql.SQLUtil;

public class ApartamentoDAO implements IApartamentoDAO{
private Connection conexao;
private PreparedStatement statement;
private ResultSet result;



	@Override
	public void salvar(Apartamento apartamento) {
	try {	
        this.conexao = SQLConections.getInstance();
        this.statement = conexao.prepareStatement(SQLUtil.Apartamento.INSERT);
        this.statement.setString(1, apartamento.getPredio());
        
        this.result = this.statement.executeQuery();
//        int id_cliente = 0;
//        if (result.next()) {
//            id_cliente = result.getInt(1);
//        }
        this.statement.close();
        
//        for (Contato c : cliente.getContatos()) {
//            CommumDao.salvarContato(c, id_cliente);
//        }

    } catch (SQLException ex) {
        Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    }
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
