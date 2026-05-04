import java.util.Scanner;
public class AprovadoReprovado {

    public static void main(String[] args) {
       Scanner ent = new Scanner(System.in);
       float mediaAluno;
       String res = null;
       
       System.out.println("Digite a média do aluno: ");
        mediaAluno = ent.nextFloat();
        
        if(mediaAluno >= 7){
           res = "Está Aprovado!";
        } else if(mediaAluno >= 5 && mediaAluno < 7){
           res = "Está de Recuperação";
        } else if(mediaAluno < 5) {
           res = "está Reprovado";
        }
        
        System.out.println("Média do aluno é "+mediaAluno+": Aluno "+res);
        ent.close();
    }
    
}
