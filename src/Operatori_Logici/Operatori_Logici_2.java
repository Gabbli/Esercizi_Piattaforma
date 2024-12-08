package Operatori_Logici;

public class Operatori_Logici_2 {
    public static void main(String[] args) {

        //numero pari
        int numeroPari = 10;
        System.out.println("il numero " + numeroPari + " è un numero Pari?");
        System.out.println(numeriPari(numeroPari));

        //Numero Dispari
        int numeroDispari = 9;
        System.out.println("il numero " + numeroDispari + " è un numero Dispari?");
        System.out.println(numeroDispari(numeroDispari));
    }

    public static int numeriPari(int pari){

        if(pari % 2 == 0){
            System.out.println("Il numero "+ pari+ " è un numero pari");
        }else{
            System.out.println("Il numero "+ pari+ " non è un numero pari");
        }
        return pari;
    }
    public static int numeroDispari(int dispari){

        if(dispari % 2 == 0){
            System.out.println("Il numero "+ dispari+ " è un numero dispari");
        }else{
            System.out.println("Il numero "+ dispari+ " non è un numero dispari");
        }
        return dispari;
    }
}
/*
  // Correzione della piattaforma

   public static void main(String[] args) {

                int numeroPari = 10;
                 System.out.println("Il numero " + numeroPari + " è un numero pari? " + isNumeroPari(numeroPari));

                 int numeroDispari = 9;
                 System.out.println("Il numero " + numeroDispari + " è un numero dispari? " + isNumeroDispari(numeroDispari));
    }

      public class VerificaNumero {

      public static boolean isNumeroPari(int numero) {
              return numero % 2 == 0;
      }

       public static boolean isNumeroDispari(int numero) {
               return numero % 2 != 0;
       }

       public static void main(String[] args) {
                int numeroPari = 10;
                 System.out.println("Il numero " + numeroPari + " è un numero pari? " + isNumeroPari(numeroPari));

                 int numeroDispari = 9;
                 System.out.println("Il numero " + numeroDispari + " è un numero dispari? " + isNumeroDispari(numeroDispari));
    }
}

 */
