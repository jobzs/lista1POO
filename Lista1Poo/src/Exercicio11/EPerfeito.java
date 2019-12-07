package Exercicio11;

public class EPerfeito {
	
	private int n;
	
	public void PerfeitoNum(int n){    
		        this.setN(n);
		        int soma = 0;

		        
		        for (int div = 1; div < n; div++){
		            if (n % div == 0)
		                soma = soma + div;
		        }
		        if (n == soma){
		            System.out.printf("O numero %d e perfeito\n", n);
		        }
		        else{
		            System.out.printf("O numero %d nao e perfeito\n", n);
		        }
		    }

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
		    

}
