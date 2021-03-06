package POO;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		ex02funcionario funcionario = new ex02funcionario();

		System.out.println("Digite o nome do funcionário: ");
		funcionario.name = sc.nextLine();
		System.out.println("Digite o salário bruto do funcionário: ");
		funcionario.salario = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		funcionario.imposto = sc.nextDouble();

		System.out.println("\nFuncionário: " + funcionario.name + ", $ " + funcionario.salarioLiquido());

		System.out.println("\nQual a porcentagem de incremento de salário: ");
		double aumento = sc.nextDouble();

		System.out.println("\nNovo salário: " + funcionario.name + ", $ " + funcionario.novoSalario(aumento));

	}

}
