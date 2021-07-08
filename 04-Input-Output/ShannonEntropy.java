public class ShannonEntropy {
    public static void main (String[] args) {
        int m = Integer.parseInt(args[0]);
        double entropy = 0.0;
        int[] countArr = new int[m];
        int[] inputArr = StdIn.readAllInts();

        for (int x : inputArr) countArr[x - 1]++;

        for (int i = 1; i <= m; i++) {
            double p = (double)countArr[i - 1]/inputArr.length;
            if (p == 0) entropy += 0;
            else entropy += p * Math.log(p)/Math.log(2);
        }

        entropy *= -1;
        System.out.printf("%.4f\n", entropy);
    }
}