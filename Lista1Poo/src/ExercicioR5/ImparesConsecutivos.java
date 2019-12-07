package ExercicioR5;

public class ImparesConsecutivos {

	private int n;

	public void ImparesCons(int n) {
		this.setN(n);

		int m, i, ini = 1;

		// n = 3

		for (m = 1; m <= n; m++) {

			System.out.printf("%d^3 = %d", m, ini);
			for (i = 1; i < m; i++)

				System.out.printf("+%d", ini + 2 * i);

			ini = ini + 2 * m;

			System.out.printf("\n");

		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
