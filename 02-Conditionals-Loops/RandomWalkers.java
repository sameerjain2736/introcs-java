public class RandomWalkers {
    public static void main (String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int steps;
        double sum = 0.0;
        int x;
        int y;
        double averageSteps;

        for(int i = 0; i < trials; i++) {
            x = 0;
            y = 0;
            steps = 0;

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
            }
            sum += steps;
        }

        averageSteps = sum/trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
