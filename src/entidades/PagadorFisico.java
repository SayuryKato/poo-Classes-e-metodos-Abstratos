package entidades;

public class PagadorFisico extends PagadorDerImposto{
	private double gastoSaude;
	
	

	public PagadorFisico(String nome, Double redaAnual, double gastoSaude) {
		super(nome, redaAnual);
		this.gastoSaude = gastoSaude;
	}
	
	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double imposto() {
		if(getRedaAnual()<20000) {
			return  (getRedaAnual() * 0.15) - (getGastoSaude()*0.50);
		}
		else {
			return (getRedaAnual() * 0.25) - (getGastoSaude()*0.50);			
		}
			
	}
	
	

}
