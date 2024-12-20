package Java_Basic.If_Else_ElseIf_Statement;
//Scrivere un programma che dato un valore inserito dall'utente o dichiarato in una variabile,
//utilizzi un metodo che per i multipli di 3 stampi "Fizz" al posto del numero e per i multipli di 5 stampi "Buzz".
//Nel caso in cui un numero sia multiplo di entrambi stampi "FizzBuzz".
public class If_Else_ElseIf_Statement_1 {
    public static void main(String[] args) {

        //Multipli per 3, 5 e per entrambi
        int numero7 = 12;
        int numero8 = 10;
        int numero = 15;
        System.out.println(multipli(numero7, numero8, numero));
    }
    public static int multipli(int numero7, int numero8, int numero){
        if(numero7 % 3 == 0) {
            System.out.println("Fizz");
        }
        if(numero8 % 5 == 0){
            System.out.println("Buzz");
        }
        if(numero % 3 == 0 && numero % 5 == 0 ){
            System.out.println("FizzBuzz");
        }

        return 0;
    }
}

/*

// Correzioni della piattaforma

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
*/
