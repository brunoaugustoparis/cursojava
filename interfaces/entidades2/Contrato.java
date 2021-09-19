package entidades2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	
	private Integer numero;
	private Date data;
	private Double valorContrato;
	
	List<Prestacoes> list = new ArrayList<>();

	public Contrato(Integer numero, Date data, Double valorContrato) {
		this.numero = numero;
		this.data = data;
		this.valorContrato = valorContrato;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorTotal) {
		this.valorContrato = valorTotal;
	}

	public List<Prestacoes> getList() {
		return list;
	}

	public void addPrestacao(Prestacoes prestacao) {
		list.add(prestacao);
	}

	public void removePrestacao(Prestacoes prestacao) {
		list.remove(prestacao);
	}
}
	
	


