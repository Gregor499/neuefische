public class Fakultaet_While {
    public static void main(String[] args) {
        System.out.println("Methode1: " + fakultaet(5));
    }

    public static String fakultaet(int a) {
        int eingabe = a;
        int b = 1;
        if (a >= 0) {
            while (a > 1) {
                b = b * a;
                a--;
            }
            return eingabe + "! = " + b;
        }
        else return "Error";
    }
}