package Seção18.ExFix.app;

import Seção18.ExFix.model.entities.Contract;
import Seção18.ExFix.model.entities.ContractService;
import Seção18.ExFix.model.entities.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import javax.swing.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        JOptionPane.showMessageDialog(null, "Enter contract data");
        int number = Integer.parseInt(JOptionPane.showInputDialog("Number: "));
        LocalDate date = LocalDate.parse(JOptionPane.showInputDialog("Date (dd/MM/yyyy): "), dtf);
        double totalValue = Double.parseDouble(JOptionPane.showInputDialog("Contract value: "));

        Contract obj = new Contract(number, date, totalValue);
        
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter number of installments: "));

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(obj, n);

        JOptionPane.showMessageDialog(null, "Installments:");
        for (int i = 0; i < obj.getInstallments().size(); i++) {
            JOptionPane.showMessageDialog(null, obj.getInstallments().get(i));
        }


    }
}
