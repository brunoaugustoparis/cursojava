package servicos2;

import java.util.Calendar;
import java.util.Date;

import entidades2.Contrato;
import entidades2.Prestacoes;

public class Pagamento {
	
	private Plataforma plataforma;
	
	public Pagamento(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
	
	public void processandoContrato(Contrato contrato, int p) {
		 double cotaBasica = contrato.getValorContrato()/p;
		 
		 for (int i = 1; i <= p; i++) {
			 Date data = addMes(contrato.getData(), i);	 
			 Prestacoes prestacao = new Prestacoes(data,plataforma.pagamento(cotaBasica, i));
			 contrato.addPrestacao(prestacao);
		 }	
	}
		 
		 
		 private Date addMes(Date data, int n) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(data);
				cal.add(Calendar.MONTH, n);
				return cal.getTime();
		 }
		 
		 
}
	
	
