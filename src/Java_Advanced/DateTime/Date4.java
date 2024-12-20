package Java_Advanced.DateTime;

import java.time.OffsetDateTime;

/*
Crea un oggetto dato da questa stringa2023-03-01T13:00:00Z
aggiungi un anno
sottraggo un mese
aggiungi 7 giorni
Stampa il risultato localizzato per l'Italia
 */
public class Date4 {
    public static void main(String[] args) {

        OffsetDateTime dataString = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        dataString = dataString.plusYears(1);
        dataString = dataString.minusMonths(1);
        dataString = dataString.plusDays(7);


    }
}
