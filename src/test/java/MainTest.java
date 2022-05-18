import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseBothPositive(){
        // Given
        int test_a = 4;
        int test_b = 3;
        int test_sum = 7;

        // When
        int actual = Main.dritte(test_a, test_b);

        // Then
        assertEquals(test_sum, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseSecondNegative(){
        // Given
        int test_a = 4;
        int test_b = -3;
        int test_sum = 1;

        // When
        int actual = Main.dritte(test_a, test_b);

        // Then
        assertEquals(test_sum, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseFirstNegative(){
        // Given
        int test_a = -4;
        int test_b = 3;
        int test_sum = -1;

        // When
        int actual = Main.dritte(test_a, test_b);

        // Then
        assertEquals(test_sum, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseBothNegativ(){
        // Given
        int test_a = -4;
        int test_b = -3;
        int test_sum = -7;

        // When
        int actual = Main.dritte(test_a, test_b);

        // Then
        assertEquals(test_sum, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseSmaller(){
        // Given
        int test_a = 4;
        boolean test_größer = false;

        // When
        boolean actual = Main.vierte(test_a);

        // Then
        assertEquals(test_größer, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseEqual(){
        // Given
        int test_a = 100;
        boolean test_größer = false;

        // When
        boolean actual = Main.vierte(test_a);

        // Then
        assertEquals(test_größer, actual);
    }

    void shouldBeTrueIfResultOfTwoNumbersAddsCorrectlyCaseBigger(){
        // Given
        int test_a = 10210313;
        boolean test_größer = true;

        // When
        boolean actual = Main.vierte(test_a);

        // Then
        assertEquals(test_größer, actual);
    }

}
