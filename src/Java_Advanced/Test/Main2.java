package Java_Advanced.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta i dati ottenuti in FULL, MEDIUM e SHORT
Stampa le varie versioni -Crea dei test per questo esercizio
 */
public class Main2 {
    public static void main(String[] args) {


        // Creazione dell'oggetto OffsetDateTime
        String dateStr = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateStr);

        // Formattatori per FULL, MEDIUM e SHORT
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HH:mm 'UTC'", Locale.ITALIAN);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss", Locale.ITALIAN);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm", Locale.ITALIAN);

        // Formattazione dell'OffsetDateTime
        String fullFormat = offsetDateTime.format(fullFormatter);
        String mediumFormat = offsetDateTime.format(mediumFormatter);
        String shortFormat = offsetDateTime.format(shortFormatter);

        // Stampa dei risultati
        System.out.println("Formato FULL: "+fullFormat);
        System.out.println("Formato MEDIUM: "+mediumFormat);
        System.out.println("Formato SHORT: "+shortFormat);
    }
}
