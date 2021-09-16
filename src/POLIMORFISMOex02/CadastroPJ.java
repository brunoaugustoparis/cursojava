package POLIMORFISMOex02;

public class CadastroPJ extends CadastroPessoa {
	
	private Integer numFuncionarios;

	public CadastroPJ() {
		super();
	}
	
	public CadastroPJ(String nome, Double renda, Integer numFuncionarios) {
	super(nome, renda);
	this.numFuncionarios = numFuncionarios;
	}

	public Integer getNumFuncionarios() {
		return numFuncionarios;
	}

	public void setNumFuncionarios(Integer numFuncionarios) {
		this.numFuncionarios = numFuncionarios;
	}

	@Override
	public double impostoPago() {
		if (numFuncionarios <= 10) {
			return renda*0.16;
		} 
		else {
			return renda*0.14;
		}
	}
	
	

}
