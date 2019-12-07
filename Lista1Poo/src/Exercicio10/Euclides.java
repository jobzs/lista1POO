package Exercicio10;

public class Euclides {
	
		
		       private int n;
		       private int m;
		        // n = 24
		        //m = 15
		       public void AlgEuc(int n, int m) {
		    	   int i;
		    	   this.setN(n);
		    	   this.setM(m);
		        
		        System.out.printf("MDC(%d,%d) = ",n, m);
		        
		        i = n % m;
		        //i = 24 % 15
		        //i = 9
		        while(i !=0) {
		            //9 != 0
		            //15 != 0
		            //9 != 0
		            //6 != 0
		            //3 != 0
		            i = m % n;
		            //i = 15 % 24
		            //i=15
		            //i = 24 % 15
		            //i=9
		            //i = 15 % 9
		            //i = 6
		            //i = 9 % 6
		            //i = 3
		            //i = 6 % 3
		            //i = 0
		            m = n;
		            //m = 24
		            //m = 15
		            //m = 9
		            //m = 6
		            //m = 3
		            n = i;
		            //n = 15
		            //n = 9
		            //n = 6
		            //n = 3
		            //n = 0
		        }
		        System.out.printf("%d\n", m);
		  
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

}
