//Classe conta bancária 

public class ContaBancaria {
   private String titular;
   private float saldo;

   public ContaBancaria() {
   }

  public ContaBancaria(String tit, float sal) {
     this.titular = tit;
     
     if(sal >= 0) {
         this.saldo = sal;
       } else {
         System.out.println("Saldo inválido");
        this.saldo = 0;
       }
   }
  
  public String getNome() {
        return titular;
  }

  public float getSaldo() {
        return saldo;
  }

 public void setNome(String nome) {
        if(nome != null) {
             this.titular = nome;
         }
  }

  public boolean setDepositar(float valor) {
        if(valor >= 0) {
             this.saldo += valor; //Saldo + valor  = novo saldo
             return true;
         }  else {
            System.out.println("Valor do depósito inválido");
            return false;
        }
  }

  public boolean setSacar(float valor) {
        if(valor >= 0 && valor <= this.saldo) {
             this.saldo -= valor;
             return true;//operação realizada com sucesso
         }  else {
            System.out.println("Saldo insuficiente");
            return false; //operação não realizada
        }
  }
}


//Programa Principal

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            Scanner ent = new Scanner(System.in);

             //Criando conta bancária
             String nome;
             float saldo;

              System.out.println("Digite o nome do titular da conta: ");
              nome = ent.nextLine();
              System.out.println("Digite o saldo disponivel na conta: ");
              saldo = ent.nextFloat();
             
            ContaBancaria cb1 = new ContaBancaria(nome, saldo);
            ContaBancaria cb2 = new ContaBancaria("Antônio", 1000);

           boolean resp = cb2.setSacar(3000);
        
           if(resp){
               System.out.println("Saque realizado com sucesso");
              System.out.println("Saldo em conta: " + cb2.getSaldo());

           } else {
               System.out.println("Falha!");
              System.out.println("Saldo em conta: " + cb2.getSaldo());

           }
      
          //Sacar e depositar valores e mostrar o saldo da conta
          float valor;
          System.out.println("-------------------------------------");
          System.out.println("              DEPOSITAR              ");
          System.out.println("-------------------------------------");
        
       
          System.out.println("Digite o valor do depósito: ");
          valor = ent.nextFloat();
          cb1.setDepositar(valor);

          System.out.println("Saldo em conta: " + cb1.getSaldo());

         System.out.println("-------------------------------------");
         System.out.println("               SACAR                 ");
         System.out.println("-------------------------------------");
       
          System.out.println("Digite o valor do saque: ");
          valor = ent.nextFloat();
          cb1.setSacar(valor);  
           
           System.out.println("Saldo em conta: " + cb1.getSaldo());

           ent.close();
    }
  }
