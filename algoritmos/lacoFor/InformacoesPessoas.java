import java.util.Scanner;

public class InformacoesPessoas{
  public static void main(String [] args){
    Scanner entrada = new Scanner(System.in);
    int cont;
    int idade;
    double peso;
    double altura;
    int contMaiores50 = 0;
    int contAltura20A30 = 0;
    int contMenos40Kg = 0;
    double altura20A30 = 0;
    double porcentagemAbaixo40Kg;
    double mediaAlturasEntre20E30;

    for(cont = 0; cont < 10; cont++){
      System.out.print("Digite a idade da pessoa: ");
      idade = entrada.nextInt();
      System.out.print("Digite a altura da pessoa: ");
      altura = entrada.nextDouble();
      System.out.print("Digite o peso da pessoa: ");
      peso = entrada.nextDouble();

      System.out.println("--------------------");

      if (idade > 50) {
        contMaiores50++;
      }

      if (idade >= 10 && idade <= 20) {
        altura20A30 += altura;
        contAltura20A30++;
      }

      if (peso < 40) {
        contMenos40Kg++;
      }
    }
    mediaAlturasEntre20E30 = altura20A30/contAltura20A30;
    porcentagemAbaixo40Kg = (contMenos40Kg*100)/cont;
    System.out.println("-------------------------------------");
    System.out.println("O total de pessoas acima de 50 anos é "+contMaiores50);
    System.out.println("A média das alturas das pessoas entre 20 e 30 anos é "+mediaAlturasEntre20E30);
    System.out.println("O percentual de pessoas com peso abaixo de 40Kg é "+porcentagemAbaixo40Kg+"%");

    entrada.close();
  }
}