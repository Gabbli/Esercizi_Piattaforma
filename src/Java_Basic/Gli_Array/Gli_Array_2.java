package Java_Basic.Gli_Array;
/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con dei caratteri.
Questo metodo dovrà poi stampare tutte le occorrenze del carattere a o 0 in caso non ce ne siano.
 */
public class Gli_Array_2 {
    public static void main(String[] args) {

        caratteri();

    }

    public static char[] caratteri(){
        char[] caratteri = {'a', 'b', 'c', 'd', 'e', 'f', 'a', 'b'};
        int conteggio = 0;
        for(int i = 0; i < caratteri.length ; i++){
            if(caratteri[i] == 'a'){
                conteggio++;

            }
        }
        System.out.println("nell'Array ci sono "+ conteggio + " 'a'");
        return caratteri;
    }
}
