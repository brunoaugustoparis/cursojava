package Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class projeto {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionários serão cadastrados?");
		int x = sc.nextInt();
		pacote[] funcionarios = new pacote[x];

		for (int i = 0; i < x; i++) {
			System.out.print("Digite o ID do funcionário:");
			int id = sc.nextInt();
			System.out.print("Digite o nome do funcionário:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Digite o salário do funcionário:");
			double salario = sc.nextDouble();
			funcionarios[i] = new pacote(id, nome, salario);
		}

		System.out.println("Qual ID do funcionário que terá aumento?");
		int idAumento = sc.nextInt();
		System.out.println("Qual a porcentagem de aumento?");
		double porcAumento = sc.nextDouble();

		for (int i = 0; i < x; i++) {
			if (idAumento == funcionarios[i].getId())	{
				funcionarios[i].setSalario(porcAumento);				
			} 
		}
		
		for (int i = 0; i < x; i++) {
			System.out.println(funcionarios[i].getId()
					+ ", " + funcionarios[i].getNome() 
					+ ", " + funcionarios[i].getSalario());
		}
		
		

	}

	

}
