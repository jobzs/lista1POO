package Exercicio1;


public class Quadrado {
	
	private int Quadrado;

	public int getQuadrado() {
		return Quadrado;
	}

	public void setQuadrado(int quadrado) {
		this.Quadrado = quadrado;
	}
	
	public void calcularQuadrado(int n) {  
		this.Quadrado = n;
	        if (this.Quadrado > 0) {
	            int q = this.Quadrado * this.Quadrado;
	            System.out.printf("O quadrado de %d é igual a %d \n",this.Quadrado , q);
	            
	        } else {
	        	System.out.println("Numero igual a 0 ou menor que 0");
	        }
	    }

}
