import java.util.Scanner;
public class Saudacao {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nome;
        int idade;
        
        System.out.println("Qual é o seu nome?");
        nome = ent.nextLine();
        System.out.println("Quanto anos você tem?");
        idade = ent.nextInt();
        
        System.out.println("Olá "+nome+"! Você tem "+idade+" anos."); 
        ent.close();
    }
    
}
