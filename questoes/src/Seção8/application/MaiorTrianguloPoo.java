package Seção8.application;

import Seção8.entities.Triangle;

import java.util.Scanner;

public class MaiorTrianguloPoo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X");
        x.a = input.nextDouble();
        x.b= input.nextDouble();
        x.c = input.nextDouble();
        System.out.println("Enter the measures of triangle Y");
        y.a = input.nextDouble();
        y.b = input.nextDouble();
        y.c = input.nextDouble();

        input.close();

        double areaX = x.Area();
        double areaY = y.Area();


        System.out.println("Triangle X area: " + areaX);
        System.out.println("Triangle Y area: " + areaY);


        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else if (areaX == areaY) {
            System.out.println("The areas are equal");
        } else {
            System.out.println("Larger area: Y");
        }


    }


}


