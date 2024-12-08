package Gli_Oggetti_Il_Costruttore_Getter_e_Setter;
/*
Scrivere un programma che contenga una classe che definisce uno Studente che abbia come proprietà nome, cognome ed identificativo.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Studente.
 */
public class Gli_Oggetti_Il_Costruttore_Getter_e_Setter_1 {
    public static void main(String[] args) {

        // Dichiarazione dell'oggetto studente
        Studente_1 studente = new Studente_1("Gabriele", "Gaita", 23);

        // Stampa dei dettagli dell'oggetto
        System.out.println(studente.getNome());
        System.out.println(studente.getCognome());
        System.out.println(studente.getIdentificativo());
    }
}
