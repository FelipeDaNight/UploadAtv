/*atividade de numero 481*/
import java.util.Scanner;

public class Atv10 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número decimal: ");
    int num = input.nextInt();
    
    System.out.print("Digite a base para conversão (entre 2 e 10): ");
    int base = input.nextInt();
    
    String result = decimalToBase(num, base);
    
    System.out.println(num + " na base " + base + " é " + result);
    
    input.close();
  }
  
  public static String decimalToBase(int num, int base) {
    if (base < 2 || base > 10) {
      throw new IllegalArgumentException("A base deve estar entre 2 e 10.");
    }
    
    StringBuilder sb = new StringBuilder();
    
    while (num > 0) {
      int remainder = num % base;
      sb.append(remainder);
      num /= base;
    }
    
    return sb.reverse().toString();
  }
}
