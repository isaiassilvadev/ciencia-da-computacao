import java.util.Random;

public class SorteioDezNumeros {
  public static void main(String[] args) {
    Random random = new Random();
    // Código para sortear dez números
    int[] numeros = new int[10];

    for (int i = 0; i < 10; i++) {
      numeros[i] = random.nextInt(10) + 1;
    }
    // Imprimir os números sorteados
    System.out.println("Números sorteados:");
    for (int i = 0; i < 10; i++) {
      System.out.print(numeros[i] + " ");
    }

  }
}