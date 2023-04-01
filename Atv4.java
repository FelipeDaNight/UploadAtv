/*atividade de numero 465 */
public class Atv4 {

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        int numero3 = 15;
        imprimirMaiorNumero(numero1, numero2, numero3);
    }

    public static void imprimirMaiorNumero(int num1, int num2, int num3) {
        int maiorNumero = num1;
        if (num2 > maiorNumero) {
            maiorNumero = num2;
        }
        if (num3 > maiorNumero) {
            maiorNumero = num3;
        }
        System.out.println("O maior número é: " + maiorNumero);
    }
}
