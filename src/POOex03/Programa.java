package POOex03;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		aluno aluno = new aluno();
		
		System.out.print("Qual o nome do aluno?");
		aluno.name = sc.nextLine();
		System.out.print("Qual a primeira nota do aluno? ");
		aluno.n1 = sc.nextInt();
		System.out.print("Qual a segunda nota do aluno? ");
		aluno.n2 = sc.nextInt();
		System.out.print("Qual a terceira nota do aluno? ");
		aluno.n3 = sc.nextInt();
		System.out.println();
		
		System.out.println(aluno);
		
		if (aluno.somaNotas() < 60) {
			System.out.println("NÃO-APROVADO");
			System.out.println("FALTARAM " + aluno.pontosRestantes() + " PONTOS");
		} else {
			System.out.println("APROVADO");
		}
		
		
		
		
		
		
		sc.close();

	}

}
