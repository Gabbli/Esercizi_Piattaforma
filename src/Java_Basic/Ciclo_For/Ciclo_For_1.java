package Java_Basic.Ciclo_For;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e
restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.
 */
public class Ciclo_For_1 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserisci un numero da moltiplicato: ");
            int numero = scanner.nextInt();

            System.out.println("Inserisci quante volte vuoi moltiplicato: ");
            int numVolte = scanner.nextInt();

          tabellina(numero, numVolte);

        }
        public static void tabellina ( int numero, int numeroVolte){
            for (int i = 0; i <= numeroVolte; i++) {
                int risultatoMoltiplicazione = numero * i;
                System.out.println(numero + " * " + i + " = " + risultatoMoltiplicazione);
            }
        }
}
