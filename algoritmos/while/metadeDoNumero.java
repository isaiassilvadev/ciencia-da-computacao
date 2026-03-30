public class metadeDoNumero {  
  public static void main(String[] args) {
    int contador = 10;
    double metade;

    while(contador <= 20) {
      metade = contador / 2;
      System.out.println("A metade de " + contador + " é " + metade);
      contador++;
    }
    entrada.close();
  }
}
