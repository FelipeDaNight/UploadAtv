/*atividade de numero 473*/
import java.util.Scanner;

public class Atv8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite um caractere: ");
    char c = input.next().charAt(0);
    
    int result = isConsonant(c);
    
    if (result == 1) {
      System.out.println(c + " é uma consoante.");
    } else {
      System.out.println(c + " não é uma consoante.");
    }
    
    input.close();
  }
  
  public static int isConsonant(char c) {
    if (!Character.isLetter(c)) {
      return 0;
    }
    
    String vowels = "aeiouAEIOU";
    
    if (vowels.indexOf(c) == -1) {
      return 1;
    } else {
      return 0;
    }
  }
}
