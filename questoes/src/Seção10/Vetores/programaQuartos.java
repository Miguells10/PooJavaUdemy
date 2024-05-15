package Seção10.Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class programaQuartos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        registroQuartos[] quartos = new registroQuartos[10];

        System.out.print("How many rooms will be rented? \n");
        int quantityRooms = sc.nextInt();

        for (int i = 0; i < quantityRooms; i++) {
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            quartos[room] = new registroQuartos(name, email, room);
            
        }

     
        for (registroQuartos quarto : quartos) {
            if (quarto != null) {
                System.out.println(quarto);
            }
        }

        sc.close();





    }
}
