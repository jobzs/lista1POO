package Exercicio18e19;

//18. Qualquer número natural de quatro algarismos pode ser dividido em duas dezenas
	//formadas pelos seus dois primeiros e dois Ultimos digitos.
	//Exemplos:
	// 1297: 12 e 97.
	// 5314: 53 e 14.
	//19. Escreva um programa que imprime todos os milhares (4 algarismos) cuja raiz
	//quadrada seja a soma das dezenas formadas pela divisão acima.
	//Exemplo: raiz de 9801 = 99 = 98 + 01.
	//Portanto 9801 é um dos numeros a ser impresso.

public class Principal18 {

	public static void main(String[] args) {
		
		DividirN n = new DividirN();
		n.DividirDez();

	}

}
