package SETex01;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	Set<Integer> a = new HashSet<>();
	Set<Integer> b = new HashSet<>();
	Set<Integer> c = new HashSet<>();

	System.out.print("Quantos alunos no curso A: ");
	int n = sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
		int cod = sc.nextInt();
		a.add(cod);
		}

	System.out.print("Quantos alunos no curso B: ");
	n=sc.nextInt();
	
		for(int i = 1;i<=n;i++) {
		int cod = sc.nextInt();
		b.add(cod);
		}

	System.out.print("Quantos alunos no curso C: ");
	n=sc.nextInt();
		
		for(int i = 1;i<=n;i++) {
		int cod = sc.nextInt();
		c.add(cod);
		}

	Set<Integer> total = new HashSet<>(a);
	total.addAll(b);
	total.addAll(c);

	System.out.println("Total estudantes: "+total.size());

	sc.close();

	}
}