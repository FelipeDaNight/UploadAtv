/*atividade de numero 467 */
import java.util.Scanner;

public class Atv5 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite a base: ");
    double base = input.nextDouble();
    
    System.out.print("Digite o primeiro número: ");
    double num1 = input.nextDouble();
    System.out.print("Digite o segundo número: ");
    double num2 = input.nextDouble();
    System.out.print("Digite o terceiro número: ");
    double num3 = input.nextDouble();
    
    double log1 = Math.log(num1) / Math.log(base);
    double log2 = Math.log(num2) / Math.log(base);
    double log3 = Math.log(num3) / Math.log(base);
    
    System.out.println("O logaritmo de " + num1 + " na base " + base + " é " + log1);
    System.out.println("O logaritmo de " + num2 + " na base " + base + " é " + log2);
    System.out.println("O logaritmo de " + num3 + " na base " + base + " é " + log3);
    
    input.close();
  }
}
