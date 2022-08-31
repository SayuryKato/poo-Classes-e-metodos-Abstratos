package entidades;

public class PessoaJuridica extends PagadorDerImposto{
	
	private Integer numero_funcionarios;
	

	public PessoaJuridica(String nome, Double redaAnual,Integer numero_funcionarios) {
		super(nome, redaAnual);
		this.numero_funcionarios = numero_funcionarios;
	}

	public Integer getNumero_funcionarios() {
		return numero_funcionarios;
	}

	public void setNumero_funcionarios(Integer numero_funcionarios) {
		this.numero_funcionarios = numero_funcionarios;
	}


	@Override
	public Double imposto() {
		if(getNumero_funcionarios()>10) {
			return getRedaAnual()*0.14;
		}
		else {
			return getRedaAnual()*0.16;
		}
	}

}
