package EXCECOESex01;

import EXCECOESex01.EXCECOES;

public class Conta {

		private Integer numeroConta;
		private String nome;
		private Double saldo;
		private Double limiteSaque;
		
		public Conta(Integer numeroConta, String nome, Double saldo, Double limiteSaque) {
			this.numeroConta = numeroConta;
			this.nome = nome;
			this.saldo = saldo;
			this.limiteSaque = limiteSaque;
		}

		public Integer getNumeroConta() {
			return numeroConta;
		}

		public void setNumeroConta(Integer numeroConta) {
			this.numeroConta = numeroConta;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Double getSaldo() {
			return saldo;
		}

		public void setSaldo(Double saldo) {
			this.saldo = saldo;
		}

		public Double getLimiteSaque() {
			return limiteSaque;
		}

		public void setLimiteSaque(Double limiteSaque) {
			this.limiteSaque = limiteSaque;
		}
		
		public void saque(Double saque) {
			
			if (saque > getLimiteSaque() ) {
				throw new EXCECOES("Saque indisponível. O valor ultrapassa o Limite de saque.");
			}
			
			if (saque > getSaldo()) {
				throw new EXCECOES("Saque indisponível. O valor de saque é maior do que o saldo em conta.");
			}
			
			saldo -= saque;				
					
						
			
		}
		
				
		
}