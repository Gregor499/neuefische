public class Main {
    public static void main(String[] args) {
        System.out.println("Methode1: "+ erste("regegegegeg"));
        System.out.println("Methode2: "+ zweite("fffff"));
        System.out.println("Methode3: " + dritte(3,5));
        System.out.println("Methode4: " + vierte(1411));
    }

    public static boolean erste(String a) {
        return a.length()>20;
    }

    public static boolean zweite(String a) {
        return a.contains("fancy");
    }

    public static int dritte(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static boolean vierte(int a) {
        boolean größer = (a > 100);
        return größer;
    }

    }

