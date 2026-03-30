import java.util.Scanner;

public class PeriodoDeEstudoSaudacao {
  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    
      System.out.print("Estuda em qual período (M, T, N): ");
      String periodo = entrada.next();

      switch(periodo) {
        case "M":
            System.out.print("Bom Dia");
            break;
        case "T":
            System.out.print("Boa Tarde");
            break;
        case "N":
            System.out.print("Boa Noite");
            break;
        default:
            System.out.print("período escolhido não existe");
      }
    
      entrada.close();
  }
}
