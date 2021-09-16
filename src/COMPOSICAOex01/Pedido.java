package COMPOSICAOex01;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
	
	private Date dataPedido;
	private StatusPedido status;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Cliente cliente;
	List<ItemPedido> pedido = new ArrayList<>();
	
	public Pedido () {
	
	}
	
	public Pedido(Date dataPedido, StatusPedido status, Cliente cliente) {
		this.dataPedido = dataPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<ItemPedido> getPedido() {
		return pedido;
	}

	public void setPedido(List<ItemPedido> pedido) {
		this.pedido = pedido;
	}
	
	public void adicionarItem (ItemPedido item) {
		pedido.add(item);
	}
	
	public void removerItem (ItemPedido item) {
		pedido.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (ItemPedido item : pedido) {
			sum += item.total();
		}
		return sum;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido: ");
		sb.append(sdf.format(dataPedido) + "\n");
		sb.append("Status do pedido: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Itens do pedido:\n");
		for (ItemPedido item : pedido) {
			sb.append(item + "\n");
		}
		sb.append("Preço Total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();

	}
}