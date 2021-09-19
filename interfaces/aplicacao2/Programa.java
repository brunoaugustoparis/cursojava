package aplicacao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades2.Contrato;
import entidades2.Prestacoes;
import servicos2.Pagamento;
import servicos2.PlataformaPaypal;

public class Programa {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número: ");
		int num = sc.nextInt();
		System.out.print("Data: ");
		Date data = sdf.parse(sc.next());
		System.out.print("Valor: ");
		double valor = sc.nextDouble();
		Contrato cont = new Contrato(num, data, valor);
		
		System.out.print("Qual a quantidade de prestações: ");
		int prest = sc.nextInt();
		
		Pagamento pagamento = new Pagamento(new PlataformaPaypal());
		
		pagamento.processandoContrato(cont, prest);
		
		System.out.println("Parcelas:");
		for (Prestacoes x : cont.getList()) {
			System.out.println(x);
		}

	}

}
