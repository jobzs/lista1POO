package Exercicio1;

import java.util.Locale;

//1. Dada uma seq��ncia de n�meros inteiros n�o-nulos, seguida por 0, imprimir seus quadrados.

public class Principal1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Quadrado quad = new Quadrado();
		
		quad.calcularQuadrado(5);
		quad.calcularQuadrado(9);
		quad.calcularQuadrado(15);
		quad.calcularQuadrado(30);
	}

}
