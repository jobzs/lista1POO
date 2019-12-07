package ExercicioR1;

public class ParSeque {

	private int[] n1;
	private int[] n2;
	private int seq1;
	private int seq2;
	private int total;

	public void somaSeq(int[] n1, int[] n2) {
		this.setN1(n1);
		this.setN2(n2);

		int total = 0;
		int cont = 0;
		int seq1 = 0;
		int seq2 = 0;
		int[] soma = { 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < n1.length; i++) {
			if ((n1[i] % 2) == 0) {
				seq1 += n1[i];
				soma[cont] = n1[i];
				cont++;
			}
		}

		this.setSeq1(seq1);

		for (int i = 0; i < n2.length; i++) {
			if ((n2[i] % 2) == 0) {
				seq2 += n2[i];
				soma[cont] = n2[i];
				cont++;

			}
		}
		this.setSeq2(seq2);

		for (int i = 0; i < soma.length; i++) {
			total += soma[i];
		}

		this.setTotal(total);

		System.out.println("O total da soma de todos os numeros da primeira sequencia é: " + seq1);
		System.out.println("O total da soma de todos os numeros da segunda sequencia é: " + seq2);
		System.out.println("A soma de todos os pares das sequencias é: " + total);
	}

	public int[] getN1() {
		return n1;
	}

	public void setN1(int[] n1) {
		this.n1 = n1;
	}

	public int[] getN2() {
		return n2;
	}

	public void setN2(int[] n2) {
		this.n2 = n2;
	}

	public int getSeq1() {
		return seq1;
	}

	public void setSeq1(int seq1) {
		this.seq1 = seq1;
	}

	public int getSeq2() {
		return seq2;
	}

	public void setSeq2(int seq2) {
		this.seq2 = seq2;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
