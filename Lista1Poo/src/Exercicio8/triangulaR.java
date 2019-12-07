package Exercicio8;


/*8. Dizemos que um n�mero natural � triangular se ele � produto de tr�s n�meros naturais
consecutivos.
Exemplo: 120 � triangular, pois 4.5.6 = 120.
Dado um inteiro n�o-negativo n, verificar se n � triangular*/

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
			System.out.printf("%d � triagular!\n", this.n);
		} else {
			System.out.printf("%d nao � triagular!\n", this.n);
		}
	}

}
