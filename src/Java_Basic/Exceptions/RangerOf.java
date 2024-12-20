package Java_Basic.Exceptions;
/*
Scrivere una funzione che controlli se un numero int è in un determinato range.
Se lo è ritorna true ; se non lo è, lancia un'eccezione.
 */
public class RangerOf {

    //Metodo che controlla che il numero sia nel range
    public static boolean isRange(int num, int min, int max) throws OutOfRangeException {
        if ((num >= min) && (num <= max)) {
            return true;
        }else{
            throw new OutOfRangeException("Il numero non è compreso nel range tra "+ min +" e "+  max);
        }
    }
}