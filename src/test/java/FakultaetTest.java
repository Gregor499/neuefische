import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FakultaetTest {

    @Test
    void test0() {
        // Given
        int test_a = 0;
        String test_ergebnis = "0! = 1";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void test1() {
        // Given
        int test_a = 1;
        String test_ergebnis = "1! = 1";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void test2() {
        // Given
        int test_a = 2;
        String test_ergebnis = "2! = 2";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void test3() {
        // Given
        int test_a = 3;
        String test_ergebnis = "3! = 6";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }

    @Test
    void test4() {
        // Given
        int test_a = -1;
        String test_ergebnis = "Error";

        // When
        String actual = Fakultaet.fakultaet(test_a);

        // Then
        assertEquals(test_ergebnis, actual);
    }
}