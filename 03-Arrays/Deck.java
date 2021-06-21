public class Deck {
    public static void main (String[] args) {
        String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);
        System.out.println("RANDOM CARD");
        System.out.println(RANKS[i] + " of " + SUITS[j]);

        System.out.println("Setting array values at run time");
        String[] deck = new String[RANKS.length * SUITS.length];
        for (int a = 0; a < RANKS.length; a++)
            for (int b = 0; b < SUITS.length; b++) 
                deck[SUITS.length * a + b] = RANKS[a] + " of " + SUITS[b];

        for( String x: deck)
            System.out.println(x);
    }
}
