package Exercicio11;

//11. Dizemos que um inteiro positivo n � perfeito se for igual � soma de seus divisores
//positivos diferentes de n.
//Exemplo: 6 � perfeito, pois 1+2+3 = 6.

public class Principal11 {

	public static void main(String[] args) {
		EPerfeito num = new EPerfeito();
		num.PerfeitoNum(6);
		num.PerfeitoNum(3);
		num.PerfeitoNum(28);

	}

}
