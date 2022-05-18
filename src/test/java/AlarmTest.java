import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AlarmTest {

    @Test
    void zuVielePersonen() {
        // Given
        int test_a = 535;
        String test_personenAnzahl = "Zu viele Personen";

        // When
        String actual = Alarm.personenAnzahl(test_a);

        // Then
        assertEquals(test_personenAnzahl, actual);
    }

    @Test
    void maximalePersonenzahlNichtUeberschritten() {
        // Given
        int test_a = 4;
        String test_personenAnzahl = "Maximale Personenzahl nicht überschritten";

        // When
        String actual = Alarm.personenAnzahl(test_a);

        // Then
        assertEquals(test_personenAnzahl, actual);
    }

    @Test
    void gleichVielePersonen() {
        // Given
        int test_a = 30;
        String test_personenAnzahl = "";

        // When
        String actual = Alarm.personenAnzahl(test_a);

        // Then
        assertEquals(test_personenAnzahl, actual);
    }
}