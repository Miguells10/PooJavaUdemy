package Seção8.exfixMetodosEstaticos;

public class CurrencyConverter {
    public static final double priceDolar = 3.10;
    public static int quantidade;

    public static double converter(){
        double taxa = priceDolar * quantidade * 6 / 100;
        return priceDolar * quantidade + taxa;
    }
}
