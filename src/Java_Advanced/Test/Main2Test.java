package Java_Advanced.Test;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Main2Test {

    @Test
    void main() {
        // Creazione dell'oggetto OffsetDateTime
        String dateStr = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateStr);

        // Creazione dei formattatori
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HH:mm 'UTC'", Locale.ITALIAN);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("d MMM yyyy HH:mm:ss", Locale.ITALIAN);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm", Locale.ITALIAN);

        // Formattazione dell'OffsetDateTime
        String fullFormat = offsetDateTime.format(fullFormatter);
        String mediumFormat = offsetDateTime.format(mediumFormatter);
        String shortFormat = offsetDateTime.format(shortFormatter);

        // Asserzioni
        assertEquals("venerdì, marzo 1, 2002 13:00 UTC", fullFormat);  // Risultato atteso in base al formato
        assertEquals("1 mar 2002 13:00:00", mediumFormat);
        assertEquals("01/03/02 13:00", shortFormat);
    }
}