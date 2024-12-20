package Java_Basic.Gli_Operatori_Di_Comparazione;
/*
Scrivi un programma che contiene un metodo che che confronti due caratteri e determini se sono diversi.
Il programma dovrà stampare a video i due caratteri e il risultato dell'eguaglianza.
 */
public class Gli_Operatori_Di_Comparazione_2 {
    public static void main(String[] args) {
        char carattere1 = 'A';
        char carattere2 = 'A';
        System.out.println("I caratteri da confrontare sono: " + carattere1 + " e " + carattere2);
        System.out.println(confrontoNumeri(carattere1,carattere2));
    }

    public static char confrontoNumeri(char carattere1, char carattere2){
        if(carattere1 == carattere2){
            System.out.println("I caratteri "+ carattere1 + " e "+ carattere2+ " Sono uguali");
        }else{
            System.out.print("I caratteri "+ carattere1 + " e "+ carattere2+ " Sono Diversi");
        }
        return 0;
    }
}
