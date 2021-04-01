package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date data = sdf.parse(sc.next());		

		Cliente cliente = new Cliente(nome, email, data);
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		StatusPedido status = StatusPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);		

		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Product price: ");
			double precoProduto = sc.nextDouble();
					
			Produto produto = new Produto(nomeProduto, precoProduto);
			
			System.out.print("Quantity: ");
			int quantidade = sc.nextInt();
			
			ItemPedido itemPedido = new ItemPedido(quantidade, precoProduto, produto); 
			
			pedido.addItem(itemPedido);			
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(pedido);
		
		sc.close();
	}
}
