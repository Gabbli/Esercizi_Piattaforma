package Java_Advanced.HashMap;

import java.util.*;
/*
Creare un hashmap, prendere tutti i valori, ordinarli e stamparli
 */
public class Main2 {
    public static void main(String[] args) {

        HashMap<String, Integer> sort = new HashMap<>();
        sort.put("A", 12);
        sort.put("B", 342);
        sort.put("C", 54);
        sort.put("D", 7);

        System.out.println("Java_Advanced.ArrayList.HashMap senza modifiche: "+ sort);

        Collection<Integer> values = sort.values();

        List<Integer> risultato =  new ArrayList<Integer>(values);

        Collections.sort(risultato);

        System.out.println("\nIl risultato finale è: "+ risultato);
    }
}
