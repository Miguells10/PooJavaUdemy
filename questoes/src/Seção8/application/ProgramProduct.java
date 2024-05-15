package Seção8.application;

import Seção8.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Locale.setDefault(Locale.US);


            System.out.println("Enter product data");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();
            System.out.print("Quantity in stock: ");
            int quantity = sc.nextInt();
            System.out.println();

            Product product = new Product(name, price, quantity);

            product.setName("XBOX");
            System.out.println("Update name: " + product.getName());
            product.setPrice(1200);
            System.out.println("Update price: " + product.getPrice());

            System.out.print("Product data: " + product);

            System.out.println();

            System.out.println("Enter the number of products to be added in stock: ");
           quantity = sc.nextInt();
            product.addProducts(quantity);
            System.out.println();

            System.out.print("Product data: " + product);
            System.out.println();

            System.out.print("Enter the number of products to be removed from stock: ");
            quantity = sc.nextInt();
            product.removeProducts(quantity);
            System.out.println();

            System.out.print("Product data: " + product);

            product.setName("XBOX");
            System.out.println("Update name: " + product.getName());
            product.setPrice(1200);
            System.out.println("Update price: " + product.getPrice());

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
