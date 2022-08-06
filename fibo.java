import java.util.Scanner;

/**
 * fibo
 */
public class fibo {
    static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("fib(n) olucak sekil de n sayınızı giriniz : ");
        int n = scan.nextInt();

        System.out.println("fib("+ n + ")" + " = "+ fib(n));
        /*fib(n) = fib(n-1)+fib(n-2)
         * [fib(0) = 0 ]it did not use
         * fib(1) = 1 
         * fib(2) = 1 
         * fib(3) = fib(1) + fib(2) = 2 
         * 
         * 
         * 
         * 
         * 
         */
    }
}