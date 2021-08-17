public class MaximumSquareSubmatrix {

    // Returns the size of the largest contiguous square submatrix
    // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int[][] b = new int[a.length][a[0].length];
        int maxVal = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == 0 || j == 0) && a[i][j] == 1) 
                    b[i][j] = 1;
                else if (a[i][j] == 1) 
                    b[i][j] = 1 + Math.min(Math.min(b[i][j-1], b[i-1][j-1]), Math.min(b[i-1][j-1], b[i-1][j]));
                if (b[i][j] > maxVal) 
                    maxVal = b[i][j];
            }
        }
        return maxVal;
    }

    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix
    // containing only 1s.
    public static void main(String[] args) {
        int m = StdIn.readInt();
        int[][] a = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = StdIn.readInt();
            }
        }
        System.out.println(size(a));
    }
}