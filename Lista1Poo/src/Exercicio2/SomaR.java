package Exercicio2;

public class SomaR {

	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void Somar(int n) {
	    int total = 0;
	    int i = 1;
	    while (i <= n) {
	        total = total + i;
	        i = i + 1;
	    }
	    
	    System.out.printf("A soma dos primeiros inteiros positivos de %d é %d\n", n, total);
	}

}
