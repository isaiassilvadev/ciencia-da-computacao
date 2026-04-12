import java.util.Scanner;

public class JuntaVetores {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    int[] vetorA = new int[4];
    int[] vetorB = new int[7];
    int[] vetorC = new int[11];

    System.out.println("Digite 4 números: ");
    for (int i = 0; i < vetorA.length; i++) {
      vetorA[i] = entrada.nextInt();
    }

    System.out.println("Digite 7 números: ");
    for (int i = 0; i < vetorB.length; i++) {
      vetorB[i] = entrada.nextInt();
    }

    for (int i = 0; i < vetorA.length; i++) {
      vetorC[i] = vetorA[i];
    }
    for (int i = 0; i < vetorB.length; i++) {
      vetorC[i + vetorA.length] = vetorB[i];
    }

    System.out.println("-------------------------------------");
    System.out.println("Os números digitados foram");
    for (int i = 0; i < vetorC.length; i++) {
      System.out.println(vetorC[i]);
    }

  }
}