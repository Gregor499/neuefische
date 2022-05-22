public class Fakultaet_Rekursion {

    public static void main(String[] args) {
        System.out.println("Methode1: " + fakultaet(5));
            System.out.println("Methode2: " + fakultaetAusgabe(5));
}

    public static int fakultaet(int a) {
            if (a <= 1) {
                return 1;
            }
            return fakultaet(a - 1) * a;
        }

    public static String fakultaetAusgabe(int b) {
        if (b >= 0) {
            return (b + "! = " + fakultaet(b));
        }
        else return "Error";
    }
    }
