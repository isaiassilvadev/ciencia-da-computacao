import java.util.Scanner;

public class VetorAMenosvetorB {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[] vetorA = new int[5];
    int[] vetorB = new int[5];
    int[] vetorC = new int[5];

    System.out.println("Digite 5 números para o vetor A: ");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = entrada.nextInt();
    }

    System.out.println("Digite 5 números para o vetor B: ");
    for (int i = 0; i < vetorB.length; i++) {
      vetorB[i] = entrada.nextInt();
    }
    for (int i = 0; i < vetorA.length; i++) {
      vetorC[i] = vetorA[i] - vetorB[i];
    }

    System.out.println("-------------------------------");
    System.out.println("Resultados:");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.println(vetorA[i]+" - "+vetorB[i]+" = "+vetorC[i]+", ");
    }
  }
}