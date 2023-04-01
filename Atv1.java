/*atividade de numero 461 */
public class Atv1 {
    
        public static void main(String[] args) {
            double nota1 = 5;
            double nota2 = 6;
            double nota3 = 7;
            double media = calcularMedia(nota1, nota2, nota3);
            System.out.println("A média é: " + media);
        }
    
        public static double calcularMedia(double nota1, double nota2, double nota3) {
            double media = (nota1 + nota2 + nota3) / 3;
            return media;
        }
    }
    
