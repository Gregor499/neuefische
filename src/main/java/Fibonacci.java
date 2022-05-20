public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int a) {
        if (a < 1) {
            return 0;
        } else if (a == 1 || a == 2) {
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }

    public static int fibonacci2(int a) {
        if (a < 1) {
            return 0;
        } else if (a == 1 || a == 2) {
            return 1;
        }
        return fibonacci(a-1) + fibonacci(a-2);
    }
}

