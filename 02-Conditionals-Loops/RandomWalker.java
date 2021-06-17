public class RandomWalker {
    public static void main (String[] args) {
        int r = Integer.parseInt(args[0]);
        int steps = 0;
        int x = 0;
        int y = 0;

        System.out.println("(" + x + ", " + y + ")");

        while((Math.abs(x) + Math.abs(y)) != r) {
            double prob = Math.random();
            if (prob <= 0.25) { //North
                y++;
            }
            else if (prob <= 0.50 && prob > 0.25) { //West
                x--;
            }
            else if (prob <= 0.75 && prob > 0.50) { //South
                y--;
            }
            else { //East
                x++;
            }

            steps++;
            System.out.println("(" + x + ", " + y + ")");
        }

        System.out.println("steps = " + steps);
    }
}
