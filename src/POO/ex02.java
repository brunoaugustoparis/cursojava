package POO;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ex02funcionario funcionario = new ex02funcionario();

		System.out.println("Digite o nome do funcion�rio: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o sal�rio bruto do funcion�rio: ");
		funcionario.salario = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println("\nFuncion�rio: " + funcionario.name + ", $ " + funcionario.salarioLiquido());

		System.out.println("\nQual a porcentagem de incremento de sal�rio: ");
		double aumento = sc.nextDouble();

		System.out.println("\nNovo sal�rio: " + funcionario.name + ", $ " + funcionario.novoSalario(aumento));

	}

}
