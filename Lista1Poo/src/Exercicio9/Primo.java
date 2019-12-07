package Exercicio9;

public class Primo {

	private int n;
	private int divisores;

	public void verificarPrimo(int n) {
		this.setN(n);
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				this.divisores++;
			}
		}
		if(this.divisores == 0) {
			System.out.printf("%d é um numero primo \n", n);
			this.divisores = 0;
		} else {
			System.out.printf("%d não é um numero primo \n", n);
			this.divisores = 0;
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
