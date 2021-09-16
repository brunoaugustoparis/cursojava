package COMPOSICAOex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite dos dados do cliente: ");
		System.out.print("Nome: ");
		String nomecliente = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (DD/MM/AAAA): ");
		Date data = sdf.parse(sc.nextLine());		
		Cliente cliente = new Cliente(nomecliente, email, data);
		
		System.out.println("Digite dos dados do produto: ");
		System.out.print("Status do produto: ");
		StatusPedido status = StatusPedido.valueOf(sc.nextLine());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		System.out.print("Quantos produtos serão comprados: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Nome do produto: ");
			sc.nextLine();
			String nomeproduto = sc.nextLine();
			System.out.print("Preço do produto: ");
			Double precoproduto = sc.nextDouble();
			Produto produto = new Produto(nomeproduto, precoproduto);
			
			System.out.print("Quantidade do produto: ");
			int quantidadeproduto = sc.nextInt();
			
			ItemPedido itempedido = new ItemPedido(quantidadeproduto, precoproduto, produto);
			
			pedido.adicionarItem(itempedido);
			
		}	
		
		
		
		
		System.out.println();
		System.out.println("LISTA:");
		System.out.println(pedido);
		
		sc.close();		
		
		
		
		
		
		
		
		
		sc.close();
	}
		
}
