package decision.tree;


public class LetterUtils {
    public static double percentUpBlackOfAllBlack(Letter letter, double percent) {
        boolean[][] image = letter.getImage();
        int allBlackPixels = 0;
        int blackUpperPixels = 0;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j]) {
                    allBlackPixels++;
                    if (i < (int) (image.length * percent)) blackUpperPixels++;
                }
            }
        }

        return (double) blackUpperPixels / allBlackPixels;
    }

    public static double percentMiddleBlackOfAllBlack(Letter letter) {
        boolean[][] image = letter.getImage();
        int allBlackPixels = 0;
        int blackMiddlePixels = 0;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j]) {
                    allBlackPixels++;
                    if (i > (int) (image.length / 3) && i <= (image.length / 3) * 2) blackMiddlePixels++;
                }
            }
        }
        return (double) blackMiddlePixels / allBlackPixels;
    }

    public static double percentLeftHalfBlackOfAllBlack(Letter letter) {
        boolean[][] image = letter.getImage();
        int allBlackPixels = 0;
        int blackLeftHalfPixels = 0;

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                if (image[i][j]) {
                    allBlackPixels++;
                    if (j > image[0].length / 2) blackLeftHalfPixels++;
                }
            }
        }
        return (double) blackLeftHalfPixels / allBlackPixels;
    }

}