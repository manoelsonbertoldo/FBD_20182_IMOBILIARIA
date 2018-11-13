package modelVO;

public class Imoveis {
	private int id;
	private String tipo;
	private int rgImovel;
	private double largura;
	private double comprimento;
	private String status;
	private int qntComodos;
	private int qntQuartos;
	private int qntSalas;
	private int Suites;
	private int qntGarages;
	private int qntBanheiros;
	private double areaTotal;
	private double valor;
	
	private Endereco endereco;
	
	public Imoveis() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getRgImovel() {
		return rgImovel;
	}

	public void setRgImovel(int rgImovel) {
		this.rgImovel = rgImovel;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getQntComodos() {
		return qntComodos;
	}

	public void setQntComodos(int qntComodos) {
		this.qntComodos = qntComodos;
	}

	public int getQntQuartos() {
		return qntQuartos;
	}

	public void setQntQuartos(int qntQuartos) {
		this.qntQuartos = qntQuartos;
	}

	public int getQntSalas() {
		return qntSalas;
	}

	public void setQntSalas(int qntSalas) {
		this.qntSalas = qntSalas;
	}

	public int getSuites() {
		return Suites;
	}

	public void setSuites(int suites) {
		Suites = suites;
	}

	public int getQntGarages() {
		return qntGarages;
	}

	public void setQntGarages(int qntGarages) {
		this.qntGarages = qntGarages;
	}

	public int getQntBanheiros() {
		return qntBanheiros;
	}

	public void setQntBanheiros(int qntBanheiros) {
		this.qntBanheiros = qntBanheiros;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	
	

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Imoveis [id=" + id + ", tipo=" + tipo + ", rgImovel=" + rgImovel + ", largura=" + largura
				+ ", comprimento=" + comprimento + ", status=" + status + ", qntComodos=" + qntComodos + ", qntQuartos="
				+ qntQuartos + ", qntSalas=" + qntSalas + ", Suites=" + Suites + ", qntGarages=" + qntGarages
				+ ", qntBanheiros=" + qntBanheiros + ", areaTotal=" + areaTotal + ", valor=" + valor + ", endereco="
				+ endereco + "]";
	}
	
	 
	

}
