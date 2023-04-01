/*atividade de numero 494*/
public class Atv16 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 7, 1, 3, 8, 6, 4};
        bubbleSort(vetor);
        for(int i=0; i<vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void bubbleSort(int[] vetor) {
        for(int i=0; i<vetor.length-1; i++) {
            for(int j=0; j<vetor.length-i-1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    troca(vetor, j, j+1);
                }
            }
        }
    }

    public static void troca(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
