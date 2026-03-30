import java.util.Scanner;

public class ValorAumentoSalario {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    
      System.out.print("Qual o seu plano de trabalho: ");
      String plano = entrada.next();
      System.out.print("Qual é o valor do seu salário: ");
      double salario = entrada.nextDouble();
      
      double novoSalario;

      switch(plano) {
        case "A":
            novoSalario = salario + (salario  * 0.1);
            System.out.print("O novo valor do seu salário é R$ "+ novoSalario);
            break;
        case "B":
            novoSalario = salario + (salario  * 0.15);
            System.out.print("O novo valor do seu salário é R$ "+ novoSalario);
            break;
        case "C":
            novoSalario = salario + (salario  * 0.2);
            System.out.print("O novo valor do seu salário é R$ "+ novoSalario);
            break;
        default:
            System.out.print("Plano não encontrado");
      }
    
      entrada.close();
  }
}
