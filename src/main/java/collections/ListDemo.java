package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// INDEKSOWANE JAK TABLICE !!!

public class ListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println("Dodawanie pojedynczego elementu:");
        names.add("ADAM");
        names.addAll(Arrays.asList("ALA", "OLA", "ROBERT"));
        System.out.println(names);
        System.out.println("Metody interfejsu List");
        System.out.println("Pobieranie elementu o podanym indeksie:");
        System.out.println(names.get(2));
        System.out.println("Wstawianie elementu na podanej pozycji:");
        names.add(0, "BEATA");
        System.out.println(names);
        System.out.println("Usuwanie elementu z podanej pozycji:");
        names.remove(0);
        System.out.println(names);
        System.out.println("Wstawienie kolekcji elementów począwszy od indeksu:");
        names.addAll(2, Arrays.asList("EWA", "TOMEK"));
        System.out.println(names);
        System.out.println("Tworzenie podlisty:");  // MODYFIKUJE CAłą PODSTAWOWA LISTE
        List<String> subList = names.subList(2,4);  // wskazany jest ostatni indeks, pierwszy poza listą
        System.out.println(subList);
        subList.add("XXXX");
        System.out.println(names);
        System.out.println("Tworzenie kopii listy:");
        List <String> copyList = new ArrayList<>(subList);
        copyList.add("YYYY");
        System.out.println(copyList);
        System.out.println(subList);
    }
}
