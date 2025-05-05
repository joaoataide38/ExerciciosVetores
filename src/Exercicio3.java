import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor_10[] = new int[10];
        int temporaria = 0;
        int maior = -2147483648;
        int menor = 2147483647;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe um número: ");
            temporaria = scanner.nextInt();

            for (int j = 0; j < i; j++) {
                if (vetor_10[j] == temporaria) {
                    System.out.println("você digitou um valor duplicado informe outro: ");
                    temporaria = scanner.nextInt();
                    j = -1;
                }
            }

            vetor_10[i] = temporaria;
        }

        for (int k = 0; k < vetor_10.length; k++) {
            if (vetor_10[k] > maior) {
                maior = vetor_10[k];
            }
            if (vetor_10[k] < menor) {
                menor = vetor_10[k];
            }
        }

        for (int l = 0; l < vetor_10.length; l++) {
            System.out.println(vetor_10[l]);
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
