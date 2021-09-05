package POOex01;

public class retangulo {
		
		double largura;
		double altura; 
		
		public double Area() {				
			return largura*altura;			
		}
		
		public double Perimetro() {				
			return (largura+altura)*2;			
		}
		
		public double Diagonal() {				
			return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));		
		}
		
	}
	
	
	


