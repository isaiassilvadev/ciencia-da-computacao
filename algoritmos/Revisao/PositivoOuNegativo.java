import java.util.Scanner;
public class PositivoOuNegativo {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero;
        String result;

        do {
            System.out.println("Digite um número inteiro: ");
            numero = ent.nextInt();
        } while(numero == 0);
        
        result = (numero < 0)? "é negativo": "é positivo";
        
        System.out.println("O número "+numero+" "+result);
        ent.close();
    }
    
}
