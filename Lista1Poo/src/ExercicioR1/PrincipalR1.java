package ExercicioR1;

//1. Dados n e n seq��ncias de n�meros inteiros n�o-nulos, cada qual seguida por um 0,
//calcular a soma dos n�meros pares de cada seq��ncia.

public class PrincipalR1 {

	public static void main(String[] args) {

		ParSeque seq = new ParSeque();

		int[] n1 = {52, 55, 8, 19, 42, 37};
		int[] n2 = {72, 38, 55, 4, 81, 9};

		seq.somaSeq(n1, n2);

	}
}
