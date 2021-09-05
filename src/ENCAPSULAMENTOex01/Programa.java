package ENCAPSULAMENTOex01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco contabancaria;
		
		
		System.out.print("Qual a conta bancaria?");
		int conta = sc.nextInt();
		System.out.print("Qual o nome do titular da conta?");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Deseja realizar um depósito inicial na conta? (S/N)");
		char d = sc.next().charAt(0);		
		
		if(d == 'S') {
			System.out.println("Qual o valor de depósito inicial?");
			int deposito = sc.nextInt();
			contabancaria = new Banco(conta,nome,deposito);
		} else {
			contabancaria = new Banco(conta,nome);
		}	
		
		
		System.out.println("\nDados da conta:");
		System.out.println(contabancaria);
		
		System.out.println("Qual valor a depositar em conta?");
		int deposito = sc.nextInt();
		contabancaria.Depositar(deposito);
		System.out.println(contabancaria);
		
		System.out.println("Qual valor a sacar em conta?");
		int saque = sc.nextInt();
		contabancaria.Sacar(saque);
		System.out.println(contabancaria);
		
		
		
		

	}

	
}