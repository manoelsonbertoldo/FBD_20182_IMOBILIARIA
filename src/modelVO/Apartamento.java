package modelVO;

public class Apartamento extends Imoveis {
	private int id;

	public Apartamento() {
		super();
		
	}
	

	@Override
	public String toString() {
		return "Apartamento [id=" + id + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	

	
	

}
