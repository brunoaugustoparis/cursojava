package POOex02;

public class funcionario {
		
	String name;
	double salario;
	double imposto;
	
	
	public double salarioLiquido () {
		return salario - imposto;
	}
	
	public double novoSalario (double porc) {
		return (salario+salario*porc/100) - imposto;
	}
	

}
