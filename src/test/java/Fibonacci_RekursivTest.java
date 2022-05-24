import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

    public class Fibonacci_RekursivTest {
        @Test
        void fakultaet0() {
            // Given
            assertEquals(0, Fibonacci_Rekursiv.fibonacciRekursiv(0));
        }

        @Test
        void fakultaet1() {
            // Given
            assertEquals(1, Fibonacci_Rekursiv.fibonacciRekursiv(1));
        }

        @Test
        void fakultaet2() {
            // Given
            assertEquals(1, Fibonacci_Rekursiv.fibonacciRekursiv(2));
        }

        @Test
        void fakultaet3() {
            // Given
            assertEquals(2, Fibonacci_Rekursiv.fibonacciRekursiv(3));
        }

        @Test
        void fakultaet4() {
            // Given
            assertEquals(3, Fibonacci_Rekursiv.fibonacciRekursiv(4));
        }

        @Test
        void fakultaet5() {
            // Given
            assertEquals(5, Fibonacci_Rekursiv.fibonacciRekursiv(5));
        }

        @Test
        void fakultaetNegativ() {
            // Given
            assertEquals(0, Fibonacci_Rekursiv.fibonacciRekursiv(-5));
        }
    }
