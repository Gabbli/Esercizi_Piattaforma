package Java_Basic.Gli_Array;
/*
Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.
 */
public class Gli_Array_1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int somma = 0;

        for(int i = 0 ; i < arr.length ; i++){
            somma += arr[i];
        }
        System.out.println("La somma totale dell'Array sono: "+ somma);
    }
}
