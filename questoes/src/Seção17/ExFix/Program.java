package Seção17.ExFix;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String sourceFile = sc.nextLine();


        File sourceFileStr = new File(sourceFile);
        String sourceFolderStr = sourceFileStr.getParent();

        boolean sucess = new File(sourceFile + "\\out").mkdir();

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){

            String itemCsv = br.readLine();
            while (itemCsv != null){

                String[] fields = itemCsv.split(",");
                String name = fields [0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields [2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();
            }

            try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
                for (Product item : list){
                    bw.write(item.getName() + "," +  String.format("%.2f", item.total()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " Created");
            } catch (IOException e){
                System.out.println(e.getMessage());
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

sc.close();

    }
}
