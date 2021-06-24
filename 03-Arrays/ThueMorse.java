public class ThueMorse {
    public static void main (String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) 
            arr[i] = thue(i);

        for (int i : arr) {
            for (int j : arr) {
                if (i == j)
                    System.out.print("+ ");
                else 
                    System.out.print("- ");
            }
            System.out.println();
        }
    }

    static int thue (int i) {
        if ( i == 0) 
            return 0;
        else if ( i % 2 == 0) 
            return thue(i/2);
        else 
            return 1 - thue(i - 1);
    }
}
