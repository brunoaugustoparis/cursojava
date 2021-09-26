package aplicacao3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Funcionarios;

public class Projeto {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Funcionarios> list = new ArrayList<>();
		
		System.out.print("Digite o caminho do arquivo: ");
		String caminho = sc.next();
		System.out.print("Digite o salário: ");
		Double salario = sc.nextDouble();
		
		BufferedReader br = new BufferedReader(new FileReader(caminho));
		
		String linha = br.readLine();
		
		while (linha != null) {
			String[] arq = linha.split(",");
			list.add(new Funcionarios(arq[0], arq[1], Double.parseDouble(arq[2])));	
			linha = br.readLine();
		}
		
		List <String> listEmail = list.stream()
									  .filter(p -> p.getSalario() > salario)
									  .map(p -> p.getEmail())
									  .sorted()
									  .collect(Collectors.toList());
		
		System.out.println("Email de pessoas cujo salário é superior a " + salario + ":");
		
		listEmail.forEach(System.out::println);
									  
		double soma = list.stream()
						 .filter(p -> p.getNome().charAt(0) == 'M')
						 .map(p -> p.getSalario())
						 .reduce(0.0, (x,y) -> x + y);
		
		System.out.println("Soma do salário de pessoas cujo nome começa com 'M': " + String.format("%.2f", soma));
	
		
		sc.close();
	}
		
}
