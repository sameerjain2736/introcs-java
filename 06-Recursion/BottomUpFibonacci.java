public class BottomUpFibonacci {
    public static long fib(int n) {
        long[] arr = new long[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++)
            arr[i] = arr[i-1] + arr[i-2];
        return arr[n];
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        while (x >= 0) {
            System.out.println(fib(x));
            x--;
        }
    }
}