import java.util.Scanner;

public class VetorBMultiploDeA {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];

    System.out.println("Digite 5 números para o vetor A: ");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = entrada.nextInt();
    }

    for (int i = 0; i < vetorA.length; i++) {
      vetorB[i] = vetorA[i] * 3;
    }

    System.out.println("-------------------------------");
    System.out.println("Resultados:");
    for (int i = 0; i < vetorB.length; i++) {
      System.out.println(vetorA[i]+" * 3 = "+vetorB[i]+", ");
    }
  }
}