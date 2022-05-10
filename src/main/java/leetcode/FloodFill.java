package leetcode;

public class FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int oldColor = image[sr][sc];
        if (oldColor != newColor) {
            fillPixels(image, sr, sc, oldColor, newColor);
        }
        return image;
    }

    public static void fillPixels(int[][] image, int row, int col, int oldColor, int newColor) {

        if (image[row][col] == oldColor) {
            image[row][col] = newColor;
            if (row >= 1) {
                fillPixels(image, row - 1, col, oldColor, newColor);
            }
            if (col >= 1) {
                fillPixels(image, row, col - 1, oldColor, newColor);
            }

            if (row + 1 < image.length) {
                fillPixels(image, row + 1, col, oldColor, newColor);
            }

            if (col + 1 < image[0].length) {
                fillPixels(image, row, col + 1, oldColor, newColor);
            }

        }

    }


    public static void main(String[] args) {

        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, newColor = 2;

        new FloodFill().floodFill(image, sr, sc, newColor);
    }

}
