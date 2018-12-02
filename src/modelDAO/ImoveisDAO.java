package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Imoveis;
import sql.SQLConections;
import sql.SQLUtil;

public class ImoveisDAO implements IImoveisDAO{
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Imoveis imoveis) {
		
		try {
			this.conexao = SQLConections.getInstance();
	        this.statement = conexao.prepareStatement(SQLUtil.Imoveis.INSERT);
	        this.statement.setString(1,imoveis.getTipo());
	        this.statement.setInt(2,imoveis.getRgImovel());
	        this.statement.setDouble(3, imoveis.getLargura());
	        this.statement.setDouble(4, imoveis.getComprimento());
	        this.statement.setString(5, imoveis.getStatus());
	        this.statement.setInt(6,imoveis.getQntComodos());
	        this.statement.setInt(7,imoveis.getQntQuartos());
	        this.statement.setInt(8, imoveis.getQntSalas());
	        this.statement.setInt(9, imoveis.getSuites());
	        this.statement.setInt(10, imoveis.getQntGarages());
	        this.statement.setInt(11,imoveis.getQntBanheiros());
	        this.statement.setDouble(12,imoveis.getAreaTotal());
	        this.statement.setDouble(13,imoveis.getValor());
	        
	        this.result = this.statement.executeQuery();
	        this.statement.close();
			} catch (SQLException ex) {
	            Logger.getLogger(ImoveisDAO.class.getName()).log(Level.SEVERE, null, ex);
	        }
		
	}

	@Override
	public Imoveis buscarPorId(int id) {
		Imoveis imoveis = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Imoveis.COL_TIPO, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	imoveis = new Imoveis();
            	imoveis.setId(result.getInt(1));
            	imoveis.setTipo(result.getString(SQLUtil.Imoveis.COL_TIPO));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(ImoveisDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imoveis;
    
	}

	@Override
	public List<Imoveis> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Imoveis imoveis) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
