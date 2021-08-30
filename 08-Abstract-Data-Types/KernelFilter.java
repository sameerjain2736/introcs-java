import java.awt.Color;

public class KernelFilter {

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        double[][] weights = {
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
        };
        return picture;
    }

    // Returns a new picture that applies a Gaussian blur filter to the given picture.
    public static Picture gaussian(Picture picture) {
        double[][] weights = {
            {.0625, .1250, .0625},
            {.1250, .2500, .1250},
            {.0625, .1250, .0625}
        };
        return picture;
    }

    // Returns a new picture that applies a sharpen filter to the given picture.
    public static Picture sharpen(Picture picture) {
        double[][] weights = {
            { 0, -1,  0},
            {-1,  5, -1},
            { 0, -1,  0}
        };
        return picture;
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        double[][] weights = {
            {-1, -1, -1},
            {-1,  8, -1},
            {-1, -1, -1}
        };
        return picture;
    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        double[][] weights = {
            {-2, -1, 0},
            {-1,  1, 1},
            { 0,  1, 2}
        };
        return picture;
    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        double[][] weights = {
            {1/9, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1/9, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 1/9, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1/9, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1/9, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 1/9, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 1/9, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 1/9, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 1/9}
        };
        
        return picture;
    }

    // Returns a new picture that applies an arbitrary kernel filter to the given picture.
    private static Picture kernel(Picture picture, double[][] weights) {
        return picture;
    }

    // Test client (ungraded).
    public static void main(String[] args) {
        Picture picture = new Picture(args[0]);

        for (int col = 0; col < picture.width(); col++) {
            for (int row = 0; row < picture.height(); row++) {
                Color color = picture.get(col, row);
                picture.set(col, row, color.darker());
            }
        }
        picture.save("darker.png");
    }
}