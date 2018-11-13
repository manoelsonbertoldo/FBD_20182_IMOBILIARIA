package modelVO;

public class Estado {
	private int id;
	private String nome;
	
	

	public Estado() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nome=" + nome + "]";
	}
	
	
	
	
		
	
	
	

}
