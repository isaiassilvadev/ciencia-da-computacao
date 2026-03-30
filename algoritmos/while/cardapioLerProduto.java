import java.util.Scanner;

public class cardapioLerProduto {
  public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	int codigo;
	int quantidade;
	double precoUnitario;
	double precoProduto;
	double precoFinal = 0;
	String continuar;
	    
        do {
          System.out.print("Código do produto: ");
          codigo = entrada.nextInt();
          System.out.print("Quantidade: ");
          quantidade = entrada.nextInt();
          
          switch(codigo) {
              case 100:
                precoUnitario = 1.2;
                precoProduto = precoUnitario * quantidade;
                precoFinal = precoFinal + precoProduto;
                System.out.println("Cachorro Quente, qtd: "+quantidade+", Total: "+precoProduto);
                break;
              case 101:
                 precoUnitario = 1.3;
                 precoProduto = precoUnitario * quantidade;
                 precoFinal = precoFinal + precoProduto;
                 System.out.println("Bauru Simples, qtd: "+quantidade+", Total: "+precoProduto);  
                 break;
              case 102:
                 precoUnitario = 1.5;
                 precoProduto = precoUnitario * quantidade;
                 precoFinal = precoFinal + precoProduto;
                 System.out.println("Bauru Com Ovo, qtd: "+quantidade+", Total: "+precoProduto);  
                 break;
              case 103:
                 precoUnitario = 1.2;
                 precoProduto = precoUnitario * quantidade;
                 precoFinal = precoFinal + precoProduto;
                 System.out.println("Hambúrguer, qtd: "+quantidade+", Total: "+precoProduto);  
                 break;
              case 104:
                  precoUnitario = 1.3;
                  precoProduto = precoUnitario * quantidade;
                  precoFinal = precoFinal + precoProduto;
                 System.out.println("Cheeseburguer, qtd: "+quantidade+", Total: "+precoProduto);  
                 break;
              case 105:
                  precoUnitario = 1;
                  precoProduto = precoUnitario * quantidade;
                  precoFinal = precoFinal + precoProduto;
                 System.out.println("Refrigerante, qtd: "+quantidade+", Total: "+precoProduto);  
                 break;
              default:
              System.out.println("Código não encontrado.");  
          }

          System.out.print("Deseja comprar algo mais? (Sim/Não)");
          continuar = entrada.next();
        } while(continuar.equals("sim") || continuar.equals("Sim"));
        
        System.out.print("Valor da compra: "+precoFinal);
      
  }
}
