import java.util.Scanner;

public class mediaPessoaAcimadeCinquenta {
  public static void main(String[] args) {
    Scanner entrada = new  Scanner(System.in);
    double media = 0;
    int idade;
    double altura;
    double somaAltura = 0;
    int totalMaisCinquenta = 0;
    
    for(int cont = 1; cont <= 5; cont++) {
      System.out.print("Digite a idade da pessoa: ");
      idade = entrada.nextInt();
      System.out.print("Digite a altura da pessoa: ");
      altura = entrada.nextDouble();

      if(idade > 50) {
        somaAltura += altura;
        totalMaisCinquenta++;
      }
    }
    media = somaAltura / totalMaisCinquenta;
    System.out.println("Média das alturas das pessoas com idade acima de 50 é "+media);
  }
  
}
