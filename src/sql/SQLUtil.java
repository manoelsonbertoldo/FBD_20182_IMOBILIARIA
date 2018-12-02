package sql;

public class SQLUtil {
	public static class Apartamento {

        public static final String NOME_TABELA = "apartamento";
        //public static final String COL_ID = "id";
        public static final String COL_PREDIO = "predio";
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_PREDIO + 
				" ) values (?)";
    }
	public static class Casa {
		
        public static final String NOME_TABELA = "casa";
        public static final String COL_AREACONSTRUIDA = "areconstruida";
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_AREACONSTRUIDA + ") values (?)";
    }
	public static class Cliente {
		
		public static final String NOME_TABELA = "cliente";
		public static final String COL_CPF = "cpf";
		public static final String COL_NOME = "nome";
		public static final String COL_TIPO = "tipodocumento";
		public static final String COL_DOCUMENTO = "documento";
		
		
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_TIPO + ","
				+ COL_DOCUMENTO +"" 
				+ " ) values (?,?,?,?) ";
	}
	
	public static class Contato {
		
		public static final String NOME_TABELA = "contato";
		public static final String COL_TIPO = "tipo";
		public static final String COL_DESCRICAO = "descricao";
		
		
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_TIPO + ","
				+ COL_DESCRICAO + ""
				 + " ) values (?,?,?)";
	}
public static class Corretor {
		
		public static final String NOME_TABELA = "corretor";
		public static final String COL_CPF = "nome";
		public static final String COL_NOME = "cpf";
		public static final String COL_TIPO = "tipo";
		public static final String COL_DOCUMENTO = "documento";
		
		
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_TIPO + ","
				+ COL_DOCUMENTO +"" 
				+ " ) values (?,?,?,?) ";
	}
	

    public static class Endereco {

        public static final String NOME_TABELA = "endereco";
        public static final String COL_CEP = "cep";
        public static final String COL_RUA = "rua";
        public static final String COL_NUMERO = "numero";
        public static final String COL_BAIRRO = "bairro";
        public static final String COL_ESTADO = "estado";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CEP + ","
                + COL_RUA + ","
                + COL_NUMERO + ","
                + COL_BAIRRO + ","
                + COL_ESTADO + "" + " ) values (?,?,?,?,?) returning id";
    }
    public static class Estado {

        public static final String NOME_TABELA = "estado";
        public static final String COL_NOME = "NOME";
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ") values (?)";
    }
    public static class Imoveis {
    	
       	
        public static final String NOME_TABELA = "imoveis";
        public static final String COL_TIPO = "tipo";
        public static final String COL_RGIMOVEIS = "rgImoveis";
        public static final String COL_LARGURA = "largura";
        public static final String COL_COMPRIMENTO = "comprimento";
        public static final String COL_STATUS = "status";
        public static final String COL_QNTCOMODOS = "qntcomodos";
        public static final String COL_QNTQUARTOS = "qntQuartos";
        public static final String COL_QNTSALAS = "qntSalas";
        public static final String COL_SUITES = "suites";
        public static final String COL_GARAGES = "garages";
        public static final String COL_QNTBANHEIROS = "qntBanheiros";
        public static final String COL_AREATOTAL = "areaTotal";
        public static final String COL_VALOR = "valor";

        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_TIPO + ","
                + COL_RGIMOVEIS + ","
                + COL_LARGURA + ","
                + COL_COMPRIMENTO + ","
                + COL_STATUS + ","
                + COL_QNTCOMODOS + ","
                + COL_QNTQUARTOS + ","
                + COL_QNTSALAS+ ","
                + COL_SUITES + ","
                + COL_GARAGES + ","
               
                + COL_QNTBANHEIROS + ","
                + COL_AREATOTAL + ","
                
                + COL_VALOR + "" + " ) values (?,?,?,?,?,?,?,?,?,?,?,?,?) returning id";
    }
    public static class Municipio {

        public static final String NOME_TABELA = "municipio";
        public static final String COL_NOME = "NOME";
        public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ") values (?)";
    }
public static class Proprietario {
		
		public static final String NOME_TABELA = "proprietario";
		public static final String COL_CPF = "nome";
		public static final String COL_NOME = "cpf";
		public static final String COL_TIPO = "tipo";
		public static final String COL_DOCUMENTO = "documento";
		
		
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_CPF + ","
				+ COL_NOME + ","
				+ COL_TIPO + ","
				+ COL_DOCUMENTO +"" 
				+ " ) values (?,?,?,?) ";
	}
public static class Vender {
	
   	
    public static final String NOME_TABELA = "vender";
    public static final String COL_NUMVENDAS = "numVendas";
    public static final String COL_VALORVENDAS = "valorVendas";
    public static final String COL_VALORTOTAL = "valorTotal";
    public static final String COL_DESCONTO = "desconto";
    public static final String COL_TIPO = "tipo";
    public static final String COL_FORMAPAGAMENTO = "formaPagamento";
    public static final String COL_DATAVENDA = "dataVenda";
    

    public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NUMVENDAS + ","
            + COL_VALORVENDAS + ","
            + COL_VALORTOTAL + ","
            + COL_DESCONTO + ","
            + COL_TIPO + ","
            + COL_FORMAPAGAMENTO + ","
            + COL_DATAVENDA + ""
            
            
             + " ) values (?,?,?,?,?,?,?,) returning id";
}
	
    


    public static String selectAll(String nomeTabela) {
        return "select * from " + nomeTabela;
    }

    public static String selectById(String nomeTabela, int id) {
        return "select * from " + nomeTabela + " where id = " + id;
    }



}
