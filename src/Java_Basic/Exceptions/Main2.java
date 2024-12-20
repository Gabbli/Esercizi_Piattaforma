package Java_Basic.Exceptions;
/*
Scrivere una funzione che controlla se un carattere è un numero, altrimenti lanciare un'eccezione.
 */
public class Main2 {
    public static void main(String[] args) {

        try{
            verificNumber('a');
            System.out.println("Il carattere è un numero");
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }

    }

    public static void verificNumber(char n) throws IllegalArgumentException{
        if(n < '0' || n > '9'){
            throw new IllegalArgumentException("Il carattere non è un numero");
        }
    }
}
