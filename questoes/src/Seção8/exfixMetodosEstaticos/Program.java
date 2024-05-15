package Seção8.exfixMetodosEstaticos;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dolar price: ");
        double priceDolar = sc.nextDouble();
        System.out.println("Dollars will bought? ");
        int quantidade = sc.nextInt();
        CurrencyConverter currencyConverter = new CurrencyConverter(priceDolar, quantidade);

        System.out.println("You will pay: R$ " + currencyConverter.converter() );

    }
}
