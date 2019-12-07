package ExercicioR2;

public class IntHipotenusa {

	private int n;
	private int cateto1;
	private int cateto2;
	private int hipot;

	public void InteiroHip(int n) {
		this.setN(n);

		boolean encontrou;
		for (hipot = 1; hipot <= n; hipot++) {
			encontrou = false;
			for (cateto1 = 1; cateto1 < hipot && !encontrou; cateto1++) {
				cateto2 = cateto1;
				while (cateto1 * cateto1 + cateto2 * cateto2 < hipot * hipot)
					cateto2++;
				if (cateto1 * cateto1 + cateto2 * cateto2 == hipot * hipot) {
					System.out.printf("hipotenusa = %d, catetos %d e %d\n", hipot, cateto1, cateto2);
					encontrou = true;
				}
			}
		}
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

}
