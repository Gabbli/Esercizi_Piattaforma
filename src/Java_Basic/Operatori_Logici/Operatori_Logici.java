package Java_Basic.Operatori_Logici;
/*
Scrivi un programma che contiene un metodo che dati 2 interi in ingresso ed un valore di confronto confronta
se il numero di confronto è compreso tra due valori specifici
e stampi il risultato dell'operazione comprensivo dei due limiti (inferiore e superiore)
 */
public class Operatori_Logici {
    public static void main(String[] args) {

        int numero1 = 3;
        int numero2 = 9;
        int numeroCompreso = 5;
        System.out.println("i numeri da confrontare sono: " + numero1 + ", " + numero2 + " numero compreso " + numeroCompreso);
        System.out.println(numeriDaConfrontare(numero1, numero2, numeroCompreso));
    }
    public static int numeriDaConfrontare(int numero1, int numero2, int numeroCompreso){
        if((numero1 < numero2) && (numeroCompreso > numero1) && (numeroCompreso < numero2)){
            System.out.println("Il numero compreso "+ numeroCompreso+ " è compreso tra numero  "+ numero1+ " e numero  "+ numero2);
        }else{
            System.out.println("Il numero  "+ numeroCompreso+ " non è compreso tra "+ numero1+ " e  "+ numero2);
        }
        return 0;
    }
}
