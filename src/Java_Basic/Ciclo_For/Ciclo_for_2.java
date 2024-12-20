package Java_Basic.Ciclo_For;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un numero
e il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali in ordine inverso
(quindi se passo il punto di partenza a 6 e gli dico di restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).
 */
public class Ciclo_for_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dimmi un numero: ");
        int numero = scan.nextInt();

        System.out.println("Dimmi il numero massimo che vuoi avere: ");
        int numeroMassimo = scan.nextInt();

        numeriInversi(numero, numeroMassimo);

    }
    public static void numeriInversi (int numero, int numeroMassimo){
        for(int i = 0 ; i < numeroMassimo ; ++i){
            int numeroInverso = numero - i;
            System.out.println(numero + i + " inversione " + numeroInverso );
        }
    }
}
