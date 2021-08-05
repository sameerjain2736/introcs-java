/* 3 rods A, B, C
 * Move n rings on rod A to rod C
 */
public class Hanoi3 {
    public static void hanoi(int n, String from, String help, String dest){
        if (n == 0) return;
        hanoi(n-1, from, dest, help);
        System.out.printf("Move disc %d from %s to %s\n", n, from, dest);
        hanoi(n-1, help, from, dest);
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        hanoi(x, "A", "B", "C");
    }
}