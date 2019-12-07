package Exercicio4;

public class NaoNegativo {

	private int x;
	private int n;
	private int Potencia;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	

	public int getPotencia() {
		return Potencia;
	}

	public void setPotencia(int potencia) {
		this.Potencia = potencia;
	}
	
	public void CalcularXN(int x, int n) {
		this.x = x;
		this.n = n;
	    int potencia = 1;
	    int i = 0;
	    
	    while(i != n){
	        potencia = potencia * x;
	        i = i + 1;
	        this.Potencia = potencia;
	    }
	    System.out.printf("\n o valor de x=%d elevado a n=%d é\n: %d\n", x, n, this.Potencia);

	}

}
