package POOex01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo retangulo = new retangulo ();
		

		System.out.println("Qual a altura do retângulo? ");
		retangulo.altura = sc.nextDouble();
		System.out.println("Qual a largura do retângulo? ");
		retangulo.largura = sc.nextDouble();
		
		System.out.printf("AREA: %.2f\n", retangulo.Area());
		System.out.printf("PERIMETRO: %.2f\n", retangulo.Perimetro());
		System.out.printf("DIAGONAL: %.2f\n", retangulo.Diagonal());
		
		sc.close();
		
		
		
	}

}
