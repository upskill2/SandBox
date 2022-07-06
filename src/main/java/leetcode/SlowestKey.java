package leetcode;

public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int max = releaseTimes[0];
        int maxTemp = 0;
        char res = keysPressed.charAt(0);

        for (int i = 1; i < releaseTimes.length; i++) {
            maxTemp = releaseTimes[i] - releaseTimes[i - 1];
            char key = keysPressed.charAt(i);

            if (maxTemp == max) {
                res = key > res ? key : res;

            } else if (maxTemp > max) {
                max = maxTemp;
                res = key;
            }

        }

        return res;
    }

    public static void main(String[] args) {
        SlowestKey sl = new SlowestKey();

        int[] releaseTimes = {9, 29, 49, 50};
        String keysPressed = "cbcd";

        int[] releaseTimes1 = {12, 23, 36, 46, 62};
        String keysPressed1 = "spuda";

        sl.slowestKey(releaseTimes, keysPressed);
        sl.slowestKey(releaseTimes1, keysPressed1);
    }
}
