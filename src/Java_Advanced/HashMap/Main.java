package Java_Advanced.HashMap;

import java.util.HashMap;
import java.util.Map;

/*
Creare 3 hashmap con 3 diversi metodi di inizializzazione e stampare il contenuto.
 */
public class Main {
    public static void main(String[] args) {

        HashMap<String, Integer> primo = new HashMap<>();
        primo.put("A", 1);
        primo.put("B", 2);

        System.out.println("Java_Advanced.ArrayList.HashMap normale: "+ primo);

        Map<String, Integer> secondo = Map.of(
                "C", 3 ,
                "D", 4
        );

        System.out.println("\nJava_Advanced.ArrayList.HashMap con Map.Of: "+ secondo);

        Map<String, Integer> terzo = Map.ofEntries(
                Map.entry("E", 5),
                Map.entry("F", 6)
        );

        System.out.println("\nJava_Advanced.ArrayList.HashMap con Map.OfEntries; "+ terzo);

    }
}
