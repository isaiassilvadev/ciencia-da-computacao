import java.util.Scanner;

public class CardapioLanchonete {
  	public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
    

      System.out.println("---------------------------------");
      System.out.println("Código    Produto          Preço ");
      System.out.println("---------------------------------");
      System.out.println("100       Cachorro Quente R$ 1,20");
      System.out.println("101       Bauru Simples   R$ 1,30");
      System.out.println("102       Bauru Com Ovo   R$ 1,50");
      System.out.println("103       Hambúrguer      R$ 1,20");
      System.out.println("104       Cheeseburguer   R$ 1,30");
      System.out.println("105       Refrigerante    R$ 1,00");
      System.out.println("---------------------------------");
      System.out.print("Digite o código do Produto: ");
      int codigo = entrada.nextInt();
      System.out.print("Digite a quantidade: ");
      int quantidade = entrada.nextInt();
      
      double precoFinal;

      switch(codigo) {
        case 100:
            precoFinal = 1.2 * quantidade;
            System.out.print(quantidade+" Cachorro Quente R$ "+precoFinal);
            break;
        case 101:
            precoFinal = 1.3 * quantidade;
            System.out.print(quantidade+" Bauru Simples R$ "+precoFinal);
            break;
        case 102:
            precoFinal = 1.5 * quantidade;
            System.out.print(quantidade+" Bauru Com Ovo R$ "+precoFinal);
            break;
        case 103:
            precoFinal = 1.2 * quantidade;
            System.out.print(quantidade+" Hambúrguer R$ "+precoFinal);
            break;
        case 104:
            precoFinal = 1.3 * quantidade;
            System.out.print(quantidade+" Cheeseburguer R$ "+precoFinal);
            break;
        case 105:
            precoFinal = 1 * quantidade;
            System.out.print(quantidade+" Refrigerante R$ "+precoFinal);
            break;
        default:
            System.out.print("Código não cadastrado");
      }
    
      entrada.close();
  }
}
