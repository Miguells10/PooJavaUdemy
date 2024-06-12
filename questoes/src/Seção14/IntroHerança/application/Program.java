package Seção14.IntroHerança.application;

import Seção14.IntroHerança.entities.Account;
import Seção14.IntroHerança.entities.BusinessAccount;
import Seção14.IntroHerança.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) throws Exception {

        Account acc = new Account(1001, "Alex", 1000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        acc.withdraw(200.0);
        System.out.println(acc.getBalance());

        // UPCASTING


        Account acc2 = new BusinessAccount(1003, "Bob", 1000.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);


        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }


        Account acc6 = new SavingsAccount(1005, "Alex", 1000.0, 0.01);
        acc6.withdraw(200.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new BusinessAccount(1006, "Maria", 1000.0, 500.0);
        acc7.withdraw(200.0);
        System.out.println(acc7.getBalance());


    }



}
