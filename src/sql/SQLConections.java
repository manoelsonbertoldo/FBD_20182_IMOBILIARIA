package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConections {
	 public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/aula2018_2";
	    public static String USUARIO_POSTGRES = "postgres";
	    public static String SENHA_POSTGRES = "postgres";

	    private static Connection conexao = null;

	    private SQLConections() {

	    }

	    public static Connection getInstance() {
	        try {
	            if (conexao == null || conexao.isClosed()) {
	                conexao = DriverManager.getConnection(URL_POSTGRES, USUARIO_POSTGRES, SENHA_POSTGRES);
	            }
	        } catch (SQLException ex) {
	            Logger.getLogger(SQLUtil.class.getName()).log(Level.SEVERE, null, ex);
	            ex.printStackTrace();
	        }
	        return conexao;
	    }
	


}
