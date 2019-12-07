package Exercicio16;

public class LadoTriangulo {

	private int a;
	private int b;
	private int c;

	public void TriangRet(int a, int b, int c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);

		int i;

		if (b > a) {
			i = a;
			a = b;
			b = i;
		}
		if (c > a) {
			i = a;
			a = c;
			c = i;
		}
		if (a * a == b * b + c * c) {
			System.out.printf("E um triangulo retangulo\n");
		} else {
			System.out.printf("Nao e triangulo retangulo\n");
		}

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

}
