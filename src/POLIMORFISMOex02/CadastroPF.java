package POLIMORFISMOex02;

public class CadastroPF extends CadastroPessoa {

	private Double gastosSaude;
	
	public CadastroPF () {
		super();
	}
	public CadastroPF(String nome, Double renda, Double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}
	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
	
	
	@Override
	public double impostoPago() {
		
		if (renda < 20000 ) {
			return renda*0.15;
		}
		else {
			return renda*0.25 - gastosSaude/2;
		}
	}
	

	
	
}
