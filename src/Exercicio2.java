//2) Crie um programa que leia 9 valores inteiros pares e, em seguida, mostre na tela os valores lidos na ordem inversa.
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor_9[] = new int[9];
        int temporaria = 0;

        for (int i = 0; i < 9; i++) {
            System.out.println("Informe um número par: ");
            temporaria = scanner.nextInt();
            if (temporaria % 2 == 0) {
                vetor_9[i] = temporaria;
            } else {
                while (temporaria % 2 != 0) {
                    System.out.println("Erro! o numero informado é impar. informe um número par: ");
                    temporaria = scanner.nextInt();
                }
                vetor_9[i] = temporaria;
            }
        }
        for (int j = 8; j > 0; j--){
            System.out.println( vetor_9[j]);
        }
    }
}
