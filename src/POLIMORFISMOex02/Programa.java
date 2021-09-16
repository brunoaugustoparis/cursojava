package POLIMORFISMOex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		List<CadastroPessoa> lista = new ArrayList<>();
		
		System.out.print("Qual número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			System.out.print("Pessoa física ou jurídica: (f/j)? ");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite a renda anual: ");
			Double renda = sc.nextDouble();			
			if (c == 'f') {
				System.out.print("Gasto com saúde: ");
				double gastosaude = sc.nextDouble();
				CadastroPessoa pessoa = new CadastroPF(nome, renda, gastosaude);
				lista.add(pessoa);
			}
			else {
				System.out.print("Quantos funcionários a empresa possui: ");
				int func = sc.nextInt();
				CadastroPessoa pessoa = new CadastroPJ(nome, renda, func);
				lista.add(pessoa);
			}	
			
		}
		System.out.println();	
		System.out.println("IMPOSTOS PAGOS:");
		for (CadastroPessoa p : lista) {
			System.out.println(p.getNome() + ": R$ " + String.format("%.2f", p.impostoPago()));
		}
		
		double soma = 0;
		for(CadastroPessoa p : lista ) {
			soma += p.impostoPago();				
		}
		System.out.println();
		System.out.print("TOTAL DOS IMPOSTOS: R$" + String.format("%.2f", soma));
		
		
		sc.close();

	}

}
