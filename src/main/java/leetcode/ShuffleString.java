package leetcode;

public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < indices.length; i++) {
            sb.setCharAt(indices[i], s.charAt(i));
      }

        return sb.toString();
    }

    public static void main(String[] args) {
        ShuffleString sh = new ShuffleString();

        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        sh.restoreString(s,indices);
    }
}
