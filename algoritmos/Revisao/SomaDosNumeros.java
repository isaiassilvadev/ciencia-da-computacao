import java.util.Scanner;
public class SomaDosNumeros {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int numero;
        int soma = 0;
        int quantNumeros = 0;
        
        System.out.println("Digite 0 a qualquer momemento para somar");
        do {
            System.out.println("Digite um número inteiro: ");
            numero = ent.nextInt();
            
            soma += numero;
            if (numero != 0){
               quantNumeros++;
            }
           
        }while(numero != 0);
        
        System.out.println("A soma dos números digitados é "+soma);
        System.out.println("A quantidade de números digitados foram "+quantNumeros);
        ent.close();
    }
    
}
