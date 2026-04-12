import java.util.Scanner;

public class DezValoresInteiros {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[] numeros = new int[10];
    // Atribuir valores inteiros ao vetor

    System.out.println("Digite dez valores inteiros:");
    for (int i = 0; i < 10; i++) {
      numeros[i] = entrada.nextInt(); // Lê os números do usuário
    }
    // Imprimir os valores do vetor

    System.out.println("Os valores digitados foram:");
    for (int i = 0; i < 10; i++) {
      System.out.print(numeros[i] + " ");
    }
  }

}