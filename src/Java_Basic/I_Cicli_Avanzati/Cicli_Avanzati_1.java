package Java_Basic.I_Cicli_Avanzati;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
la stampa dovrà interrompersi se il valore è uguale a 5.
 */
public class Cicli_Avanzati_1 {
    public static void main(String[] args) {

        valoreImmesso();

    }

    public static void valoreImmesso () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero a piacere tra 0 e 5 : ");
        int valore = scan.nextInt();

        for (int i = 0; i <= valore; i++) {
            System.out.println("Questo è il valore: " + i);
            if (i == 5) {
                System.out.println("il valore è uguale a 5");
                break;
            }
        }
        scan.close();

    }
}
