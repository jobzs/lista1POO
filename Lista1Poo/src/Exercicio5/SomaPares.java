package Exercicio5;

public class SomaPares {

	private int[] n = new int[5];
	private static int j = 0;
	private int soma;

	public int[] getN() {
		return n;
	}

	public void setN(int n) {
		this.n[j] = n;
		j++;
	}

	

	public void SomaPar() {
		for (int i = 0; i < 5; i++) {
			if (n[i] % 2 == 0) {				
				this.soma = this.soma + n[i];
			}
		}
		System.out.printf("A soma dos pares %d\n", this.soma);
	}

}
