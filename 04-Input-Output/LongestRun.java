public class LongestRun {
    public static void main (String[] args) {
        int[] arr = StdIn.readAllInts();
        int currCount = 1;
        int maxCount = 1;
        int maxInt = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                if (currCount > maxCount) {
                    maxCount = currCount;
                    maxInt = arr[i - 1];
                }
                currCount = 1;
            }
            else {
                currCount++;
                if (currCount > maxCount) {
                    maxCount = currCount;
                    maxInt = arr[i];
                }
            }
        }
        System.out.println("Longest Run: " + maxCount + " consecutive " + maxInt + "s");
    }
}
