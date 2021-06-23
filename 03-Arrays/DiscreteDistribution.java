public class DiscreteDistribution {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        int[] sums = new int[args.length];
        sums[0] = 0;

        for (int i = 1; i < sums.length; i++) {
            sums[i] = sums[i - 1] + Integer.parseInt(args[i]);
        }

        int r;
        int idx; 

        for (int j = 0; j < m; j++) {
            r = (int) (Math.random() * sums[sums.length - 1]);
            idx = 0;
            for (int i = 1; i < sums.length; i++) {
                if ((r >= sums[i - 1]) && (r < sums[i])) 
                    idx = i;
            }
            System.out.print(idx + " ");
        }

        System.out.println();
    }
}
