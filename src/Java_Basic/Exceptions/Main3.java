package Java_Basic.Exceptions;
/*
Scrivere una funzione che provvede a dividere un numero per 0 e catturi l'eccezione leggendone il messaggio.
 */
public class Main3 {
    public static void main(String[] args) {

        divisione(12);

    }
    public static void divisione(int numeroDaDividere){

         try{
             int risultato = numeroDaDividere / 0;
             System.out.println("Il risultato della divisione è: "+ risultato);
         } catch (ArithmeticException e) {
             throw new ArithmeticException("Errore"+ e.getMessage());
         }

    }
}
