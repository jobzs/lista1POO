package lista1;

import java.util.Scanner;


/**
 * @author Job
 */
public class Lista1 {
    

    
    public static void Exercicio1(){
/* 1. Dada uma seqüência de números inteiros não-nulos, seguida por 0, 
imprimir seus quadrados.*/

    Scanner ler = new Scanner(System.in);
        
        int n, q;
        System.out.println("Digite uma sequencia de numeros inteiros que não "
                + "sejam nulos, e que seja maior que 0: ");        
        n = ler.nextInt();
        
        while (n !=0) {
            q = n * n;
            System.out.printf("O quadrado de %d é igual a %d \n",n , q);
            System.out.println("Digite mais outro numero, ou 0 para sair");
             n = ler.nextInt();
            
        }    
    }
    
    public static void Exercicio2(){
        
/*2. Dado um número inteiro positivo n, calcular a soma dos n primeiros 
números inteiros positivos.*/

        Scanner ler = new Scanner(System.in);
        int n, i, total;
        
        System.out.printf("\nDigite um numero: ");
        n = ler.nextInt();
        total = 0;
        i = 1;
        
        while (i <= n) {
            total = total + i;
            i = i + 1;
        }
        
        System.out.printf("A soma dos primeiros inteiros positivos de %d é %d\n", n, total);
    }
    
    public static void Exercicio3(){
        
//3. Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares.
//Exemplo: Para n=4 a saída deverá ser 1,3,5,7.
        Scanner ler = new Scanner(System.in);
        int n, i = 0, impar = 1;
        
        System.out.printf("\nDigite um valor pra n: ");
        n = ler.nextInt();
  
        
        System.out.printf("Os impares de %d sao: \n", n);
        while(i<n){
            System.out.printf("%d\n", impar);
            impar = impar + 2;
            i++;
        }
                
    }
    
    public static void Exercicio4_1(){
        
//4. Dados um inteiro x e um inteiro não-negativo n, calcular x^n.
        Scanner ler = new Scanner(System.in);

        int x, n, potencia, i;
        
        System.out.printf("Digite um valor para x inteiro:");
        x = ler.nextInt();
        System.out.printf("Digite um valor para n inteiro não negativo:");
        n = ler.nextInt();
        
        potencia = 1;
        i = 0;
        
        while(i != n){
            potencia = potencia * x;
            i = i + 1;
        }
        System.out.printf("\n o valor de x=%d elevado a n=%d é\n: %d\n", x, n, potencia);
  
    }
    
    public static void Exercicio4_2(){
//4. Uma loja de discos anota diariamente durante o mês de março a quantidade de discos
//vendidos. Determinar em que dia desse mês ocorreu a maior venda e qual foi a
//quantidade de discos vendida nesse dia

        Scanner ler = new Scanner(System.in);

	int i, mvenda = 0, dia=0;
	int[] marco = new int[32];
	for(i = 1; i <= 31; i++){
            System.out.printf("Digite quantos discos foram vendidos no dia %d: \n",i);
            marco[i] = ler.nextInt();
        }
        for(i = 0; i <= 31; i++){
            if(marco[i] > mvenda){
                mvenda = marco[i];
                dia = i;
            }
        }
        System.out.printf("A maior venda do mes de Marco foi no dia %d vendendo %d discos \n", dia, mvenda);
	
    }
    
    public static void Exercicio5(){
        
//5. Dados n e uma seqüência de n números inteiros, determinar a soma dos números
//pares.
                
        int n[] = {10,20,33,40,50};
        int i, soma = 0;
        
        for(i=0; i<5; i++){
            if(n[i]%2==0){
                soma = soma + n[i];
            }
        }
          System.out.printf("A soma dos pares %d\n", soma);          
    }
    
