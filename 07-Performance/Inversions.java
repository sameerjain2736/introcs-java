public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) count++;
            }
        }
        return count;
    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] arr = new int[n];
        int val = n - 1;
        while (k > 0) {
            if (k >= val) {
                arr[n - 1 - val] = val;
                k -= val;
                val--;
            }
            else {
                arr[n - 1 - (int) k] = val;
                k -= val;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && j <= val) {
                arr[i] = j;
                j++;
            }
        }
        return arr;
    }

    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] arr = generate(n, k);
        for (int x: arr) {
            System.out.printf("%d%s", x, " ");
        }
        //System.out.printf("\nCount: %d", count(arr));
    }
}