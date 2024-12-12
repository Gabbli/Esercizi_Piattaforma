package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


/*
Creare una classe Student che accetti nel costruttore il parametro name (String e age Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con 12 elementi e stamparlo in console.
Mettere in ordine la collezione e stampare il risultato
 */
public class Main2 {
    public static void main(String[] args) {

        ArrayList<Student2> nomi = new ArrayList<>();

        nomi.add(new Student2("Gabriele", 23));
        nomi.add(new Student2("Fabio", 20));
        nomi.add(new Student2("Aurora", 25));
        nomi.add(new Student2("Carla", 23));
        nomi.add(new Student2("Carolina", 21));
        nomi.add(new Student2("Antonino", 26));
        nomi.add(new Student2("Bob", 20));
        nomi.add(new Student2("Salvo", 23));
        nomi.add(new Student2("Mattia", 24));
        nomi.add(new Student2("Salvatore", 24));
        nomi.add(new Student2("Matteo", 23));
        nomi.add(new Student2("Gaspare", 22));

        for (Student2 persone : nomi) {
            System.out.println("Questi sono i studenti: " + persone);
        }

        System.out.println();

        //Collections.sort(nomi)

    }
}
