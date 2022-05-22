import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

public class Fakultaet_WhileTest {

    @Test
    void fakultaet0() {
        // Given
        assertEquals("0! = 1", Fakultaet_While.fakultaet(0));
    }

    @Test
    void fakultaet1() {
        // Given
        assertEquals("1! = 1", Fakultaet_While.fakultaet(1));
    }

    @Test
    void fakultaet2() {
        assertEquals("2! = 2", Fakultaet_While.fakultaet(2));

    }

    @Test
    void fakultaet3() {
        assertEquals("3! = 6", Fakultaet_While.fakultaet(3));

    }

    @Test
    void fakultaetNegativeZahl() {
        assertEquals("Error", Fakultaet_While.fakultaet(-5));
    }
    }