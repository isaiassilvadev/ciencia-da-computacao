import java.util.Scanner;

public class numerosEmOrdem {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = teclado.nextDouble();

        if (numero1 > numero2) {
            System.out.println(numero1+" "+numero2);
        } else {
            System.out.println(numero2+" "+numero1);
        }

        teclado.close();
    }
}
