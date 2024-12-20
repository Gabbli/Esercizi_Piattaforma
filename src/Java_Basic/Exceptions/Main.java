package Java_Basic.Exceptions;

import static Java_Basic.Exceptions.RangerOf.isRange;
/*
Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo è ritorna true ; se non lo è, lancia un'eccezione.
 */
public class Main {
    public static void main(String[] args) {
        int num = 25;
        int min = 0;
        int max = 50;

        //Metodo che indica se il numero è nel range oppure no
        try{
            boolean risultato = isRange(num, min, max);
            System.out.println("IL numero "+ num + " è nel range tra "+ min+ " e " + max);
            
        } catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }
    }

}

