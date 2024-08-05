package Seção18.InterfaceComparable;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\Miguel Lucas\\Desktop\\ppm\\POO UDEMY\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employteeCsv = br.readLine();
            while (employteeCsv != null) {
                String[] fields = employteeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employteeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee s : list) {
                System.out.println(s.getName() + ", " + s.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}