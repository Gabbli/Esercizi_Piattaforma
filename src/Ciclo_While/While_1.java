package Ciclo_While;
/*
Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore e calcoli
la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)
 */
public class While_1 {
    public static void main(String[] args) {

        int numero = 7;
        int n = 0;
        int somma = 0;

        while (n < 7) {
            somma+= n;
            System.out.println("Numero attuale: " + n + " Somma attuale: " + somma);
            n++;
        }

        System.out.println("La somma è: " + somma);

    }
}
