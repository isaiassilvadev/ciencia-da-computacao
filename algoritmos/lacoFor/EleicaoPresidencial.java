import java.util.Scanner;

public class EleicaoPresidencial {
  public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
    int voto;
    int contC1 = 0;
    int contC2 = 0;
    int contC3 = 0;
    int contC4 = 0;
    int contNulo = 0;
    int contBranco = 0;
    int totalVotos = 0;
    int totalBrancosNulos = 0;
    int percentualBranNulo = 0;

    for(int cont = 0; cont < 10; cont++){
      System.out.println("Seja Bem-vindo "+cont+"º Eleitor");
     System.out.println("======================");
     System.out.println("   Opções de voto     ");
     System.out.println("======================");
     System.out.println("1 - Candidato 1");
     System.out.println("2 - Candidato 2");
     System.out.println("3 - Candidato 3");
     System.out.println("4 - Candidato 4");
     System.out.println("5 - Anular Voto");
     System.out.println("6 - Votar em Branco");
     System.out.println("======================");

      System.out.print("em quem deseja votar: ");
      voto = entrada.nextInt();
      switch (voto) {
        case 1:
          contC1++;
          break;
        case 2:
          contC2++;
          break;
        case 3:
          contC3++;
          break;
        case 4:
          contC4++;
          break;
        case 5:
          contNulo++;
          break;
        case 6:
          contBranco++;
          break;
      
        default:
          System.out.println("Voto anulado");
          contNulo++;
      }

    }

    totalVotos = contC1 + contC2 + contC3 + contC4 + contNulo + contBranco;
    totalBrancosNulos = contNulo + contBranco;
    percentualBranNulo = (totalBrancosNulos*100)/totalVotos;
    System.out.println("=============================");
    System.out.println("     Resultado da eleição    ");
    System.out.println("=============================");
    System.out.println("Candidato 1: "+contC1);
    System.out.println("Candidato 2: "+contC2);
    System.out.println("Candidato 3: "+contC3);
    System.out.println("Candidato 4: "+contC4);
    System.out.println("Votos Nulos: "+contNulo);
    System.out.println("Votos Em Branco: "+contBranco);
    System.out.println("Percentual de Brancos e Nulos: "+percentualBranNulo+"%");
    entrada.close();
  }
}
