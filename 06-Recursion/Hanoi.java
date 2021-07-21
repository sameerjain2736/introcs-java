public class Hanoi {
    public static String hanoi(int n, boolean left) {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";    //current move
        else move = n + "R";        //current move
        return hanoi(n-1, !left) + move + hanoi(n-1, !left);
    }

    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(hanoi(x, false));
    }
}