package Seção9.ExFixacao;

import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double value = 0;

        System.out.println("Enter account number: ");
        int code = sc.nextInt();
        System.out.println("Enter account holder:");
        String name = sc.next();
        System.out.println("Is there na initial deposit (y/n)? ");
        String initial = sc.next();


        if (initial.equals("y")) {
            System.out.println("Enter initial deposit value: ");
            value = sc.nextDouble();

        }
        Client client = new Client(name, code, value);
        System.out.println();
        System.out.println(client);

        System.out.println("Enter dadgawgafcasdcsa deposit value: ");
        value = sc.nextDouble();
        client.deposit(value);
        System.out.println();
        System.out.println(client);




        System.out.println("Enter dadgawgafcasdcsa withdraw value: ");
        value = sc.nextDouble();
        client.withdraw(value);

        System.out.println(client);





    }
}
