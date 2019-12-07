package Exercicio13;

public class CongruenteM {

	private int n;
	private int j;
	private int m;

	public void NumCongru(int n, int j, int m) {
		this.setN(n);
		this.setM(m);
		this.setJ(j);
		int cong;
		cong = j;

		System.out.printf("Os %d primeiros naturais congruentes a %d modulo %d sao: ", n, j, m);
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", cong);
			cong = cong + m;
		}
		System.out.printf("\n");

	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
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

}
