package Java_Basic.Il_Casting;
/*
Scrivere uno snippet di codice che dati 2 numeri con
la virgola (double) li sommi e li stampi senza virgola (int).
*/
public class Casting1 {
    public static void main(String[] args) {

        double primoNumero = 7.3;
        double secondoNumero = 4.5;
        int risultatoInInt = (int) (primoNumero + secondoNumero);

        System.out.println("Questo è il risultato in castato in int: "+ risultatoInInt);
    }
}
