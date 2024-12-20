package Java_Advanced.DateTime;

import java.time.OffsetDateTime;

/*
Crea un oggetto dato da questa stringa2023-03-01T13:00:00Z
Ottieni l'anno
Ottieni il mese
Ottieni il giorno
ottieni il giorno della settimana
Stampa i risultati sulla console
 */
public class Date3 {
    public static void main(String[] args) {
        OffsetDateTime dataString = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(dataString.getYear());
        System.out.println(dataString.getMonth());
        System.out.println(dataString.getDayOfMonth());
        System.out.println(dataString.getDayOfWeek());

        System.out.println();

        System.out.println(dataString);
    }
}
