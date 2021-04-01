package entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date momentoPedido;
	private StatusPedido status;
	
	private Cliente cliente;
	private List<ItemPedido> pedidos = new ArrayList<>();
	
	public Pedido(Date momentoPedido, StatusPedido status, Cliente cliente) {
		this.momentoPedido = momentoPedido;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomentoPedido() {
		return momentoPedido;
	}

	public void setMomentoPedido(Date momentoPedido) {
		this.momentoPedido = momentoPedido;
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

	public List<ItemPedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<ItemPedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void addItem (ItemPedido item) {
		pedidos.add(item);
	}	
	
	public void removeItem (ItemPedido item) {
		pedidos.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (ItemPedido item : pedidos) {
			sum += item.totalPedido();
		}
		return sum;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(sdf.format(momentoPedido) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (ItemPedido item : pedidos) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

	
		

}
