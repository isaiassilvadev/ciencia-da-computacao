import java.util.Scanner;
public class ParOuImpar {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero;
        String resultado;
        
        System.out.println("Digite um número inteiro: ");
        numero = ent.nextInt();
        
        if(numero % 2 == 0){
            resultado = "O número "+numero+" é par";
        } else {
            resultado = "O número "+numero+" é ímpar";
        }

        System.out.println(resultado);
        ent.close();
    }

}
