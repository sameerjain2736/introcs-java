public class DoubleArray {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);

        int[][] arr = new int[m + 2][n + 2];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int i = 0; i < m + 2; i++) {
            for (int j = 0; j < m + 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("*************");

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                for (int p = i - 1; p < i + 2; p++) {
                    for (int q = j - 1; q < j + 2; q++) {
                        System.out.print(arr[p][q] + " ");
                    }
                    System.out.println();
                }
                System.out.println("******");
            }
            System.out.println();
        }
    }
}