import java.util.Scanner;

public class GuardaCincoNomes {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String[] nomes = new String[5];

    System.out.println("Digite cinco nomes:");
    for (int i = 0; i < 5; i++) {
      nomes[i] = entrada.nextLine();
    }

    System.out.println("Os nomes digitados foram:");
    for (int i = 0; i < 5; i++) {
      System.out.print(nomes[i]+", ");
    }
  }
}
