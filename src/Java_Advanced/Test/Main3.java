package Java_Advanced.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenuta il 01 marzo 2023
Stampa sulla console
Fai attenzione a usare almeno Java 8
Crea dei test per questo esercizio
 */
public class Main3 {
    public static void main(String[] args) {
        String dateStr = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateStr);

        // Creazione dei formattatori
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ITALIAN);

        // Formattazione dell'OffsetDateTime
        String mediumFormat = offsetDateTime.format(mediumFormatter);

        System.out.println("Mediun :"+ mediumFormat);

    }
}

