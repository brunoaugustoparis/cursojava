package EXCECOESex01;

import java.util.Locale;
import java.util.Scanner;

import EXCECOESex01.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dados da conta: ");
		System.out.print("Conta: ");
		int conta = sc.nextInt();
		System.out.print("Nome: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double limite = sc.nextDouble();		
		Conta contaCliente = new Conta(conta, nome, saldo, limite);
		
		System.out.println();
		System.out.print("Qual valor que deseja sacar: ");
		double saqueCliente = sc.nextDouble();		
		try {
			contaCliente.saque(saqueCliente);		
			System.out.println("Novo saldo: " + String.format("%.2f", contaCliente.getSaldo()));
		}
		catch (EXCECOES x) {
			System.out.println("Erro no saque: " + x.getMessage());	
		}

		sc.close();
	}

}	
