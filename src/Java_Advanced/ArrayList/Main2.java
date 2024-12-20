package Java_Advanced.ArrayList;

import java.util.ArrayList;
import java.util.Collections;


/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un Java_Advanced.ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student2> students = new ArrayList<>();

        students.add(new Student2("Gabriele", 23));
        students.add(new Student2("Fabio", 20));
        students.add(new Student2("Aurora", 25));
        students.add(new Student2("Carla", 23));
        students.add(new Student2("Carolina", 21));
        students.add(new Student2("Antonino", 26));
        students.add(new Student2("Bob", 20));
        students.add(new Student2("Salvo", 23));
        students.add(new Student2("Mattia", 24));
        students.add(new Student2("Salvatore", 24));
        students.add(new Student2("Matteo", 23));
        students.add(new Student2("Gaspare", 22));

        for (Student2 persone : students) {
            System.out.println("Questi sono i studenti: " + persone);
        }

        System.out.println();

        // Ordinare la lista in base all'età
        Collections.sort(students);

        // Stampa dopo L'ordinamento
        System.out.println("\nStudenti dopo l'ordinamento:");
        for (Student2 student : students) {
            System.out.println(student);
        }
    }
}
