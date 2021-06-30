public class Birthday {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] countArr = new int[n + 2];

        for (int i = 0; i < trials; i++) {
            boolean doesShare = false;
            int count = 0;
            boolean[] bdayArr = new boolean[n];

            while(!doesShare) {
                int idx = (int)(Math.random() * n);
                if (bdayArr[idx] == true) {
                    doesShare = true;
                    countArr[count]++;
                }
                else {
                    bdayArr[idx] = true;
                    count++;
                }
            }
        }

        double frac = 0.0;
        int i = 0;
        while (frac < 0.5) {
            frac += (double) countArr[i] /trials;
            System.out.print(i + 1 + "\t" + (int) countArr[i] + "\t" + frac + "\n");
            i++;
        }
    }
}