    public static void Exercicio6(){
        
//6. Dado um inteiro não-negativo n, determinar n!.
        Scanner ler = new Scanner(System.in);
    
        int n, i, num = 1;
    
        System.out.printf("Digite um numero inteiro nao negativo\n");
        n = ler.nextInt();
    
        for(i = 2; i <= n; i++){
            num = num * i;         
        }
        System.out.printf("O valo de %d! = %d\n", n, num);

    }
    
    public static void Exercicio7(){
        
//7. Dados n e dois números inteiros positivos i e j diferentes de 0, imprimir em ordem
//crescente os n primeiros naturais que são múltiplos de i ou de j e ou de ambos.
//Exemplo: Para n = 6 , i = 2 e j = 3 a saída deverá ser : 0,2,3,4,6,8.
        Scanner ler = new Scanner(System.in);

        int i, j, n, multiplo = 0, contador = 0;
        
        System.out.printf("Digite o numero de multiplos seram impressos: \n");
        n = ler.nextInt();
        System.out.printf("Digite um numero para i e outro para j: \n");
        i = ler.nextInt();
        j = ler.nextInt();
        
        System.out.printf("Os %d primeiros multiplos de %d ou de %d sao: ", n, i, j);
        while (contador < n){
            if (multiplo%i == 0 || multiplo%j == 0){
                System.out.printf(" %d", multiplo);
                contador = contador + 1;
            }
            multiplo = multiplo + 1;
        }
        System.out.printf("\n");
    }
    
    public static void Exercicio8(){
//8. Dizemos que um número natural é triangular se ele é produto de três números naturais
//consecutivos.
//Exemplo: 120 é triangular, pois 4.5.6 = 120.
//Dado um inteiro não-negativo n, verificar se n é triangular
        Scanner ler = new Scanner(System.in);
        
        int i = 1, j = 0, n;
        
        System.out.printf("Entre com o número: \n");
        n = ler.nextInt();
        while(j < n){
            //j < 120
            j = i*(i+1)*(i+2);
            //6 = 1*(1+1)*(1+2)
            //24 = 2*(2+1)*(2+2)
            //60 = 3*(3+1)*(3+2)
            //120 = 4*(4+1)*(4+2)
            i++;
        }
            if(j == n){
                System.out.printf("%d é triagular!\n", n);
            }
            else{
                System.out.printf("%d nao é triagular!\n", n);
            }
    }
    
    public static void Exercicio9(){
//9.Dado um inteiro positivo n, verificar se n é primo.       
        Scanner ler = new Scanner(System.in);
        
        int n, divisores = 2, primo;
        
        System.out.printf("Digite um numero inteiro: \n");
        n = ler.nextInt();
        
        if(n <= 1){
            primo = 0;
        }
        else{
            primo = 1;
        }
        while(divisores <= n/2 && primo == 1){
            if(n % divisores == 0){
                primo = 0;
            }
            divisores= divisores++;
        } 
        System.out.printf("O inteiro %d", n);
        if(primo == 1){
            System.out.printf(" é primo\n");
        }
        else{
            System.out.printf(" nao e primo\n");
        }
  
 } 
    
