package collections;

import java.time.LocalDate;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> emailsStats = new HashMap<>();   // pierwszy - typ klucza, drugi - typ wartości
        int number = 10;
        System.out.println("Dodawanie do mapy:");
        emailsStats.put("adam@op.pl", number);
        emailsStats.put("ola@sda.pl", 567);
        emailsStats.put("karolek@karolkowo.edu.pl", 12456);
        emailsStats.put(null, 34);
        System.out.println("Niestety możemy dodać parę null");
        emailsStats.put(null, null);
        System.out.println(emailsStats);
        System.out.println("Pobranie wartości z mapy na podstawie klucza");
        // null check
        if (null != emailsStats.get("adam@op.pl")) {
            // automatyczne rozpakowanie z typu Integer do typu prostego int
            int result = emailsStats.get("adam@op.pl");
            System.out.println(result);
        } else {
            System.out.println("Brak takiego klucza!");
        }
        System.out.println("Zbiór kluczy:");
        System.out.println(emailsStats.keySet());
        System.out.println("Iterowanie po mapie przy pomocy Entry i entrySet ");
        for (Map.Entry<String, Integer> entry : emailsStats.entrySet()) {   // iterowanie dla HashMap !!!
            System.out.println("Klucz: " + entry.getKey() + " wartość:" + entry.getValue());
        }
        System.out.println("Czy istnieje klucz?");
        System.out.println(emailsStats.containsKey("ola@sda.pl"));
        System.out.println("CZy istnieje wartość 10?");
        System.out.println(emailsStats.containsKey(10));
        System.out.println("Tworzenie kopii:");
        Map<String, Integer> copy = new HashMap<>(emailsStats);
        System.out.println(copy);

        // *** TreeMap ***
        // w TreeMap nie może być kluczy null !!!
        emailsStats.remove(null);
        Map<String, Integer> copy1 = new TreeMap<>(emailsStats);
        System.out.println(copy1);
        // Mapa osób dostępnych pod kluczem imie
        Map<String, List<Person>> personsMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        // zanim dodamy konkretną osobę o imieniu, musimy utworzyć kolekcję pod tym imieniem (kluczem)
        personsMap.put("Marek", new ArrayList<>());
        // pobieramy kolekcję spod klucza
        List<Person> list = personsMap.get("MAREK");
        // dodajemy osobe do kolekcji pod kluczem
        list.add(new Person ("MAREK", LocalDate.now(), 169));
        personsMap.get("MAREK").add(new Person("MAREK", LocalDate.of(2000, 10, 10), 178));
        System.out.println(personsMap);
        //dodaj następne osoby o innym imieniu !!!
    }
}
