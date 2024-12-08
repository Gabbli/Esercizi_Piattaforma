package Le_Funzioni;
/*
Definire una funzione che accetta in ingresso una stringa e ne restituisce la lunghezza
 */
public class Funzioni_2 {
    public static void main(String[] args) {

      System.out.println("la parola è lunga: "+ lunghezza("ciao a tutti, come state?")+ " caratteri");

    }

    public static int lunghezza (String stringa_da_analizzare){
        return stringa_da_analizzare.length();

    }
}
