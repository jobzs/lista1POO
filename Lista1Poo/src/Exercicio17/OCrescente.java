package Exercicio17;

public class OCrescente {

	private int a;
	private int b;
	private int c;

	public void OrdenCrescente(int a, int b, int c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);

		if (c > a) {
			if (a > b) {
				System.out.printf("A ordem crescente: %d %d %d\n", b, a, c);
			} else {
				if (b < c) {
					System.out.printf("A ordem crescente: %d %d %d\n", a, b, c);
				}
			}
		}
		if (a > b) {
			if (b > c) {
				System.out.printf("A ordem crescente: %d %d %d\n", c, b, a);
			} else {
				if (c < a) {
					System.out.printf("A ordem crescente: %d %d %d\n", b, c, a);
				}
			}
		}
		if (a < b) {
			if (c < a) {
				System.out.printf("A ordem crescente: %d %d %d\n", c, a, b);
			} else {
				if (c < b) {
					System.out.printf("A ordem crescente: %d %d %d\n", a, c, b);
				}
			}
		}
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}
