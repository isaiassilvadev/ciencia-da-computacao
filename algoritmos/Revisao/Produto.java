//Classe Produto

public class Produto {
       private String nome;
       private Float preco;
       private int quantidade;

     public Produto() {
     }

     public Produto(String nm, Float prc, int quant) {
         this.nome = nm;
         this.preco = prc;
         this.quantidade = quant;
     }

    public String getNome() {
          return nome;
    }

   public Float getPreco() {
          return preco;
    }

   public int getQuantidade() {
          return quantidade;
    }

   public void setNome(String nome) {
          if(nome != null) {
              this.nome = nome;
          }
     }

    public void setPreco(Float preco) {
          if(preco >=0) {
              this.preco = preco;
          }
     }

    public void setQuantidade (int quant) {
          if(quant >= 0) {
              this.quantidade = quant;
          }
     }
}


// Programa principal 

public class Main {
    public static void main(String[] args) {
    Produto prod1 = new Produto(biscoito, 2.5, 10);

   prod1.setNome("bolacha");
   prod1.setPreco(1.5F);
  prod1.setQuantidade(15);

   System.out.println("Nome: " + prod1.getNome());
   System.out.println("Preço: " + prod1.getPreco());
   System.out.println("Quantidade: " + prod1.getQuantidade());
    }
}
