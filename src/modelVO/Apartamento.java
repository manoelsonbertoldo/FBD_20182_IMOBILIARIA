package modelVO;

public class Apartamento extends Imoveis {
	private int id;
	private String predio;

	public Apartamento() {
		super();
		
	}
	

	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getPredio() {
		return predio;
	}


	public void setPredio(String predio) {
		this.predio = predio;
	}
	





	@Override
	public String toString() {
		return "Apartamento [id=" + id + ", predio=" + predio + "]";
	}
	

	
	

}
