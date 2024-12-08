package Operatori_Aritmetici;
/*
Definisci un metodo per la divisione di 2 numeri interi che restituisca il risultato che dovrà essere stampato.
 */
public class Operatori_Aritmetici_2 {
    public static void main(String[] args) {

        System.out.println("Questa è la divisione "+ divisione(30,5));

    }
    public static int divisione(int a, int b){
        int divisione = a / b;
        return divisione;
    }
}
