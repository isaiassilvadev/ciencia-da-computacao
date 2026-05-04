import java.util.Scanner;
public class MediaDosAlunos {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        float notaA1;
        float notaA2;
        float notaA3;
        float media;
        
        System.out.println("Digite a nota do 1° aluno: ");
        notaA1 = ent.nextFloat();
        System.out.println("Digite a nota do 2° aluno: ");
        notaA2 = ent.nextFloat();
        System.out.println("Digite a nota do 3° aluno: ");
        notaA3 = ent.nextFloat();
        media = (notaA1 + notaA2 + notaA3)/3;
        
        System.out.println("A média da nota dos três alunos é: "+media);
        ent.close();
    }
    
}
