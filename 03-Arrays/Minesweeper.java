public class Minesweeper {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        boolean[][] hasMines = new boolean[m +2][n + 2];
        int[][] neighborMines = new int[m + 2][n + 2];

        for (int i = 0; i < k; i++) {
            //generate x,y coordinates for each mine
            int x = ((int) (Math.random() * m)) + 1;
            int y = ((int) (Math.random() * n)) + 1;
            if(hasMines[x][y] == false)
                hasMines[x][y] = true;
            else
                i--;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                int count = 0;
                for (int p = i - 1; p < i + 2; p++) {
                    for (int q = j - 1; q < j + 2; q++) { 
                        if(hasMines[p][q] == true)
                            count++;
                    }
                }
                neighborMines[i][j] = count;
            }
        }
        
        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if(hasMines[i][j])
                    System.out.print("*" + " ");
                else
                    System.out.print(neighborMines[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}