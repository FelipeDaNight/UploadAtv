/*atividade de numero 487*/
import java.util.Arrays;

public class Atv13 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5};
        int tamanho = 5;
        inverte(vetor, tamanho);
        System.out.println(Arrays.toString(vetor));
    }

    public static void inverte(int[] vetor, int tamanho) {
        for(int i=0; i<tamanho/2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[tamanho-1-i];
            vetor[tamanho-1-i] = temp;
        }
    }
}
