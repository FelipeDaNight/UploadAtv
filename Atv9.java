/*atividade de numero 480*/

import java.util.Scanner;

public class Atv9 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um número inteiro: ");
    int num = input.nextInt();
    
    if (isCapicua(num)) {
      System.out.println(num + " é um número capicua.");
    } else {
      System.out.println(num + " não é um número capicua.");
    }
    
    input.close();
  }
  
  public static boolean isCapicua(int num) {
    String str = Integer.toString(num);
    
    int len = str.length();
    
    for (int i = 0; i < len / 2; i++) {
      if (str.charAt(i) != str.charAt(len - i - 1)) {
        return false;
      }
    }
    
    return true;
  }
}
