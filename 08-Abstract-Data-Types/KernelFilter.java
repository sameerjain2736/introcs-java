import java.awt.Color;

public class KernelFilter {

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        double[][] weights = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture) {
        double[][] weights = {
            {.0625, .1250, .0625},
            {.1250, .2500, .1250},
            {.0625, .1250, .0625}
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        double[][] weights = {
            { 0, -1,  0},
            {-1,  5, -1},
            { 0, -1,  0}
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        double[][] weights = {
            {-1, -1, -1},
            {-1,  8, -1},
            {-1, -1, -1}
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        double[][] weights = {
            {-2, -1, 0},
            {-1,  1, 1},
            { 0,  1, 2}
        };
        return kernel(picture, weights);
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        double[][] weights = {
            {1, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1}
        };

        for (int i = 0; i < weights[0].length; i++) {
            for (int j = 0; j < weights.length; j++) {
                weights[i][j] = weights[i][j]/9;
            }
        }
        
        return kernel(picture, weights);
    }

    // Returns a new picture that applies an arbitrary kernel filter to the given picture.
    private static Picture kernel(Picture picture, double[][] weights) {
        Picture newPic = new Picture(picture.width(), picture.height());
        int n          = weights.length;
        int m          = weights[0].length;

        for (int row = 0; row < picture.height(); row++) {
            for (int col = 0; col < picture.width(); col++) {
                int x0 = row - m/2;
                int y0 = col - n/2;

                double redTotal   = 0.0;
                double greenTotal = 0.0;
                double blueTotal  = 0.0;

                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        greenTotal += weights[i][j] * picture.get(Math.floorMod(j + y0, picture.width()), Math.floorMod(i + x0, picture.height())).getGreen();
                        redTotal   += weights[i][j] * picture.get(Math.floorMod(j + y0, picture.width()), Math.floorMod(i + x0, picture.height())).getRed();
                        blueTotal  += weights[i][j] * picture.get(Math.floorMod(j + y0, picture.width()), Math.floorMod(i + x0, picture.height())).getBlue();
                    }
                }

                if (redTotal < 0) redTotal = 0;
                if (redTotal > 255) redTotal = 255;
                if (greenTotal < 0) greenTotal = 0;
                if (greenTotal > 255) greenTotal = 255;
                if (blueTotal < 0) blueTotal = 0;
                if (blueTotal > 255) blueTotal = 255;

                Color output = new Color((int) Math.round(redTotal), (int) Math.round(greenTotal), (int) Math.round(blueTotal));
                newPic.set(col, row, output);
            }
        }
        return newPic;
    }

    // Test client (ungraded).
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);

        Picture identity   = identity(picture);
        Picture gaussian   = gaussian(picture);
        Picture sharpen    = sharpen(picture);
        Picture laplacian  = laplacian(picture);
        Picture emboss     = emboss(picture);
        Picture motionBlur = motionBlur(picture);

        identity.save("identity.png");
        gaussian.save("gaussian.png");
        sharpen.save("sharpen.png");
        laplacian.save("laplacian.png");
        emboss.save("emboss.png");
        motionBlur.save("motionBlur.png");
    }
}