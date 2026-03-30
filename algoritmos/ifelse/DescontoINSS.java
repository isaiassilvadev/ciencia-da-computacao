import java.util.Scanner;

public class DescontoINSS {
  public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("Qual o seu salário? R$ ");
    double salario = entrada.nextDouble();

    double desconto;

    if(salario <= 600){
      System.out.println("Você está isento");
    } else if (salario > 600 && salario <= 1200) {
      desconto = salario * 0.2;
      System.out.println("O valor do seu desconto é R$ "+desconto);
    } else if (salario > 1200 && salario <= 2000) {
      desconto = salario * 0.25;
      System.out.println("O valor do seu desconto é R$ "+desconto);
    } else if (salario > 2000) {
      desconto = salario * 0.3;
      System.out.println("O valor do seu desconto é R$ "+desconto);
    }

    entrada.close();
  }
}