import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Alarm2Test {

    @Test
    void negativerWert() {
        // Given
        String test_Alarmstufe = "rot";
        int test_a = 23;
        String test_warnung = "";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }
}