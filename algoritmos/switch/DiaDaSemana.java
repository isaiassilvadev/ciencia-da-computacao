import java.util.Scanner;

public class DiaDaSemana {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Qual dia da semana é hoje: ");
      int numeroDia = entrada.nextInt();

      switch(numeroDia) {
        case 1:
            System.out.print("Hoje é domingo");
            break;
        case 2:
            System.out.print("Hoje é segunda-feira");
            break;
        case 3:
            System.out.print("Hoje é terça-feira");
            break;
        case 4:
            System.out.print("Hoje é quarta-feira");
            break;
        case 5:
            System.out.print("Hoje é quinta-feira");
            break;
        case 6:
            System.out.print("Hoje é segunda-feira");
            break;
        case 7:
            System.out.print("Hoje é sábado");
            break;
        default:
            System.out.print("Dia inválido, digite um valor entre 1 e 7");
      }
    
      entrada.close();
  }
}