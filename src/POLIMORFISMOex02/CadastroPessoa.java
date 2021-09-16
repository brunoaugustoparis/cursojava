package POLIMORFISMOex02;

public abstract class CadastroPessoa {
	
	private String nome;
	protected Double renda;
	
	public CadastroPessoa() {
		
	}
	
	public CadastroPessoa(String nome, Double renda) {
		super();
		this.nome = nome;
		this.renda = renda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}
	
	public abstract double impostoPago();
	
	

}
