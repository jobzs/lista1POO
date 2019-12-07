package Exercicio7;

//7. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem
//crescente os n primeiros naturais que são múltiplos de i ou de j e ou de ambos.
//Exemplo: Para n = 6 , i = 2 e j = 3 a saída deverá ser : 0,2,3,4,6,8.


public class Principal7 {

	public static void main(String[] args) {
	PriNaturais primeiro = new PriNaturais();
	primeiro.Naturais(6, 2, 3);

	}

}
