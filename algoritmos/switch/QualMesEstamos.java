import java.util.Scanner;

public class QualMesEstamos {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    
      System.out.print("Em que mês estamos: ");
      int numeroMes = entrada.nextInt();

      switch(numeroMes) {
        case 1:
            System.out.print("Em Janeiro");
            break;
        case 2:
            System.out.print("Em Fevereiro");
            break;
        case 3:
            System.out.print("Em Março");
            break;
        case 4:
            System.out.print("Em Abril");
            break;
        case 5:
            System.out.print("Em Maio");
            break;
        case 6:
            System.out.print("Em Junho");
            break;
        case 7:
            System.out.print("Em Julho");
            break;
        case 8:
            System.out.print("Em Agosto");
            break;
        case 9:
            System.out.print("Em Setembro");
            break;
        case 10:
            System.out.print("Em Outubro");
            break;
        case 11:
            System.out.print("Em Novembro");
            break;
        case 12:
            System.out.print("Em Dezembro");
            break;
        default:
            System.out.print("Mês inválido, digite um valor entre 1 e 12");
      }
    
      entrada.close();
  }
}
