package Exercicio8;


/*8. Dizemos que um número natural é triangular se ele é produto de três números naturais
consecutivos.
Exemplo: 120 é triangular, pois 4.5.6 = 120.
Dado um inteiro não-negativo n, verificar se n é triangular*/

public class triangulaR {

	private int n;

	public void EtriangulaR(int n) {
		this.n = n;
		int j = 0;
		int i;
		for (i = 1; i <= n; i++) {
			j += i;
			if (j >= n) {
				i = n + 1;
			}
		}
		if (j == this.n) {
			System.out.printf("%d É triagular!\n", this.n);
		} else {
			System.out.printf("%d nao é triagular!\n", this.n);
		}
	}

}
