import java.util.Scanner;

public class bonusSalario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu tempo de trabalho na empresa");
        int tempoTrabalho = entrada.nextInt();
        System.out.println("Digite seu salário");
        double salario = entrada.nextDouble();

        double bonus;

        if (tempoTrabalho >= 5) {
            bonus = (salario*0.2);
            System.out.println(" valor do seu bonus é "+bonus);
        } else {
            bonus = (salario*0.1);
            System.out.println(" valor do seu bonus é "+bonus);
        }

        entrada.close();
    }

}
