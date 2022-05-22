import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Alarm2Test {

    @Test
    void leereEingabe() {
        // Given
        String test_Alarmstufe = "";
        int test_a = 0;
        String test_warnung = "bitte die Alarmstufe eintragen";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }

    @Test
    void rotImRahmen() {
        // Given
        String test_Alarmstufe = "rot";
        int test_a = 0;
        String test_warnung = "Maximale Personenanzahl nicht überschritten";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }

        @Test
        void rotAusserRahmen() {
            // Given
            String test_Alarmstufe = "rot";
            int test_a = 5;
            String test_warnung = "Zu viele Personen";

            // When
            String actual = Alarm2.warnung(test_Alarmstufe, test_a);

            // Then
            assertEquals(test_warnung, actual);
    }

    @Test
    void gelbImRahmen() {
        // Given
        String test_Alarmstufe = "gelb";
        int test_a = 15;
        String test_warnung = "Maximale Personenanzahl nicht überschritten";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }

    @Test
    void gelbAusserRahmen() {
        // Given
        String test_Alarmstufe = "gelb";
        int test_a = 40;
        String test_warnung = "Zu viele Personen";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }

    @Test
    void gruenImRahmen() {
        // Given
        String test_Alarmstufe = "grün";
        int test_a = 40;
        String test_warnung = "Maximale Personenanzahl nicht überschritten";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }

    @Test
    void gruenAusserRahmen() {
        // Given
        String test_Alarmstufe = "grün";
        int test_a = 65;
        String test_warnung = "Zu viele Personen";

        // When
        String actual = Alarm2.warnung(test_Alarmstufe, test_a);

        // Then
        assertEquals(test_warnung, actual);
    }
}