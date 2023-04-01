/*atividade de numero 499*/
import java.util.Scanner;

public class Atv19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int[] vetor = new int[5];

        do {
            System.out.println("\n*** MENU ***");
            System.out.println("1 - Preencher vetor");
            System.out.println("2 - Exibir vetor");
            System.out.println("3 - Ordenar vetor");
            System.out.println("4 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    preencherVetor(vetor);
                    break;
                case 2:
                    exibirVetor(vetor);
                    break;
                case 3:
                    ordenarVetor(vetor);
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 4);
    }

    public static void preencherVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n*** PREENCHER VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor para a posição " + i + ": ");
            vetor[i] = scanner.nextInt();
        }
    }

    public static void exibirVetor(int[] vetor) {
        System.out.println("\n*** EXIBIR VETOR ***");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Posição " + i + ": " + vetor[i]);
        }
    }

    public static void ordenarVetor(int[] vetor) {
        System.out.println("\n*** ORDENAR VETOR ***");
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[i]) {
                    int aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }
        System.out.println("Vetor ordenado!");
    }
}
