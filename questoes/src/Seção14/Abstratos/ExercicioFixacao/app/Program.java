package Seção14.Abstratos.ExercicioFixacao.app;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Seção14.Abstratos.ExercicioFixacao.entities.Contribuinte;
import Seção14.Abstratos.ExercicioFixacao.entities.PessoaFisica;
import Seção14.Abstratos.ExercicioFixacao.entities.PessoaJuridica;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Contribuinte> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double rendaAnual = sc.nextDouble();
            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double gastosSaude = sc.nextDouble();
                list.add(new PessoaFisica(name, rendaAnual, gastosSaude));
            } else {
                System.out.print("Number of employees: ");
                int numeroFuncionarios = sc.nextInt();
                list.add(new PessoaJuridica(name, rendaAnual, numeroFuncionarios));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for (Contribuinte contribuinte : list) {
            double tax = contribuinte.taxesPay();
            System.out.println(contribuinte.getNome() + ": $ " + String.format("%.2f", tax));
            sum += tax;
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));


    }
}
