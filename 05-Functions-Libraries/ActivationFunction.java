public class ActivationFunction {

    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return NaN;
        if (x < 0) return 0;
        if (x == 0) return 0.5;
        if (x > 0) return 1;
        return 0.0;
    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return NaN;
        return (double) 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        if (Double.isNaN(x)) return NaN;
        if (x >= 20) return 1.0;
        if (x <= -20) return -1.0;
        return (Math.exp(x) - Math.exp(-x))/(Math.exp(x) + Math.exp(-x));
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        if (Double.isNaN(x)) return NaN;
        if (x == Double.POSITIVE_INFINITY) return 1;
        if (x == Double.NEGATIVE_INFINITY) return -1;
        return (Math.abs(x) / (1 + Math.abs(x)));
    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) return NaN;
        if (x <= -2) return -1;
        if (x < 0 && x > -2) return x + Math.pow(x,2)/4;
        if (x < 2 && x >= 0) return x - Math.pow(x,2)/4;
        if (x >= 2) return 1;
        return 0.0;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        double input = Double.parseDouble(args[0]);
        System.out.printf("heaviside(%f) = %f\n", input, heaviside(input));
        System.out.printf("  sigmoid(%f) = %f\n", input, sigmoid(input));
        System.out.printf("     tanh(%f) = %f\n", input, tanh(input));
        System.out.printf(" softsign(%f) = %f\n", input, softsign(input));
        System.out.printf("     sqnl(%f) = %f\n", input, sqnl(input));
    }
}