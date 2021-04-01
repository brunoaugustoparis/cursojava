package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.cadastropessoa;
import entities.pessoafisica;
import entities.pessoajuridica;

public class Program2 {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<cadastropessoa> lista = new ArrayList<>();
		
		System.out.print("Qual o n�mero de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Dados do " + i + "� contibuinte:");
			System.out.print("Pessoa F�sica ou Jur�dica (f/j)?");
			char c = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Sal�rio Anual: ");
			Double salario = sc.nextDouble();
			if (c == 'f') {
				System.out.print("De quanto foi seu gasto com sa�de? ");
				Double gastoSaude = sc.nextDouble();				
				lista.add(new pessoafisica(nome,salario,gastoSaude));				
			} else {
				System.out.print("Qual o n�mero de funcion�rios? ");
				int func = sc.nextInt();
				lista.add(new pessoajuridica(nome,salario,func));
			}
			
		}

		double cont = 0;
		System.out.println();
		System.out.println("IMPOSTOS PAGOS:");
		for (cadastropessoa x : lista) {
			double imposto = x.imposto();
			System.out.println(x.getNome() + ": $ " + String.format("%.2f", imposto));
			cont += imposto;		
		}
		
		System.out.println();
		System.out.println("TOTAL IMPOSTOS: $ " + String.format("%.2f", cont));
		
		sc.close();
	}
}