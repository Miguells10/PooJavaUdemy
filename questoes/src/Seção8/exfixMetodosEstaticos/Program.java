package Seção8.exfixMetodosEstaticos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dolar price: " + CurrencyConverter.priceDolar);
        System.out.println("Dollars will bought? ");
        CurrencyConverter.quantidade = sc.nextInt();

        System.out.println("You will pay: R$ " + CurrencyConverter.converter() );

    }
}
