package entidades;

public abstract class PagadorDerImposto {
	private String nome;
	private Double redaAnual;
	
	public PagadorDerImposto() {
		
	}
	
	public PagadorDerImposto(String nome, Double redaAnual) {
		this.nome = nome;
		this.redaAnual = redaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRedaAnual() {
		return redaAnual;
	}

	public void setRedaAnual(Double redaAnual) {
		this.redaAnual = redaAnual;
	}
	
	public abstract Double imposto();

}
