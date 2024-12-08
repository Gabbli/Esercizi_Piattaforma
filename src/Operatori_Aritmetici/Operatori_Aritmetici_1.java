package Operatori_Aritmetici;
/*
Definisci un metodo che restituisce il resto della divisione di due numeri interi e stampalo a schermo.
 */
public class Operatori_Aritmetici_1 {
    public static void main(String[] args) {

        System.out.println("Questo è il resto "+ resto(300, 19));

    }
    public static double resto (double a, double b){

        double rest = a % b;
        return rest;
    }
}
