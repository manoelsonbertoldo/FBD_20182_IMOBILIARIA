package modelDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import modelVO.Cliente;
import modelVO.Municipio;
import sql.SQLConections;
import sql.SQLUtil;

public class MunicipioDAO implements IMunicipioDAO{
	private Connection conexao;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void salvar(Municipio municipio) {
		try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.Municipio.INSERT);
            this.statement.setString(1, municipio.getNome());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	@Override
	public Municipio buscarPorId(int id) {
		Municipio municipio = null;
        try {
            this.conexao = SQLConections.getInstance();
            this.statement = this.conexao.prepareStatement(SQLUtil.selectById(SQLUtil.Municipio.COL_NOME, id));
            this.result = this.statement.executeQuery();

            if (result.next()) {
            	municipio = new Municipio();
            	municipio.setId(result.getInt(1));
            	municipio.setNome(result.getString(SQLUtil.Municipio.COL_NOME));
            }
            this.conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(MunicipioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return municipio;
    
	}

	@Override
	public List<Municipio> getALL() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void editar(Municipio municipio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ativarDesativar(int id) {
		// TODO Auto-generated method stub
		
	}

}
