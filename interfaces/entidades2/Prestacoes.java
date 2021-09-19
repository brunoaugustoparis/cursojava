package entidades2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacoes {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date dataVenc;
	private Double valorAtu;
	
	public Prestacoes(Date dataVenc, Double valor) {
		this.dataVenc = dataVenc;
		this.valorAtu = valor;
	}

	public Date getDataVenc() {
		return dataVenc;
	}

	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}

	public Double getValor() {
		return valorAtu;
	}

	public void setValor(Double valor) {
		this.valorAtu = valor;
	}
	
	@Override
	public String toString() {
		return sdf.format(dataVenc) + " - " + String.format("%.2f", valorAtu);
	}
	
	

}
