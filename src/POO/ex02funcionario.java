package POO;

public class ex02funcionario {
		
	String name;
	double salario;
	double imposto;
	double aumento;
	
	
	public double salarioLiquido () {
		return salario - imposto;
	}
	
	public double novoSalario (double porc) {
		return (salario+salario*porc/100) - imposto;
	}
	

}
