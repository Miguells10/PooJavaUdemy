package Seção17.ExFix;

public class Product {
    private String name;
    private Double price;
    private int quantity;

    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public double total(){
        return price * quantity;
    }

}
