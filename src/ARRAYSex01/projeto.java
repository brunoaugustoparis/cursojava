package ARRAYSex01;

import java.util.Locale;
import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos quartos serão alugados?");
		int qtdQuartos = sc.nextInt();		
		quartos[] cadastro = new quartos[10];
		
		for (int i=0;i<qtdQuartos;i++) {	
			System.out.println("");
			System.out.print("Qual o nome do inquilino?");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Qual email do inquilino?");
			String email = sc.nextLine();
			System.out.print("Qual número do quarto alugado?");
			int n = sc.nextInt();
			cadastro[n] = new quartos(name,email,n);			
		}
		
			System.out.println("");
			System.out.println("Quartos ocupados:");
			for (int i=0; i<cadastro.length;i++) {
				if (cadastro[i] != null) {
					System.out.println(i + ": " + cadastro[i].getNome() + ", " + cadastro[i].getEmail());
				}
			}		

	}

}
