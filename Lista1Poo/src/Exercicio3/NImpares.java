package Exercicio3;



public class NImpares {

	private int n;	
	
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}



	public void impar(int n) {
		this.n = n;
		int i = 0; 
		int impar = 1;

		System.out.printf("Os impares de %d sao: \n", n);
		while (i < n) {
			System.out.printf("%d\n", impar);
			impar = impar + 2;
			i++;
		}

	}

	
}
