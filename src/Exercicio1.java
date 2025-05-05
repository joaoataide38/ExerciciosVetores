//1) Crie um programa que leia 6  inteiros e, em seguida, mostre na tela os valores lidos.
import java.util.Scanner;

 public class Exercicio1    {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor_6[] = new int[6];

        for (int i = 0; i < 6; i++){
            System.out.println("Informe um número: ");
            vetor_6[i] = scanner.nextInt();
        }
        for (int j = 0; j < 6; j++){
            System.out.println(vetor_6[j]);
        }
    }
}