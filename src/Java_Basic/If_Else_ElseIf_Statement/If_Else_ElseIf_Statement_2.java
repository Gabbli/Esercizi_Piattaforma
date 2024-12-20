package Java_Basic.If_Else_ElseIf_Statement;

import java.util.Scanner;

public class If_Else_ElseIf_Statement_2 {
    public static void main(String[] args) {

        //Scrivi un programma che calcoli la lunghezza di una stringa,
        //sulla base di questa lunghezza stampi "Lunghezza maggiore di 10", "Lunghezza minore di 10" o "Lunghezza pari a 10".
        Scanner scanner = new Scanner(System.in);

        // Chiedi all'utente di inserire una stringa
        System.out.print("Inserisci una parola: ");
        String input = scanner.nextLine();

        // Calcola la lunghezza della stringa
        int lunghezza = input.length();

        if(lunghezza > 10){
            System.out.println("Lunghezza maggiore di 10");
        } else if (lunghezza < 10) {
            System.out.println("lunghezza minore di 10");
        }else{
            System.out.println("Lunghezza pari a 10");
        }
        scanner.close();
    }

}

