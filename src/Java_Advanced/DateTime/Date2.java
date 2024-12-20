package Java_Advanced.DateTime;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
Formatta la data ottenuta il 01 marzo 2023
Stampa sulla console
 */
public class Date2 {
    public static void main(String[] args) {

        OffsetDateTime obj = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        ZonedDateTime zonedDateTime = obj.toZonedDateTime();

        String dataFormatt = zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        System.out.println("La data formattata: "+ dataFormatt);
    }
}
