package Switch;

import java.util.Scanner;

/*
Scrivi un programma che contenga un metodo che prende in ingresso un carattere e ne identifica il tipo per un operazione di algebra
(+ addizione - sottrazione * moltiplicazione / divisione).
Nel caso non riesca ad identificare il tipo di operazione dovrà restituire una stringa di errore.
 */
public class Switch_2 {
    public static void main(String[] args) {
        //Operatore di algera
        Scanner operatore = new Scanner(System.in);
        System.out.print("Scescgli un operatore: +  -  *  / ");
        char imput2 = operatore.next().charAt(0);


        switch(imput2){
            case '+':
                System.out.println("Addizioine");
                break;
            case '-':
                System.out.println("Sottrazione");
                break;
            case'*':
                System.out.println("Moltiplicazione");
                break;
            case '/':
                System.out.println("Divisione");
                break;
            default:
                System.out.println("Operatore non riconosciuto");
        }
    }
}
