package Exercicio4_2;

public class lojaDeDisco {

	int[] marco = new int[32];
	private static int j = 0;
	

	public void LojaMes() {
		int i;
		int mvenda = 0;
		int dia = 0;
		for (i = 1; i <= 31; i++) {
			if (marco[i] > mvenda) {
				mvenda = marco[i];
				dia = i;
			}
		}
		System.out.printf("A maior venda do mes de Marco foi no dia %d vendendo %d discos \n", dia, mvenda);

	}

	public int[] getMarco() {
		return marco;
	}

	public void setMarco(int marco) {
		this.marco[j] = marco;
		j++;
	}
}
