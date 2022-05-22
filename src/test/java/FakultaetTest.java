import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FakultaetTest {

    @Test
    void fakultaet0() {
        // Given
        int test_a = 0;
        String test_ergebnis = "0! = 1";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void fakultaet1() {
        // Given
        int test_a = 1;
        String test_ergebnis = "1! = 1";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void fakultaet2() {
        // Given
        int test_a = 2;
        String test_ergebnis = "2! = 2";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void fakultaet3() {
        // Given
        int test_a = 3;
        String test_ergebnis = "3! = 6";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void fakultaetNegativeZahl() {
        // Given
        int test_a = -1;
        String test_ergebnis = "Error";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }
}