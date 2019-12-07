package Exercicio18e19;

public class DividirN {

	
	public void DividirDez() {

		for (int x = 1; x <= 9999; x++) {
			int a = x / 100;
			int b = x % 100;
			int raiz = (a + b);

			if ((raiz * raiz) == x) {
				System.out.println(x + " = " + raiz + "² = " + a + " + " + b);
			}
		}
	}

}
