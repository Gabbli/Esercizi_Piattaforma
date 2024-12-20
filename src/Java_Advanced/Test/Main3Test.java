package Java_Advanced.Test;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class Main3Test {

    @Test
    void main() {
        String dateStr = "2002-03-01T13:00:00Z";
        OffsetDateTime offsetDateTime = OffsetDateTime.parse(dateStr);

        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.ITALIAN);

        String mediumFormat = offsetDateTime.format(mediumFormatter);

        assertEquals("1 marzo 2002", mediumFormat);

    }
}