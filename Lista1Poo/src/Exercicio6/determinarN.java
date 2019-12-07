package Exercicio6;

public class determinarN {

	private int n;
	private int num = 1;

	public void determinarvalorN(int n) {

		this.n = n;

		for (int i = 2; i <= n; i++) {
			this.num = this.num * i;
		}
		System.out.printf("O valo de %d! = %d\n", this.n, this.num);

	}

}
