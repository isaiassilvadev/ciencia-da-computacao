import java.util.Scanner;

public class lendoValores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor");
        int valor1 = teclado.nextInt();
        System.out.println("Digite o segundo valor");
        int valor2 = teclado.nextInt();

        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else {
            System.out.println("A diferença entre os valores é " + (valor1 - valor2));
        }

        teclado.close();
    }
    
}