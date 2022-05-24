import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Fibonacci_IterativTest {
    @Test
    void fakultaet0() {
        // Given
        assertEquals(0, Fibonacci_Iterativ.fibonacciIterativ(0));
    }

    @Test
    void fakultaet1() {
        // Given
        assertEquals(1, Fibonacci_Iterativ.fibonacciIterativ(1));
    }

    @Test
    void fakultaet2() {
        // Given
        assertEquals(1, Fibonacci_Iterativ.fibonacciIterativ(2));
    }

    @Test
    void fakultaet3() {
        // Given
        assertEquals(2, Fibonacci_Iterativ.fibonacciIterativ(3));
    }

    @Test
    void fakultaet4() {
        // Given
        assertEquals(3, Fibonacci_Iterativ.fibonacciIterativ(4));
    }

    @Test
    void fakultaet5() {
        // Given
        assertEquals(5, Fibonacci_Iterativ.fibonacciIterativ(5));
    }

    @Test
    void fakultaetNegativ() {
        // Given
        assertEquals(0, Fibonacci_Iterativ.fibonacciIterativ(-5));
    }
}
