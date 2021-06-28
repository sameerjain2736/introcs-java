public class Birthday { 
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] countArr = new int[trials];
        for (int i = 0; i < trials; i++) {
            countArr[i] = experiment(n);
            //System.out.print(countArr[i] + " ");
        }
        //System.out.println();

        int[] nArr = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < countArr.length; j++) {
                if (countArr[j] == i + 1)
                    count++;
            }
            nArr[i] = count;
        }

        /*
        for (int x: nArr)
            System.out.print(x + " ");
        System.out.println();
        */

        float frac = 0;
        for (int i = 0; i < nArr.length; i++) {
            frac += (float)nArr[i]/trials;
            System.out.println((i+1) + "\t" + nArr[i] + "\t" + frac);
            if (frac > 0.5)
                break;
        }
    }

    static int experiment (int n) {
        int count = 0;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i])
                    return (count + 1);
            }
            count++;
        }
        return (count + 1);
    }
}
