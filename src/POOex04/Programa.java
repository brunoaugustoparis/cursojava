package POOex04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		conversao conversao = new conversao();
		
		System.out.println("Qual a cotação do dólar? ");
		conversao.cotacao = sc.nextDouble();
		System.out.println("Qual valor de dólar a ser comprado? ");	
		conversao.dolar = sc.nextDouble();
		
		System.out.println("O valor a ser pago em reais é: " + conversao.valorEmReal());		
	}

}
