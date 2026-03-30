import java.util.Scanner;

public class linhaCredito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu salário");
        double salarioBruto = entrada.nextDouble();
        System.out.println("Digite o valor da prestação");
        double valorPrestacao = entrada.nextDouble();

        double limitePermtido = salarioBruto*0.3; 

        if (valorPrestacao <= limitePermtido) {
            System.out.println("Empestimo pode ser concedido!");
        } else {
            System.out.println("Empestimo não pode ser concedido!");
        }

        entrada.close();
    }
}
