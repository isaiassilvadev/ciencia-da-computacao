import java.util.Scanner;
public class NumerosPrimos
{
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
        int numero;
        int contDivisores = 0;
        
        System.out.println("Digite um número inteiro positivo: ");
        numero = ent.nextInt();
        
         for(int i = 1; i <= numero; i++){
             
           if(numero % i == 0) {
               contDivisores++;
           }
        }
        
       if(contDivisores > 2) {
            System.out.println("O número "+numero+" não é primo");
        } else {
            System.out.println("O número "+numero+" é primo");
        }
        
        System.out.println(contDivisores);
        
        System.out.println("---------------------------------");
        System.out.println("Todos os números primos de 1 a 100");
        int numerosPrimos[];
        
        
         for(int i = 1; i <= 100; i++){
           for(int j = 1; j <= 100; j++) { 
             if(i % j == 0) {
               contDivisores++;
             }
           }
           if(contDivisores <= 2) {
               numerosPrimos = new int[i];
           }
        }
        
        
         for(int i = 1; i <= numerosPrimos.length; i++){
            System.out.println(numerosPrimos[i]);
        }
        ent.close();
	}
       
}
