package Seção10.Vetores;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.


import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número inteiro (maximo 10)");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        if(n<=10){
            for (int i = 0; i < n; i++) {
                System.out.print("Digite um número inteiro: \n");
                vetor[i] = sc.nextInt();

            }

            System.out.println("Números negativos:");
            for (int i = 0; i < n; i++) {
                if (vetor[i]<0){
                System.out.print(vetor[i]+ "\n");
                }


            }


        }

    }
}
