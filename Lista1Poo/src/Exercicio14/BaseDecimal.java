package Exercicio14;

//14. Dado um número natural na base binária, transformá-lo para a base decimal.

public class BaseDecimal {

	private int n;
	private int conv;

	public void BinDecimal(int n) {
		this.setN(n);
		int poten = 1, conv = 0, m;
		m = n;

		while (n != 0) {
			conv = conv + n % 10 * poten;
			n = n / 10;
			poten = poten * 2;
		}
		System.out.printf("%d para decimal e: %d\n", m, conv);
		this.setConv(conv);
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getConv() {
		return conv;
	}

	public void setConv(int conv) {
		this.conv = conv;
	}

}
