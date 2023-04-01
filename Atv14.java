/*atividade de numero 490*/
import java.util.Arrays;

public class Atv14 {
    public static void main(String[] args) {
        char[] vetor = {'a', 'b', 'c', 'a', 'd', 'a'};
        int tamanho = 6;
        char caractere = 'a';
        int retirados = removeCaractere(vetor, tamanho, caractere);
        System.out.println(Arrays.toString(vetor));
        System.out.println("Total de caracteres retirados: " + retirados);
    }

    public static int removeCaractere(char[] vetor, int tamanho, char caractere) {
        int retirados = 0;
        for(int i=0; i<tamanho; i++) {
            if(vetor[i] == caractere) {
                vetor[i] = '*';
                retirados++;
            }
        }
        return retirados;
    }
}
