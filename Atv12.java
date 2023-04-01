/*atividade de numero 485*/
public class Atv12 {
    public static void main(String[] args) {
      int[] numeros = {3, 2, 4};
      char[] caracteres = {'A', 'B', 'C', 'D'};
      int tamanho = 3;
  
      imprimirVetor(caracteres, numeros, tamanho);
    }
  
    public static void imprimirVetor(char[] caracteres, int[] numeros, int tamanho) {
      if (caracteres.length != tamanho || numeros.length != tamanho) {
        throw new IllegalArgumentException("O tamanho dos vetores deve ser " + tamanho);
      }
  
      for (int i = 0; i < tamanho; i++) {
        for (int j = 0; j < numeros[i]; j++) {
          System.out.print(caracteres[i] + " ");
        }
        System.out.println();
      }
    }
  }
  