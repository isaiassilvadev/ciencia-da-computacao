import java.util.Scanner;

public class grauDeObesidadeIMC {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
  int cont = 1;
	double altura;
	double peso;
	double imc;
	int contadorObesos = 0;
	
	while(cont <= 10) {
      System.out.print("Digite sua altura: ");
      altura = entrada.nextDouble();
      System.out.print("Digite seu peso: ");
      peso = entrada.nextDouble();
      
      imc = peso / Math.pow(altura, 2);
      
      if(imc >= 18.5 && imc <= 24.9) {
            contadorObesos++;
       }
       cont++;
	}
    System.out.print(contadorObesos+" pessoas não obesas");
	entrada.close();
  }
}
