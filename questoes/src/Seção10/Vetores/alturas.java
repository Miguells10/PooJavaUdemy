package Seção10.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        dadosAlturas[] vetor = new dadosAlturas[n];
        double sumAltura = 0.0;
        int acc = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da " + (i + 1) + "dadgawgafcasdcsa pessoa");
            System.out.println("Nome: ");
            String name = sc.next();
            System.out.println("Idade: ");
            int idade = sc.nextInt();
            System.out.println("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new dadosAlturas(name, idade, altura);

        }

        for (int i = 0; i < n; i++) {
            sumAltura += vetor[i].getAltura();

        }
        double avgAltura = sumAltura / vetor.length;
        System.out.println("Altura média: " + avgAltura);

        for (int i = 0; i < n; i++) {
            if (vetor[i].getIdade() < 16) {
                acc++;
            }
        }

        System.out.println("Pessoas com menos de 16 anos: " + (acc*100/n) + "%");
        for (int i = 0; i < n; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getName());
            }

        }
        sc.close();


    }
}
