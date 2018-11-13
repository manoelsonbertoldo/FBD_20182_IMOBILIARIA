package modelVO;

public class Vender {
	private int id;
	private int numVendas;
	private double valorVenda;
	private double valorTotal;
	private double desconto;
	private String tipo;
	private String FormaPagamento;
	private String dataVenda;
	
	
	
	
	public Vender() {
		super();
		
	}
	




	@Override
	public String toString() {
		return "Vender [id=" + id + ", numVendas=" + numVendas + ", valorVenda=" + valorVenda + ", valorTotal="
				+ valorTotal + ", desconto=" + desconto + ", tipo=" + tipo + ", FormaPagamento=" + FormaPagamento
				+ ", dataVenda=" + dataVenda + "]";
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public int getNumVendas() {
		return numVendas;
	}





	public void setNumVendas(int numVendas) {
		this.numVendas = numVendas;
	}





	public double getValorVenda() {
		return valorVenda;
	}





	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}





	public double getValorTotal() {
		return valorTotal;
	}





	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}





	public double getDesconto() {
		return desconto;
	}





	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}





	public String getTipo() {
		return tipo;
	}





	public void setTipo(String tipo) {
		this.tipo = tipo;
	}





	public String getFormaPagamento() {
		return FormaPagamento;
	}





	public void setFormaPagamento(String formaPagamento) {
		FormaPagamento = formaPagamento;
	}





	public String getDataVenda() {
		return dataVenda;
	}





	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
	
	
	
	
	

}
