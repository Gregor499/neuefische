public class Fibonacci_Iterativ {
    public static void main(String[] args) {
        System.out.println(fibonacciIterativ(23));
    }

    public static int fibonacciIterativ(int a) {
        int fib = 1;
        int prevFib = 1;

        if (a < 1) {
            return 0;
        }

        for (int i = 2; i < a; i++) {
            int temp = fib;
            fib += prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