    public static void Exercicio10(){
//10. Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles
//usando o algoritmo de Euclides.
        Scanner ler = new Scanner(System.in);
        int n, m, i;
        // n = 24
        //m = 15
        
        System.out.printf("Digite dois numeros inteiros positivos:\n");
        n = ler.nextInt();
        m = ler.nextInt();
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
    
    public static void Exercicio11(){
//11. Dizemos que um inteiro positivo n é perfeito se for igual à soma de seus divisores
//positivos diferentes de n.
//Exemplo: 6 é perfeito, pois 1+2+3 = 6.
//Dado um inteiro positivo n, verificar se n é perfeito.        
        Scanner ler = new Scanner(System.in);
        
        int n, soma = 0, div;

        System.out.printf("Digite um numero inteiro positivo: ");
        n = ler.nextInt();
        
        for (div = 1; div < n; div++){
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
    
    public static void Exercicio12(){
//14.  Um matemático italiano da idade média conseguiu modelar o ritmo de 
//crescimento da população de coelhos (1) através de uma seqüência de números 
//naturais que passou a ser conhecida como seqüência de Fibonacci (2). 
//O n-ésimo número da seqüência de Fibonacci Fn é dado pela seguinte fórmula de recorrência:  
//Faça um programa que, dado n, calcula Fn.
        Scanner ler = new Scanner(System.in);
        
        int n, fanterior = 0, fatual = 1, fproximo, i = 1;
        
        System.out.printf("Digite um numero para n: \n");
        n = ler.nextInt();
        while(i < n) {
            fproximo = fatual + fanterior;
            fanterior = fatual;
            fatual = fproximo;
            i = i+1;
        }
        System.out.printf("Numero %d de Fibonacc = %d\n", n, fatual);

    }
    
    public static void Exercicio13(){
//13. Dizemos que um número i é congruente módulo m a j se i % m = j % m.
//Exemplo: 35 é congruente módulo 4 a 39, pois 35 % 4 = 3 = 39 % 4.
//Dados inteiros positivos n, j e m, imprimir os n primeiros naturais congruentes a j módulo m.
        Scanner ler = new Scanner(System.in);
        
        int n, m, j, i, cong;
        
        System.out.printf("Digite valoes para n: \n");
        n = ler.nextInt();
        System.out.printf("Digite valoes para m: \n");
        j = ler.nextInt();
        System.out.printf("Digite valoes para j: \n");
        m = ler.nextInt();
        
        cong = j;
        
        System.out.printf("Os %d primeiros naturais congruentes a %d modulo %d sao: ",n, j, m);
        for (i = 0; i < n; i++) {
            System.out.printf("%d ", cong);
            cong = cong + m;   
        }
        System.out.printf("\n");

    }
    
    public static void Exericicio14(){
        
    }

    
    public static void ExercicioR1(){
        
//1. Dados n e n sequencias de numeros inteiros nao-nulos, 
//cada qual seguida por um 0, calcular a soma dos numeros 
//pares de cada sequencia.
        
        
        Scanner ler = new Scanner(System.in);
        
	int n, i, total = 0;

	System.out.printf("Digite um nÃºmero para n:");
	n = ler.nextInt();

	for(i = 0; i <= n; i++){	
		if(i % 2 == 0){
		total = total + i;	
		}
	}

	 System.out.printf("O total da soma dos pares Ã©: %d \n", total);
    }
    
    
    public static void ExercicioR2(){
        
//2. Dado um numero inteiro positivo n, 
//determinar todos os inteiros entre 1 e n que sao
//comprimento da hipotenusa de um triangulo retangulo 
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
//pares de numeros naturais (x,y)tais que x < m e y < n,
//um par para o qual o valor da expressao xy - x2 + y seja maximo e
//calcular tambem esse maximo.
            
            Scanner ler = new Scanner(System.in);
            
            int m, n, x, y, valor;
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
        
        public static void ExercicioR4(){
            
//4.  Dados n numeros inteiros positivos, calcular
//a soma dos que sao primos. 
           
           Scanner ler = new Scanner(System.in);

           
           
        }
        
        public static void ExercicioR5(){
            
//5. Sabe-se que um número da forma n^3
//é igual a soma de n ímpares consecutivos.
//Exemplo: 1^3= 1, 2^3= 3+5, 3^3= 7+9+11, 4^3= 13+15+17+19,...
           
           int n, m, i, ini = 1;
           Scanner ler = new Scanner(System.in);
           
           System.out.println("Digite o valor de n: ");
           n = ler.nextInt();
            //n = 3
           
           for(m = 1; m <= n; m++){
               
               System.out.printf("%d^3 = %d", m, ini);
               for(i = 1; i < m; i++)
                   
                   System.out.printf("+%d", ini + 2 * i);
            
               ini = ini + 2 * m;
            
               System.out.printf("\n");
               
               }
           }
          
                    
    

    
    public static void main(String[] args) {
        Exercicio13();
    }    
}
    

