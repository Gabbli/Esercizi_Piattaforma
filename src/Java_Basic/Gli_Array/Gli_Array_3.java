package Java_Basic.Gli_Array;
/*
Scrivere un programma che contenga un metodo che permetta di sostituire gli elementi duplicati in un array di interi con il valore -1.
L'array ottenuto dovrà essere stampato a video.
 */
public class Gli_Array_3 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 17, 6, 12, 17, 21, 23, 16, 6, 12};

        // Stampa l'Array prima della sostituzione
        System.out.print("Array iniziale: \n");
        stampaDellArray(arr);

        // richiama della sostituzione
        sostituzioneDeiDuplicati(arr);

        System.out.println();

        // Stampa l'array modificato
        System.out.println("Array modificato:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    // Metodo per sostituire i duplicati con -1
    public static void sostituzioneDeiDuplicati(int[] arr) {
        // Primo ciclo: scorre l'Array
        for (int i = 0; i < arr.length; i++) {

            // Secondo ciclo: Scorre l'Array dall'elemento successivo
            for (int j = i + 1; j < arr.length; j++) {

                // Se l'elemento del primo ciclo è uguale al secondo lo sostituisce con -1
                if (arr[i] == arr[j]) {
                    arr[j] = -1;

                }
            }
        }
    }
    // Metodo per stampare l'Array per intero
    public static void stampaDellArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

