package Seção10.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<FixBase> list = new ArrayList<>();

        System.out.println("How many employeers? ");
        int employeers = sc.nextInt();

        for (int i = 0; i < employeers; i++) {
            System.out.println("Employeer #" + (i +1));
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Salary: ");
            double salary = sc.nextDouble();

            FixBase fb = new FixBase(id, name, salary);
            list.add(fb);
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int idBusca = sc.nextInt();
        FixBase busca = list.stream().filter(x -> x.getId() == idBusca).findFirst().orElse(null);

        if(busca != null) {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            busca.setSalary(busca.getSalary() + (busca.getSalary() * percentage / 100));
        } else {
            System.out.println("This id does not exist!");
            System.out.println();
        }

        for(FixBase fb : list) {
            System.out.println("List of employees: ");
            System.out.println(fb.getId() + ", " + fb.getName() + ", " + fb.getSalary());
        }

        sc.close();



    }
}
