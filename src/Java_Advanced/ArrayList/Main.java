package Java_Advanced.ArrayList;

import java.util.ArrayList;
/*
Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un Java_Advanced.ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Student> studenti = new ArrayList<>();

        studenti.add(new Student("Gabriele", 23));
        studenti.add(new Student("Luca", 23));
        studenti.add(new Student("Giovanni", 23));
        studenti.add(new Student("Emanuel", 23));

        for (Student classe : studenti){
            System.out.println("La lista di studenti iniziale è: " + classe);
        }

        System.out.println();

        studenti.add(new Student("Marco", 24));
        studenti.add(new Student("Luigi", 22));
        studenti.add(new Student("Fabio", 23));
        studenti.add(new Student("Stefano", 25));

        for (Student classe : studenti){
            System.out.println("La classe aggiornata è: "+ classe);
        }

    }
}
