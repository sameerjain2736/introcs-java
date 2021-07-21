public class Ruler {
    public static String ruler(int n) {
        if (n == 0) return " ";
        else
            return ruler(n-1) + n + ruler(n-1);
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(ruler(x));
    }
}