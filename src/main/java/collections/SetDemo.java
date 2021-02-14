package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {


        Set<String> names = new HashSet<>(Arrays.asList("ADAM", "OLA", "ALA"));
        names.add("TOMEK");
        names.add("EWA");
        for (String item : names) {
            System.out.println(item);
        }
        System.out.println("Czy do zbioru należy OLA");
        System.out.println(names.contains("OLA"));
        System.out.println("Czy w names są wszystkie elementy ze zbioru [OLA,EWA]");
        System.out.println(names.containsAll(Arrays.asList("OLA", "EWA")));
        System.out.println("Dodanie elementu ADAM");
        System.out.println(names.add("ADAM"));  // nie można dodać, bo ADAM już istnieje w zbiorze !!!
        System.out.println(names);

    }
}
