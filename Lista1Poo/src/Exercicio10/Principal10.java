package Exercicio10;

//10. Dados dois n�meros inteiros positivos, determinar o m�ximo divisor comum entre eles
//usando o algoritmo de Euclides.

public class Principal10 {

	public static void main(String[] args) {
		Euclides euc = new Euclides();
		euc.AlgEuc(24, 15);
		euc.AlgEuc(1320, 5);
		euc.AlgEuc(23732, 152);
	}

}
