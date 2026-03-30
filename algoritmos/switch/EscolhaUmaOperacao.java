import java.util.Scanner;

public class EscolhaUmaOperacao {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    
      System.out.print("Digite um número: ");
      double n1 = entrada.nextDouble();
      System.out.print("Digite outro número: ");
      double n2 = entrada.nextDouble();
      
      System.out.println("===================================");
      System.out.println("M - média entre números digitados");
      System.out.println("S - Diferença do maior pelo menor");
      System.out.println("P - Produto entre o números digitados");
      System.out.println("D - Divisão do primeiro pelo segundo");
      System.out.println("Agora escolha uma das Opções acima: ");
      String opcao = entrada.next();
      
      double resultado;

      switch(opcao) {
        case "M":
            resultado =(n1  + n2)/2;
            System.out.print("Média = "+ resultado);
            break;
        case "S":
            if(n1 > n2) {
                resultado = n1 - n2;
            } else {
                resultado = n2 - n1;
            }
            System.out.print("Diferença do maior para o menor é = "+ resultado);
            break;
        case "P":
            resultado =(n1  + n2)/2;
            System.out.print("Produto entre os números é = "+ resultado);
            break;
        case "D":
            resultado = n1/n2;
            System.out.print("O resultado da divião do primeiro pelo segundo é = "+ resultado);
            break;
        default:
            System.out.print("Opção inválida");
      }
    
      entrada.close();
  }
}
