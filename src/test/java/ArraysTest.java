import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    void test0() {
        // Given
        assertEquals("", Arrays.array(0));
    }

    @Test
    void test1() {
        // Given
        assertEquals("array[0] = Student 1\n", Arrays.array(1));
    }

    @Test
    void test2() {
        assertEquals("array[0] = Student 1\narray[1] = Student 2\n", Arrays.array(2));

    }
}