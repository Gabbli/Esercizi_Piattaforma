package Operatori_Aritmetici;
/*
Definisci un metodo che calcoli la media tra 3 numeri e restituisca il risultato che dovrà essere stampato.
 */
public class Operatori_Artmetici_3 {
    public static void main(String[] args) {

        System.out.println(calcolaMedia(30,30,40));

    }
    public static double calcolaMedia (double n1, double n2, double n3){
        double calcolaMedia = n1 + n2+ n3 /3.0;
        return calcolaMedia;
    }
}
