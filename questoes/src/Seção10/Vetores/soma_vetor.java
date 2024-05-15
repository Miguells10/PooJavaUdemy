package Seção10.Vetores;

import java.util.Scanner;

public class soma_vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números você vai digitar? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: \n");
            vetor[i] = sc.nextInt();

        }

        double soma = 0.0;
        System.out.print("VALORES = ");
        for (int i = 0; i < n; i++) {
            System.out.print( vetor[i]+ " ");
            soma += vetor[i];
        }
        System.out.println();
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + (soma/vetor.length));

    }
}
