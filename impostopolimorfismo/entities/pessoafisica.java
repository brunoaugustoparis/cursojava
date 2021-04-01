package entities;

public class pessoafisica extends cadastropessoa {

	private Double gastosSaude;

	public pessoafisica(String nome, double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {	
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	@Override
	public Double imposto() {
		if (getRendaAnual() < 20000) {
			return 0.15 * getRendaAnual() - gastosSaude*0.5;
		} else {
			return 0.25 * getRendaAnual() - gastosSaude*0.5;
		}
		
	}
	
	
}
