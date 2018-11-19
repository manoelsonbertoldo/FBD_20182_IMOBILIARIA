package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Vender;
import sql.SQLConections;
import sql.SQLUtil;

public class VenderDAO implements IVenderDAO{
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Vender vender) {
		
		try {
			this.conexao = SQLConections.getInstance();
	        this.statement = conexao.prepareStatement(SQLUtil.Vender.INSERT);
	        this.statement.setInt(1,vender.getNumVendas());
	        this.statement.setDouble(2, vender.getValorVenda());
	        this.statement.setDouble(3, vender.getDesconto());
	        this.statement.setString(4, vender.getTipo());
	        this.statement.setString(5,vender.getFormaPagamento());
	        this.statement.setString(6,vender.getDataVenda());
	        
	        this.result = this.statement.executeQuery();
	        this.statement.close();
			} catch (SQLException ex) {
	            Logger.getLogger(VenderDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

	@Override
	public Vender buscarPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vender> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Vender vender) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
