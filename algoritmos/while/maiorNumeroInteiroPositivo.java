import java.util.Scanner;

public class maiorNumeroInteiroPositivo {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
    int contador = 1;
    int numero;
    int menorNumero = 0;

    while(contador <= 10) {
      System.out.print("Digite um número: ");
      numero = entrada.nextInt();
      
       if(menorNumero == 0 && numero != 0) {
           menorNumero = numero;
       }
      
      if(menorNumero > numero) {
          menorNumero = numero;
      }
      
      contador++;
    }
    System.out.println(" menor número digitado é "+ menorNumero);
  }
}
