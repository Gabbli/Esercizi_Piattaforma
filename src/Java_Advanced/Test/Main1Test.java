package Java_Advanced.Test;

import static org.junit.jupiter.api.Assertions.*;
class Main1Test {

    private final Main1 testing = new Main1();

    @org.junit.jupiter.api.Test
    void calcolaArea() {
        double result = testing.calcolaArea(7,3);
        assertEquals(10.5, result);
    }
}