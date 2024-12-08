package Gli_Operatori_Di_Assegnazione;
/*
Scrivi un programma che contiene un metodo che date due variabili le incrementi di un valore scelto da te e le moltiplichi fra di loro.
Il metodo dovrà restituire il risultato dell'operazione che dovrà essere stampato a video.
 */
public class Gli_Operatori_Di_Assegnazione_1 {
    public static void main(String[] args) {

        System.out.println(assegnazione(10,3));

    }
    public static double assegnazione(double a, double b){
        a = a + 5;
        b = b + 10;
        return a * b;
    }
}
