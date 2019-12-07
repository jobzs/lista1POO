package Exercicio12;

public class Fibonnacci {

	private int n;
	private int fatual;

	public void SeqFibonnacci(int n) {
		this.setN(n);
		int fatual = 1;
		int fanterior = 0;
		int fproximo; 
		int i = 1;

		while (i < n) {
			fproximo = fatual + fanterior;
			fanterior = fatual;
			fatual = fproximo;
			i = i + 1;
		}
		System.out.printf("Numero %d de Fibonacc = %d\n", n, fatual);
		this.setFatual(fatual);

	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getFatual() {
		return fatual;
	}

	public void setFatual(int fatual) {
		this.fatual = fatual;
	}

	

}
