import java.util.Scanner;

public class mediaAritmeticaCincoAlunos {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int cont = 1;
	double nota1;
	double nota2;
	double media;
	
	while(cont <= 5) {
	    
        do {
          System.out.print("Digite a primeira nota: ");
          nota1 = entrada.nextDouble();
          System.out.print("Digite a segunda nota: ");
          nota2 = entrada.nextDouble();
        } while(!(nota1 >= 0 && nota1 <= 10) && !(nota2 >= 0 && nota2 <= 10));
      
      media = (nota1 + nota2)/2;
      
      System.out.println("A média do Aluno "+ cont+ " é igual a "+media);
       cont++;
	}
  }
}