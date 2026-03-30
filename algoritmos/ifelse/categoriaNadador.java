import java.util.Scanner;

public class categoriaNadador {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idadeNadador = entrada.nextInt();

        if (idadeNadador >= 5 && idadeNadador <= 7) {
            System.out.println("Categoria: InfantilA");
        } else if (idadeNadador > 7 && idadeNadador <= 10) {
            System.out.println("Categoria: InfantilB");
        } else if (idadeNadador > 10 && idadeNadador <= 13) {
            System.out.println("Categoria: JuvenilA");
        } else if (idadeNadador > 13 && idadeNadador <= 17) {
            System.out.println("Categoria: JuvenilB");
        } else if (idadeNadador >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Abaixo da idade permitida!");
        }

        entrada.close();
    }
}
