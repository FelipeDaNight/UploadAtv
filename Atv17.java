/*atividade de numero 495*/
public class Atv17 {
    public static void main(String[] args) {
        char[] vetor = {'f', 'c', 'a', 'd', 'b', 'e'};
        ordenarVetorCaracteres(vetor);
        for(int i=0; i<vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void ordenarVetorCaracteres(char[] vetor) {
        for(int i=0; i<vetor.length-1; i++) {
            for(int j=0; j<vetor.length-i-1; j++) {
                if(vetor[j] > vetor[j+1]) {
                    troca(vetor, j, j+1);
                }
            }
        }
    }

    public static void troca(char[] vetor, int i, int j) {
        char temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }
}
