public class tabuadaDoCinco {
  public static void main(String[] args) {
    int contador = 1;
    int numeroCinco = 5;
    int resultado;

    while(contador <= 10) {
      resultado = contador * numeroCinco;
      System.out.println(numeroCinco +" x " + contador + " = " + resultado);
      contador++;
    }
  }
}
