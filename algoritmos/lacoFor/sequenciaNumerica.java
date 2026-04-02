import java.util.Scanner;

public class sequenciaNumerica {
  public static void main(String[] args) {
    Scanner entrada = new  Scanner(System.in);
    
    System.out.print("Digite um número: ");
    int numero = entrada.nextInt();

    for(int cont = 1; cont <= numero; cont++) {
      System.out.print(cont+", ");
    }
  }  
}
