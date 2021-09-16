package POLIMORFISMOex01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Produto> lista = new ArrayList<>();
		
		System.out.print("Qual número de produtos: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.print("Novo, usado ou importado: (n/u/i)");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			
			if (c == 'n') {
				Produto produto = new Produto(nome, preco);
				lista.add(produto);
			}
			
			if (c == 'u') {
				System.out.print("Qual a data de fabricação: ");
				Date date = sdf.parse(sc.next());
				Produto produto = new ProdutoUsado(nome, preco, date);
				lista.add(produto);
			}
			
			if (c == 'i') {
				System.out.print("Qual a taxa da alfândega: ");
				double tx = sc.nextDouble();
				Produto produto = new ProdutoImp(nome, preco, tx);
				lista.add(produto);
			}
		}
			
			System.out.println();
			System.out.println("ETIQUETAS DE PREÇO: ");
			
			for(Produto p : lista) {
				System.out.println(p.etiquetasPreco());
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		

	}

}
