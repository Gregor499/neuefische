public class Fibonacci_Rekursiv {
    public static void main(String[] args) {
        System.out.println(fibonacciRekursiv(9));
    }

    public static int fibonacciRekursiv(int a) {
        if (a < 1) {
            return 0;
        } else if (a == 1 || a == 2) {
            return 1;
        }
        return fibonacciRekursiv(a - 1) + fibonacciRekursiv(a - 2);
    }
}