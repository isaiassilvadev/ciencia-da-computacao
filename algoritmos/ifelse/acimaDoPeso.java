import java.util.Scanner;

public class acimaDoPeso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a sua altura");
        double altura = entrada.nextDouble();
        System.out.println("Digite o seu sexo (M ou F)");
        String seuSexo = entrada.nextLine();

        double pesoIDealMasc = Math.pow(72.7, altura);
        double pesoIDealFem = Math.pow(62.1, altura);

        if (seuSexo == "m" || seuSexo == "M") {
            System.out.println(pesoIDealMasc);
        } else if (seuSexo == "f" || seuSexo == "F"){
            System.out.println(pesoIDealFem);
        }

        entrada.close();
    }
}
