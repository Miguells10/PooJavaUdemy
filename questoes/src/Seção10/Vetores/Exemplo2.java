package Seção10.Vetores;

import Seção8.entities.Product;

import java.util.Arrays;
import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        exProduct[] vect = new exProduct[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new exProduct(name, price);

        }

        double sum = 0.0;

        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum /n;

        System.out.println("AVERAGE PRICE = " + avg);
        System.out.println(Arrays.toString(vect));


        sc.close();
    }
}
