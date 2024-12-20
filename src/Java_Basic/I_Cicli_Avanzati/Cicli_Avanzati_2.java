package Java_Basic.I_Cicli_Avanzati;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e stampa tutti i numeri fino al valore immesso,
la stampa dovrà saltare il valore uguale a 5.
 */
public class Cicli_Avanzati_2 {
    public static void main(String[] args) {
        valoreImmesso();
    }

    public static void valoreImmesso () {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci un numero a piacere tra 0 e 5 : ");
        int num = scan.nextInt();

        for (int i = 0; i <= num; i++) {
            if (i == 5) {
                System.out.println("Saltato il numero 5");
                continue;
            }
            System.out.println(i);
        }

        scan.close();

    }
}
