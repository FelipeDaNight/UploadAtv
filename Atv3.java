/*atividade de numero 464 */
import java.util.Scanner;
    public class Atv3 {

        public static void main(String[] args) {
            Scanner sr = new Scanner(System.in);
        System.out.println("digite qual grau voce quer converter ");
            double radianos = sr.nextDouble();
            double graus = converterRadianosParaGraus(radianos);
            System.out.println(radianos + " radianos equivale a " + graus + " graus.");
        }
    
        public static double converterRadianosParaGraus(double radianos) {
            double graus = (radianos * 180) / Math.PI;
            return graus;
        }
    }
    

