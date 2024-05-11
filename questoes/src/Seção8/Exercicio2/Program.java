package Seção8.Exercicio2;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();


        System.out.println("Name: ");
        employee.name = sc.next();
        System.out.println("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax:");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f \n", employee.name, employee.netSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee.name + ", $" + String.format("%.2f", employee.netSalary()));


    }


}
