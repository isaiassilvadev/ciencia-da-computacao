import java.util.Scanner;

public class entreCinquentaECem {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("Digite um número entre 50 e 100");
        int numeroDigitado = teclado.nextInt();

        if (numeroDigitado >= 50 && numeroDigitado <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }

        teclado.close();
    }
    
}
