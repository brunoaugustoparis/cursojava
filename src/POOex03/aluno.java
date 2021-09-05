package POOex03;

public class aluno {

		String name;
		int n1;
		int n2;
		int n3;
		
		public int somaNotas() {
			return n1+n2+n3;
		}
		
		public String toString () {
			return "SOMA DAS NOTAS = "
				+ somaNotas();
		}
		
		public int pontosRestantes () {
			return 60 - somaNotas();
		}		

	}


