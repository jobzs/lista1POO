package Exercicio13;


//13. Dizemos que um n�mero i � congruente m�dulo m a j se i % m = j % m.
//Exemplo: 35 � congruente m�dulo 4 a 39, pois
//35 % 4 = 3 = 39 % 4.
//Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes 
//a j m�dulo m.


public class Principal13 {

	public static void main(String[] args) {
		CongruenteM num = new CongruenteM();
		num.NumCongru(5, 1, 6);

	}

}
