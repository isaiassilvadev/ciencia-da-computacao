public class maiorDeTres {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1º número");
        int numero1 = entrada.nextInt();
        System.out.println("Digite o 2º número");
        int numero2 = entrada.nextInt();
        System.out.println("Digite o 3º número");
        int numero3 = entrada.nextInt();

        if (numero1 == numero2 && numero1 == numero3 && numero2 == numero3) {
            System.out.println("OS números são iguais");
        } else if (numero1 > numero2 && numero1 > numero3) {
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println(numero2);
        } else if (numero3 > numero2 && numero3 > numero2) {
            System.out.println(numero3); 
        }

        entrada.close();
    }
    
}
