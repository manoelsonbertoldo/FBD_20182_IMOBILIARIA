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
		public static final String COL_AREACONSTRUIDA = "areaconstuida";
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
		public static final String COL_TIPO = "tipocontato";
		public static final String COL_DESCRICAO = "descricao";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_TIPO + ","
				+ COL_DESCRICAO + ""
				+ " ) values (?,?)";
	}
	public static class Corretor {

		public static final String NOME_TABELA = "corretor";
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
				+ COL_ESTADO + "" + " ) values (?,?,?,?,?)";
	}
	public static class Estado {

		public static final String NOME_TABELA = "estado";
		public static final String COL_NOME = "nome";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ") values (?)";
	}
	public static class Imoveis {


		public static final String NOME_TABELA = "moveis";
		public static final String COL_TIPO = "tipo";
		public static final String COL_RGIMOVEIS = "rgimoveis";
		public static final String COL_LARGURA = "largura";
		public static final String COL_COMPRIMENTO = "comprimento";
		public static final String COL_STATUS = "status";
		public static final String COL_QNTCOMODOS = "qntcomododos";
		public static final String COL_QNTQUARTOS = "qntquartos";
		public static final String COL_QNTSALAS = "qntsalas";
		public static final String COL_SUITES = "suites";
		public static final String COL_GARAGES = "qntgarages";
		public static final String COL_QNTBANHEIROS = "qntbanheiros";
		public static final String COL_AREATOTAL = "areatotal";
		public static final String COL_VALOR = "valor";

		public static final String INSERT = "insert into " + NOME_TABELA + "(" 
				+ COL_RGIMOVEIS + ","
				+ COL_LARGURA + ","
				+ COL_COMPRIMENTO + ","
				+ COL_STATUS + ","
				+ COL_QNTCOMODOS + ","
				+ COL_QNTSALAS+ ","
				+ COL_SUITES + ","
				+ COL_GARAGES + ","
				+ COL_QNTBANHEIROS + ","
				+ COL_AREATOTAL + ","
				+ COL_VALOR + "," 
				+ COL_QNTQUARTOS + ","
				+ COL_TIPO + " "+ " ) values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
	}
	public static class Municipio {

		public static final String NOME_TABELA = "municipios";
		public static final String COL_NOME = "nome";
		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NOME + ") values (?)";
	}
	public static class Proprietario {

		public static final String NOME_TABELA = "proprietario";
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
	public static class Vender {


		public static final String NOME_TABELA = "vender";
		public static final String COL_NUMVENDAS = "numvendas";
		public static final String COL_VALORVENDAS = "valorvenda";
		public static final String COL_VALORTOTAL = "valortotal";
		public static final String COL_DESCONTO = "desconto";
		public static final String COL_TIPO = "tipo";
		public static final String COL_FORMAPAGAMENTO = "formapagamento";
		public static final String COL_DATAVENDA = "datavenda";


		public static final String INSERT = "insert into " + NOME_TABELA + "(" + COL_NUMVENDAS + ","
				+ COL_VALORVENDAS + ","
				+ COL_VALORTOTAL + ","
				+ COL_DESCONTO + ","
				+ COL_TIPO + ","
				+ COL_FORMAPAGAMENTO + ","
				+ COL_DATAVENDA + ""


             + " ) values (?,?,?,?,?,?,?) ";
	}




	public static String selectAll(String nomeTabela) {
		return "select * from " + nomeTabela;
	}

	public static String selectById(String nomeTabela, int id) {
		return "select * from " + nomeTabela + " where id = " + id;
	}



}
