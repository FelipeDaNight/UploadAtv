/*atividade de numero 462 */
import java.util.Scanner;


public class Atv2 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("digite qual grau voce quer converter ");
        double graus = sr.nextDouble();
        double radianos = converterGrausParaRadianos(graus);
        System.out.println(graus + " graus equivale a " + radianos + " radianos.");
    }

    public static double converterGrausParaRadianos(double graus) {
        double radianos = (graus * Math.PI) / 180;
        return radianos;
    }
}
