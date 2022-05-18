public class Alarm {
    public static void main(String[] args) {
        System.out.println("Methode1: "+ personenAnzahl(4));
    }

    public static String personenAnzahl(int a) {
        if (a > 30){
            return "Zu viele Personen";
        }
        else if (a < 30){
            return "Maximale Personenzahl nicht überschritten";
        }
        else
            return "";
    }

    }

