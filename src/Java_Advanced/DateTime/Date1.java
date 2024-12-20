package Java_Advanced.DateTime;
/*
Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
Formatta i dati ottenuti in FULL, MEDIUM e SHORT
Stampa le varie versioni
 */

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Date1 {
    public static void main(String[] args) {

        OffsetDateTime obj = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        ZonedDateTime zonedDateTime = obj.toZonedDateTime();

        String dateString = zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dateString2 = zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        String dateString3 = zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

        System.out.println("Stile FULL: "+ dateString);
        System.out.println("Stile MEDIUM: "+ dateString2);
        System.out.println("Stile SHORT: "+ dateString3);

    }
}
