/*atividade de numero 493*/
public class Atv15{
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {5, 4, 3, 2, 1};
        int[] vetor3 = {3, 2, 1, 5, 4};
        System.out.println(verificaOrdenacao(vetor1)); // Saída: "Crescente"
        System.out.println(verificaOrdenacao(vetor2)); // Saída: "Decrescente"
        System.out.println(verificaOrdenacao(vetor3)); // Saída: "Desordenado"
    }

    public static String verificaOrdenacao(int[] vetor) {
        boolean crescente = true;
        boolean decrescente = true;
        for(int i=1; i<vetor.length; i++) {
            if(vetor[i] < vetor[i-1]) {
                crescente = false;
            }
            if(vetor[i] > vetor[i-1]) {
                decrescente = false;
            }
        }
        if(crescente) {
            return "Crescente";
        } else if(decrescente) {
            return "Decrescente";
        } else {
            return "Desordenado";
        }
    }
}
