public class RectangularMatrixDotProduct {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int p = Integer.parseInt(args[2]);
        int q = Integer.parseInt(args[3]);
        
        if (n != p){ 
            throw new ArithmeticException ("# of cols in Matrix 1 should equal # of rows in Matrix 2");
        }

        int[][] a = new int[m][n];
        int[][] b = new int[n][q];
        int[][] c = new int[m][q];


        System.out.println("\nMatrix A");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatrix B");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++) {
                b[i][j] = (int) (Math.random() * 10);
                System.out.print(b[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatrix C");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                for (int k = 0; k < n; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
