public class RevesPuzzle {
    public static void hanoi(int n, int k, String from, String help, String dest){
        if (n == k) return;
        hanoi(n-1, k, from, dest, help);
        System.out.printf("Move disc %d from %s to %s\n", n, from, dest);
        hanoi(n-1, k, help, from, dest);
    }

    public static void reves(int n, String from, String help1, String help2, String dest) {
        if (n == 0) return;
        int k = (int) Math.round(n + 1 - Math.sqrt(2*n + 1));
        reves(k, from, dest, help2, help1);
        hanoi(n, k, from, help2, dest);
        reves(k, help1, from, help2, dest);
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        reves(x, "A", "B", "C", "D");
    }
}