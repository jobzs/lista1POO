
package lista1;

import java.util.Scanner; 
/**
 *
 * @author Aluno
 */
public class Lista1 {
    
    public static void ExercicioR1(){
        //1. Dados n e n seqüências de números inteiros não-nulos, 
        //cada qual seguida por um 0, calcular a soma dos números 
        //pares de cada seqüência.
        
        
        Scanner ler = new Scanner(System.in);
        
	int n, i, total = 0;

	System.out.printf("Digite um número para n:");
	n = ler.nextInt();

	for(i = 0; i <= n; i++){	
		if(i % 2 == 0){
		total = total + i;	
		}
	}

	 System.out.printf("O total da soma dos pares é: %d \n", total);
    }
    
    
    public static void ExercicioR2(){
        
        //2. Dado um número inteiro positivo n, 
        //determinar todos os inteiros entre 1 e n que são
        //comprimento da hipotenusa de um triângulo retângulo 
        //com catetos inteiros
        
        Scanner ler = new Scanner(System.in);
        

        boolean encontrou;
        int n, cateto1, cateto2, hipot;
        
        System.out.printf("Digite o comprimento maximo da hipotenusa: ");
        n = ler.nextInt();
        
        for(hipot = 1; hipot <= n; hipot++){
            encontrou = false;
            for(cateto1 = 1; cateto1 < hipot && !encontrou; cateto1++){
                cateto2 = cateto1;
                while(cateto1*cateto1 + cateto2*cateto2 < hipot*hipot)
                    cateto2++;
                if (cateto1*cateto1 + cateto2*cateto2 == hipot*hipot){
                    System.out.printf("hipotenusa = %d, catetos %d e %d\n", hipot, cateto1, cateto2);
                    encontrou = true;
                }
            }
        }
    }
        
        public static void ExercicioR3(){
            
            //3. Dados dois naturais m e n determinar, entre todos os 
            //pares de números naturais (x,y)tais que x < m e y < n,
            //um par para o qual o valor da expressão xy - x2 + y seja máximo e
            //calcular também esse máximo.
            
            Scanner ler = new Scanner(System.in);
            
            int m, n;
            int x, y;
            int valor;
            int xmax = 0; 
            int ymax = 0;
            int valormaximo = 0;
            
             System.out.printf("Digite o valor de m: ");
             m = ler.nextInt();
             System.out.printf("Digite o valor de n: ");
             n = ler.nextInt();
             
             for(x = 0; x <= m; x++){
                 for(y = 0; y <= n; y++){
                     valor = (x*y) - (x*x) + y;
                     if (valor > valormaximo){
                         valormaximo = valor;
                         xmax = x;
                         ymax = y;
                     }
                 }
             }
             System.out.printf("Valor maximo da funcao = %d foi alcancado com x = %d e "
                     + "y = %d\n", valormaximo, xmax, ymax);
        }
             

        
        
        
        
        
        





    
    public static void main(String[] args) {
        
       ExercicioR3();
         
    }
    
}
