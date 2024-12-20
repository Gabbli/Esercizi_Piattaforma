package Java_Basic.Switch;

import java.util.Scanner;
/*
Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico e restituisca il nome del giorno della settimana
 come stringa o una stringa di errore nel caso di valore maggiore di 7 o minore di 1.
 */
public class Switch_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Scrivi un numero da 1 a 7: ");
        int imput = scanner.nextInt();

        switch (imput){
            case 1:
                System.out.println("Lunedi");
                break;
            case 2:
                System.out.println("Martedi");
                break;
            case 3:
                System.out.println("Mercoledi");
                break;
            case 4:
                System.out.println("Giovedi");
                break;
            case 5:
                System.out.println("Venerdi");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Erorre");
        }
    }
}
