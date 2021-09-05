package ENCAPSULAMENTOex01;

public class Banco {
	
		private int conta;
		private String nome;
		private int deposito;
		int saldo = 0;
		
		public Banco(int conta2, String nome2,int deposito2) {
			this.conta = conta2;
			this.nome = nome2;
			Depositar(deposito2);			
		}		
		
		public Banco(int conta, String nome) {			
			this.conta = conta;
			this.nome = nome;
		}		

		public int Depositar(int deposito) {
			return saldo += deposito;
		}
		
		public int Sacar(int saque) {
			return saldo -= saque + 5;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public int getConta() {
			return conta;
		}
		
		public String toString() {
			return "Conta: " + conta
					+ ", Nome: " + nome
					+ ", Saldo: R$" + saldo;	
			
		}

	}
