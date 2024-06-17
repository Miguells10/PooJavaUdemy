package Seção15.ExercicioFixação.application;


import Seção15.Exceptions1.model.exceptions.DomainException;
import Seção15.ExercicioFixação.model.entities.Account;
import Seção15.ExercicioFixação.model.exceptions.ExceptionDomain;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {


            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance: " + account.getBalance());


        } catch (ExceptionDomain e) {
            System.out.println("Error in withdraw: " + e.getMessage());
        }

    }
}
