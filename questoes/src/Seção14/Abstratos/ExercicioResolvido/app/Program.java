package Seção14.Abstratos.ExercicioResolvido.app;

import Seção14.Abstratos.ExercicioResolvido.entities.Color;
import Seção14.Abstratos.ExercicioResolvido.entities.Rectangle;
import Seção14.Abstratos.ExercicioResolvido.entities.Circle;
import Seção14.Abstratos.ExercicioResolvido.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();


        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            sc.nextLine();
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                Rectangle rect = new Rectangle(color, width, height);
                list.add(rect);
                System.out.println("SHAPE #" + i + " AREA: " + String.format("%.2f", rect.area()));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                Circle circle = new Circle(color, radius);
                list.add(circle);
                System.out.println("SHAPE #" + i + " AREA: " + String.format("%.2f", circle.area()));
            }
        }




        sc.close();
    }
}
