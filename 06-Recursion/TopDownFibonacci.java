/* Top-down dynamic programming approach for computing
fibonacci numbers - Also known as Memoization */
public class TopDownFibonacci {
    private static long[] f = new long[92]; //cached values
    
    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (f[n] > 0) return f[n]; //return cached value
        f[n] = fib(n-1) + fib(n-2); //compute and cache value
        return f[n];
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        while (x >= 0) {
            System.out.println(fib(x));
            x--;
        }
    }
}