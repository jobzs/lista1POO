package Exercicio15;

//15. Dado um número natural na base decimal, transformá-lo para a base binária

public class DecBinario {

	private int n;
	private int bin;

	public void ConvBinario(int n) {
		this.setN(n);
		int bin;
		int aux;
		int dig;
		int pot;

		aux = n;
		bin = 0;
		pot = 1;

		while (aux > 0) {
			dig = aux % 2;
			aux = aux / 2;
			bin = bin + dig * pot;
			pot = pot * 10;
		}
		System.out.printf("%d para decimal e: %d\n", n, bin);
		this.setBin(bin);

	}

	public int getBin() {
		return bin;
	}

	public void setBin(int bin) {
		this.bin = bin;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
