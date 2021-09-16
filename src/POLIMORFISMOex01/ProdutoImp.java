package POLIMORFISMOex01;

public class ProdutoImp extends Produto {

	private Double taxaAlfandega;

	public ProdutoImp() {
		super();
	}
	
	public ProdutoImp(String nome, Double preco, Double taxaAlfandega) {
		super(nome, preco);
		this.taxaAlfandega = taxaAlfandega;
	}

	public Double getTaxaAlfandega() {
		return taxaAlfandega;
	}

	public void setTaxaAlfandega(Double taxaAlfandega) {
		this.taxaAlfandega = taxaAlfandega;
	}
	
	public double valor() {
		return preco + taxaAlfandega;
	}
	
	@Override
	public String etiquetasPreco() {
		return nome +
				" R$ " + 
				String.format("%.2f", preco) +
				" (Taxa alfandegária: R$" +
				String.format("%.2f", taxaAlfandega) +
				")";
				
	}
	
	
	
}
