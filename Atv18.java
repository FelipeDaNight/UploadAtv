/*atividade de numero 497*/
public class Atv18 {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int chave = 7;
        int posicao = buscaBinaria(vetor, vetor.length, chave);
        System.out.println("Posição da chave " + chave + " no vetor: " + posicao);
    }

    public static int buscaBinaria(int[] vetor, int tamanho, int chave) {
        int inicio = 0;
        int fim = tamanho - 1;

        while(inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if(vetor[meio] == chave) {
                return meio;
            }

            if(vetor[meio] < chave) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1;
    }
}
