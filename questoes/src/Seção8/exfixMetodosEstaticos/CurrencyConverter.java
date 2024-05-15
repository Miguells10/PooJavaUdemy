package Seção8.exfixMetodosEstaticos;

public class CurrencyConverter {
    public double priceDolar;
    public int quantidade;

    public CurrencyConverter(double priceDolar, int quantidade){
        this.priceDolar = priceDolar;
        this.quantidade = quantidade;
    }

    public double converter(){
        double taxa = priceDolar * quantidade * 6 / 100;
        return priceDolar * quantidade + taxa;
    }
}
