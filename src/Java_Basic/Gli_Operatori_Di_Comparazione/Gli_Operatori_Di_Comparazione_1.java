package Java_Basic.Gli_Operatori_Di_Comparazione;
/*
Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.
 */
public class Gli_Operatori_Di_Comparazione_1 {
    public static void main(String[] args) {
        int numero1 = 5;
        int numero2 = 5;
        System.out.println("I numeri da confrontare sono: " + numero1 + " e " + numero2);
        System.out.println(confrontoNumeri(numero1,numero2));
    }

    public static int confrontoNumeri(int num1, int num2){
        if(num1 == num2){
            System.out.println("I numeri "+ num1 + " e "+ num2+ " Sono uguali");
        }else{
            System.out.print("I numeri "+ num1 + " e "+ num2+ " Sono Diversi");
        }
        return 0;
    }
}
