package ExercicioR3;

public class ParesNaturais {

	private int m;
	private int n;
	private int xmax;
	private int ymax;
	private int valormaximo;

	public void ParNatural(int m, int n) {

		this.setM(m);
		this.setN(n);

		int x, y, valor;
		int xmax = 0;
		int ymax = 0;
		int valormaximo = 0;

		for (x = 0; x <= m; x++) {
			for (y = 0; y <= n; y++) {
				valor = (x * y) - (x * x) + y;
				if (valor > valormaximo) {
					valormaximo = valor;
					xmax = x;
					ymax = y;
				}
			}
		}
		System.out.printf("Valor maximo da funcao = %d foi alcancado com x = %d e " + "y = %d\n", valormaximo, xmax,
				ymax);
		this.setValormaximo(valormaximo);
		this.setXmax(xmax);
		this.setYmax(ymax);
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getXmax() {
		return xmax;
	}

	public void setXmax(int xmax) {
		this.xmax = xmax;
	}

	public int getYmax() {
		return ymax;
	}

	public void setYmax(int ymax) {
		this.ymax = ymax;
	}

	public int getValormaximo() {
		return valormaximo;
	}

	public void setValormaximo(int valormaximo) {
		this.valormaximo = valormaximo;
	}

}
