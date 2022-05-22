import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Fakultaet_RekursionTest {

    @Test
    void fakultaet0() {
        // Given
        assertEquals("0! = 1", Fakultaet_Rekursion.fakultaetAusgabe(0));
    }

    @Test
    void fakultaet1() {
        // Given
        assertEquals("1! = 1", Fakultaet_Rekursion.fakultaetAusgabe(1));
    }

    @Test
    void fakultaet2() {
        assertEquals("2! = 2", Fakultaet_Rekursion.fakultaetAusgabe(2));

    }

    @Test
    void fakultaet3() {
        assertEquals("3! = 6", Fakultaet_Rekursion.fakultaetAusgabe(3));

    }

    @Test
    void fakultaetNegativeZahl() {
        assertEquals("Error", Fakultaet_Rekursion.fakultaetAusgabe(-5));
    }
}
