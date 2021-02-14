package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("ADAM");
        names.addAll(Arrays.asList("ALA", "OLA", "ROBERT"));
        for (String item : names) {  // iteracja po kolekcji
            System.out.println(item);
        }
        System.out.println(names);
        System.out.println("Usunięcie imienia ADAM");
        names.remove("ADAM");
        System.out.println(names);
        System.out.println("Usunięcie imienia OLA");
        String ola = new String ("OLA");        // usuwa na podstawie zawartości, a nie referencji !!! -->> to zostanie usunięte
        String ola1 = new String ("ola");       // usuwa na podstawie zawartości, a nie referencji !!! -->> to nie zostanie usunięte
        names.remove(ola);
        System.out.println(names);
        System.out.println("Czy w kolekcji jest ROBERT?");
        System.out.println(names.contains("ROBERT"));
        System.out.println("Sprawdzenie czy kolekcja jest pusta?");
        System.out.println(names.isEmpty());
        System.out.println("Rozmiar kolekcji:");
        System.out.println(names.size());
        System.out.println("Wyczyszczenie kolekcji:");
        names.clear();
    }
}
