package POOex04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		conversao conversao = new conversao();
		
		System.out.println("Qual a cota��o do d�lar? ");
		conversao.cotacao = sc.nextDouble();
		System.out.println("Qual valor de d�lar a ser comprado? ");	
		conversao.dolar = sc.nextDouble();
		
		System.out.println("O valor a ser pago em reais �: " + conversao.valorEmReal());		
	}

}
