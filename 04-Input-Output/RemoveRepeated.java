public class RemoveRepeated {
    public static void main (String[] args) {
        int[] arr = StdIn.readAllInts();
        System.out.print(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
