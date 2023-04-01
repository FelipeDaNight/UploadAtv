/*atividade de numero 470 */
import java.util.Scanner;

public class Atv6 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro positivo: ");
    int num = input.nextInt();
    
    if (isPrime(num)) {
      System.out.println(num + " é um número primo.");
    } else {
      System.out.println(num + " não é um número primo.");
    }
    
    input.close();
  }
  
  public static boolean isPrime(int num) {
    if (num <= 1) {
      return false;
    }
    
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    
    return true;
  }
}
