package modelVO;

import enuns.TipoContato;

public class Contato {
	private int id;
	private TipoContato tipo;
	private String descricao;
	public Contato() {
		super();
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoContato getTipo() {
		return tipo;
	}
	public void setTipo(TipoContato tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		return "Contato [id=" + id + ", tipo=" + tipo + ", descricao=" + descricao + "]";
	}
	
	
	

}
