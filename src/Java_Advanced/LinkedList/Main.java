package Java_Advanced.LinkedList;

import java.util.LinkedList;
/*
Creare una classe Fruit che accenti nel costruttore il parametro name (String)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare una Java_Advanced.ArrayList.LinkedList con elementi e stamparlo in console.
Aggiungere un elemento al primo posto della lista e uno all'ultimo
Stampare la collezione aggiornata
 */
public class Main {
    public static void main(String[] args) {

        LinkedList<String> frutta = new LinkedList<>();

        frutta.add("Pesche");
        frutta.add("Mele");
        frutta.add("Pere");

        for(String frutti : frutta){
            System.out.println("Questa è la frutta iniziale: "+ frutti);
        }

        System.out.println();

        frutta.addFirst("Ciliegie");
        frutta.addLast("Banane");

        for(String fruits : frutta){
            System.out.println("Lista dei frutti aggiornata: "+ fruits);
        }
    }
}
