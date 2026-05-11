//Classe conta bancária 

public class ContaBancaria {
   private String titular;
   private double saldo;

   public ContaBancaria() {
   }

  public ContaBancaria(String tit, double sal) {
     this.titular = tit;
     this.saldo = sal;
   }
  
  public String getNome() {
        return nome;
  }

  public double getSaldo() {
        return saldo;
  }

 public void setNome(String nome) {
        if(nome != null) {
             this.nome = nome;
         }
  }

  public void setSaldo(int saldo) {
        if(saldo >= 0) {
             this.saldo = saldo;
         }
  }

  public void setDepositar(int valor) {
        if(valor >= 0) {
             this.saldo = saldo + valor;
         }
  }

  public void setSacar(int valor) {
        if(valor >= 0 && valor <= saldo) {
             this.saldo = saldo - valor;
         }
  }
}


//Programa Principal

public class Main {
    public static void main(String[] args) {
            ContaBancaria cb1 = new ContaBancaria("Antônio", 1000);
      
          //Sacar e depositar valores e mostrar o saldo da conta
            cb1.setDepositar(350);
           System.out.println("Saldo em conta: " + cb1.getSaldo());
      
           cb1.setSacar(500);
           System.out.println("Saldo em conta: " + cb1.getSaldo());
    }
  }
