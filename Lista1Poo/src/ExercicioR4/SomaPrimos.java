package ExercicioR4;

public class SomaPrimos {

	private int n;
	private int soma;

	

	public void somaPrimos(int n) {
		this.n = n;
		int soma = 0;
		int divisores;
		for (int i = 0; i < n; i++) {
			divisores = 0;
			for (int j = 1; j <= i; j++) {
				if ((i % j) == 0) {
					divisores++;
				}
			}
			if (divisores == 2) {
				soma += i;
				this.soma = soma;
			}
		}
		System.out.println("A soma entre os numeros primos de 0 a "+this.n+" é: "+this.soma);
		divisores = 0;
	}

}
