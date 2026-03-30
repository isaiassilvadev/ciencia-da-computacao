import java.util.Scanner;

public class CalculadoraOperacoes {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    double numero1 = entrada.nextDouble();
    System.out.print("Digite o segundo valor: ");
    double numero2 = entrada.nextDouble();
    System.out.print("Digite qual operção matemática deseja fazer (+, - , x, /): ");
    String operacao = entrada.next();
    double resultado;

    if (operacao.equals("+")) {
      resultado = numero1 + numero2;
      System.out.println(resultado);
    } else if (operacao.equals("-")) {
      resultado = numero1 - numero2;
      System.out.println(resultado);
    } else if (operacao.equals("x")) {
      resultado = numero1 * numero2;
      System.out.println(resultado);
    } else if (operacao.equals("/")) {
      if (numero2 > 0 && numero2 != 0) {
        resultado = numero1 / numero2;
        System.out.println(resultado);
      } else {
        System.out.println("Impossível dividir!!");
      }
    } else {
      System.out.println("Sinal Inválido!");
    }
  }
}