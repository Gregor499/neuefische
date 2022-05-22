public class Fakultaet {
    public static void main(String[] args) {
        System.out.println("Methode1: " + fakultaet(5));
    }

    public static String fakultaet(int a) {
        if (a >= 0) {
            int b = 1;
            for (int i = 1; i <= a; i++) {
                b = b * i;
            }
            return a + "! = " + b;

        } else return "Error";
    }
}
