/*atividade de numero 483*/
public class Atv11 {
    public static void main(String[] args) {
      int[] vetor1 = {1, 2, 3};
      int[] vetor2 = {4, 5, 6};
      int n = 3;
      
      int produtoInterno = calcularProdutoInterno(vetor1, vetor2, n);
      
      System.out.println("O produto interno dos dois vetores é: " + produtoInterno);
    }
    
    public static int calcularProdutoInterno(int[] vetor1, int[] vetor2, int n) {
      if (vetor1.length != n || vetor2.length != n) {
        throw new IllegalArgumentException("Os dois vetores devem ter tamanho " + n + ".");
      }
      
      int produtoInterno = 0;
      
      for (int i = 0; i < n; i++) {
        produtoInterno += vetor1[i] * vetor2[i];
      }
      
      return produtoInterno;
    }
  }
  