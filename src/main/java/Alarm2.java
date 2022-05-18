public class Alarm2 {
    public static void main(String[] args) {
        System.out.println("Methode1: " + warnung("rot", 4));
    }

    public static String warnung(String alarmstufe, int a) {

        switch (alarmstufe) {
            case "":
                return "bitte die Alarmstufe eintragen";

            case "rot":
                if (a == 0) {
                    return "Maximale Personenanzahl nicht überschritten";
                } else if (a > 0) {
                    return "Zu viele Personen";
                } else return "negative Zahl";

            case "gelb":
                if (a >= 0 && a <= 30) {
                    return "Maximale Personenanzahl nicht überschritten";
                } else if (a > 30) {
                    return "Zu viele Personen";
                } else return "negative Zahl";

            case "grün":
                if (a >= 0 && a <= 60) {
                    return "Maximale Personenanzahl nicht überschritten";
                } else if (a > 60) {
                    return "Zu viele Personen";
                } else return "negative Zahl";

            default:
                return "Error";
        }
    }
}
