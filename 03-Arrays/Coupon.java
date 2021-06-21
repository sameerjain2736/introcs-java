public class Coupon {
    public static void main (String[] args) {

        /* Assume infinite number of cards are made
        with M different types each with equal prob
        of being selected */

        int cardsSelected = 0;
        int distinctCards = 0;

        int m = Integer.parseInt(args[0]);
        boolean[] found = new boolean[m];

        while (distinctCards < m) {
            int r = (int)(Math.random() * m);
            cardsSelected++;

            if (!found[r]) {
                distinctCards++;
                found[r] = true;
            }
        }
        System.out.println(cardsSelected);
    }
}

