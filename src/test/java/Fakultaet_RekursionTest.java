import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Fakultaet_RekursionTest {

    @Test
    void test0() {
        // Given
        assertEquals("0! = 1", Fakultaet_Rekursion.fakultaet(0));
    }

    @Test
    void test1() {
        // Given
        assertEquals("1! = 1", Fakultaet_Rekursion.fakultaet(1));
    }

    @Test
    void test2() {
        assertEquals("2! = 2", Fakultaet_Rekursion.fakultaet(2));

    }

    @Test
    void test3() {
        assertEquals("3! = 6", Fakultaet_Rekursion.fakultaet(3));

    }

    @Test
    void test4() {
        assertEquals("Error", Fakultaet_Rekursion.fakultaet(-1));

    }

    @Test
    void test5() {
        assertEquals("Error", Fakultaet_Rekursion.fakultaet(-5));
    }
}
