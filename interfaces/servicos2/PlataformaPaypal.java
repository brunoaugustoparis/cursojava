package servicos2;

public class PlataformaPaypal implements Plataforma{
	
	public double pagamento(double valor, int i) {
		double valorParc = (valor+valor*0.01*i);
		return valorParc + valorParc * 0.02;
	}

}
