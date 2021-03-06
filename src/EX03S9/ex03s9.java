package EX03S9;

import java.util.Locale;
import java.util.Scanner;

public class ex03s9 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco contabancaria;
		
		int deposito = 0;
		int saque = 0;
		System.out.print("Qual a conta bancaria?");
		int conta = sc.nextInt();
		System.out.print("Qual o nome do titular da conta?");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja realizar um depósito? (S/N)");
		char d = sc.next().charAt(0);		
		
		if(d == 'S') {
			System.out.println("Qual o valor de depósito inicial?");
			deposito = sc.nextInt();
			contabancaria = new Banco(conta,nome,deposito);
		} else {
			contabancaria = new Banco(conta,nome);
		}	
		
		
		System.out.println("\nDados da conta:");
		System.out.println(contabancaria);
		
		System.out.println("Qual valor a depositar em conta?");
		deposito = sc.nextInt();
		contabancaria.Depositar(deposito);
		System.out.println(contabancaria);
		
		System.out.println("Qual valor a sacar em conta?");
		saque = sc.nextInt();
		contabancaria.Sacar(saque);
		System.out.println(contabancaria);
		
		
		
		

	}

	
}