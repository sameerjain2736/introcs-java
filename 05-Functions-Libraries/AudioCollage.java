public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) 
            b[i] = alpha * a[i];
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = a.length - 1; i >= 0; i--)
            b[a.length - 1 - i] = a[i];
        return b;
    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++)
            c[i] = a[i];
        for (int i = 0; i < b.length; i++)
            c[a.length + i] = b[i];
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] c;
        double[] d;
        if (a.length >= b.length) {
            c = merge(b, new double[a.length - b.length]);
            d = new double[a.length];
            for (int i = 0; i < a.length; i++)
                d[i] = a[i] + c[i];
        }
        else {
            c = merge(a, new double[b.length - a.length]);
            d = new double[b.length];
            for (int i = 0; i < b.length; i++)
                d[i] = b[i] + c[i];
        }
        return d;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] b = new double[(int)Math.floor(a.length/alpha)];
        for (int i = 0; i < b.length; i++)
            b[i] = a[(int)(i * alpha)];
        return b;
    }

    public static double[] trim(double[] a) {
        double[] b = new double[2646000];
        for (int i = 0; i < 2646000; i++) 
            b[i] = a[i];
        return b;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] beatbox = StdAudio.read("beatbox.wav");
        double[] harp    = StdAudio.read("harp.wav");
        double[] singer  = StdAudio.read("dialup.wav");
        double[] piano   = StdAudio.read("piano.wav");
        double[] dialup  = StdAudio.read("dialup.wav");

        double[] arr; 
        arr = merge(piano, dialup);
        arr = reverse(amplify(arr, 1.15));
        arr = merge(arr, harp);
        arr = changeSpeed(arr, 2.0);
        arr = mix(beatbox, arr);
        arr = reverse(arr);
        arr = merge(arr, changeSpeed(singer, 3.0));
        arr = mix(arr, harp);
        arr = reverse(arr);

        if (arr.length < 441000) System.out.println("Needs more");
        if (arr.length > 2646000) arr = trim(arr);
        StdAudio.play(arr);
        System.out.println("Audio Collage Complete");
        StdAudio.close();
        /*
        double[] a = {1.0, 2.0, 3.3, 4.4, 5.3};
        double[] b = {6.1, 7.3, 8.2};

        for (double x: amplify(a, 0.72))
            System.out.printf("%.2f, ", x);
        System.out.println();
        
        for (double x: reverse(a))
            System.out.printf("%.2f, ", x);
        System.out.println();
        
        for (double x: merge(a, b))
            System.out.printf("%.2f, ", x);
        System.out.println();

        for (double x: mix(a, b))
            System.out.printf("%.2f, ", x);
        System.out.println();

        for (double x: changeSpeed(a, 2))
            System.out.printf("%.2f, ", x);
        System.out.println();
        */
    }
}