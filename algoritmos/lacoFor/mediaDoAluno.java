import java.util.Scanner;

public class mediaDoAluno {
  public static void main(String[] args) {
    Scanner entrada = new  Scanner(System.in);
    double mediaAluno = 0;
    double nota1;
    double nota2;
    double mediaGeral = 0;
    double somaMedia = 0;
    int contAprovados = 0;
    int exame = 0;
    int contReprovados = 0;
    int totalAlunos = 0;
    
    for(int cont = 1; cont <= 6; cont++) {
      System.out.print("Digite a primeira nota do aluno: ");
      nota1 = entrada.nextDouble();
      System.out.print("Digite a segunda nota do aluno: ");
      nota2 = entrada.nextDouble();

      mediaAluno = (nota1 + nota2) / 2;
      somaMedia += mediaAluno;
      totalAlunos++;

      if(mediaAluno >= 7) {
        contAprovados++;
      } else if (mediaAluno > 3 && mediaAluno < 7) {
        exame++;
      } else if(mediaAluno <= 3){
        contReprovados++;
      }
    }
    mediaGeral = somaMedia / totalAlunos;
    System.out.println("Número de alunos aprovados: "+contAprovados);
    System.out.println("Número de alunos em exame: "+exame);
    System.out.println("Número de alunos reprovados: "+contReprovados);
    System.out.println("Média da turma é "+mediaGeral);
  }
}
