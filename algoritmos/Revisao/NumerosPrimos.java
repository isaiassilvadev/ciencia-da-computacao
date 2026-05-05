import java.util.Scanner;
public class Main
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
        ent.close();
	}
       
}
