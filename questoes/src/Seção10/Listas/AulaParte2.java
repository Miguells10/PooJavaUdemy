package Seção10.Listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AulaParte2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();



        list.add("Miguel");
        list.add("Ana");
        list.add("Alex");
        list.add(1, "João");

        list.removeIf(x -> x.charAt(0) == 'J');

        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Index of Miguel: " + list.indexOf("Miguel"));

        List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').toList();
        System.out.println(result);

        String name = list.stream().filter(x-> x.charAt(0) == 'K').findFirst().orElse("Não existe");
        System.out.println(name);

    }
}
