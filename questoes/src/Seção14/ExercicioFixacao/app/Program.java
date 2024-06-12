package Seção14.ExercicioFixacao.app;

import Seção14.ExercicioFixacao.entities.ImportedProduct;
import Seção14.ExercicioFixacao.entities.Product;
import Seção14.ExercicioFixacao.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.println("Common, used or imported (c/u/i)?");
            char ch = sc.next().charAt(0);
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (ch == 'c'){
                Product product = new Product(name, price);
                list.add(product);
            } else if (ch == 'u') {
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            } else if (ch == 'i') {
                System.out.println("Customs fee: ");
                double customsFee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, customsFee);
                list.add(product);

            }

        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : list ){
            System.out.println(product.priceTag());
        }



    }
}
