import java.util.Scanner;

public class validarSenha {
    public static void main(String[] args) {
        Scanner senha = new Scanner(System.in);

        String senhaCorreta = "R10p5";

        System.out.println("Digite sua senha");
        String senhaUsuario = senha.nextLine();

        if (senhaCorreta.equals(senhaUsuario)) {
            System.out.println("Acesso concedido");
        } else {
            System.out.println("Acesso negado");
        }

        senha.close();
    }
}
