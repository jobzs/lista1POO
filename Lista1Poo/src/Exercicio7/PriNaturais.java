package Exercicio7;

public class PriNaturais {

	private int i;
	private int j;
	private int n;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void Naturais(int n, int i, int j) {
	    this.setN(n);
	    this.setI(i);
	    this.setJ(j);
	    
	    System.out.printf("Os %d primeiros multiplos de %d ou de %d sao: ", n, i, j);
		int multiplo = 0, contador = 0;
	    while (contador < n){
	        if (multiplo%i == 0 || multiplo%j == 0){
	            System.out.printf(" %d,", multiplo);
	            contador = contador + 1;
	        }
	        multiplo = multiplo + 1;
	    }
	    System.out.printf("\n");
	}
}
