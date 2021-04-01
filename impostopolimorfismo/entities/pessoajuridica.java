package entities;

public class pessoajuridica extends cadastropessoa {
	
	private Integer numeroFuncionarios;

	public pessoajuridica(String nome, double rendaAnual, Integer numeroFuncionarios) {
		super(nome, rendaAnual);
		this.numeroFuncionarios = numeroFuncionarios;
	}

	public Integer getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(Integer numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	
	@Override
	public Double imposto() {
		if (numeroFuncionarios > 10) {
			return 0.14 * getRendaAnual();
		} else {
			return 0.16 * getRendaAnual();
		}
		
	}
	
	

}
