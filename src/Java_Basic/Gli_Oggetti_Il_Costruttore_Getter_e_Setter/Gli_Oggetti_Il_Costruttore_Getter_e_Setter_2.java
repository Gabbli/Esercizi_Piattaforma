package Java_Basic.Gli_Oggetti_Il_Costruttore_Getter_e_Setter;
/*
Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata, targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
 */
public class Gli_Oggetti_Il_Costruttore_Getter_e_Setter_2 {
    public static void main(String[] args) {
        // Dichiarazione dell'oggetto Auto
        Auto_2 auto = new Auto_2(1.499, "FG 345HJ", "BMW", "Serie 1");
        // stampa dei vari dettagli dell'auto
        System.out.println("La cilindrata è di: "+ auto.getCilindrata());
        System.out.println("La targa è: "+ auto.getTarga());
        System.out.println("La marca è: "+ auto.getMarca());
        System.out.println("Il modello è: "+ auto.getModello());
    }
}
