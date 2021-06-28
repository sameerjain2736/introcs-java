public class ForCompare {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                //System.out.println(arr[j] + " compared with " + arr[i]);
                if (arr[j] == arr[i]) {
                    System.out.println("Match! " + count);
                    break;
                }
            }
            count++;
        }

        System.out.println("count: " + count);
    }
}
