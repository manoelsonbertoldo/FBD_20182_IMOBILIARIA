package enuns;

public enum TipoContato {
	EMAIL("EMAIL"),
	TELEFONE("TELEFONE"),
	FACEBOOK("FACEBOOK");
	private String descricao;
	private TipoContato(String descricao) {
		this.descricao=descricao;
		
	}
	public String getValor() {
		return this.descricao;
	}
	
	

}
