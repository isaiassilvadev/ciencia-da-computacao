import java.util.Scanner;
public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero;
        
        System.out.println("Digite um número inteiro: ");
        numero = ent.nextInt();
        
        if(numero < 0){
            System.out.println("O número "+numero+" é negativo");
        } else {
            System.out.println("O número "+numero+" é positivo");
        }
    }
    
}
