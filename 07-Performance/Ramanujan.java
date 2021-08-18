public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        double d = 0.0;

        for (int i = 1; i <= Math.floor(Math.cbrt(n)); i++) {
            b = Math.cbrt(n - Math.pow(i,3));
            if (b % 1 == 0) {
                a = i;
                break;
            }
        }

        if (a == 0) return false;

        for (int j = (int) a + 1; j <= Math.floor(Math.cbrt(n)); j++) {
            d = Math.cbrt(n - Math.pow(j,3));
            if (d % 1 == 0) {
                c = j;
                break;
            }
        }

        return true;
    }

    // Takes a long integer command-line arguments n and prints true if
    // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        System.out.println(isRamanujan(Long.parseLong(args[0])));
    }
}