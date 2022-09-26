package leetcode;

public class DeleteCharactersToMakeFancyString {

    public String makeFancyString(String s) {

        int count = 1;

        StringBuilder sb = new StringBuilder();

        sb.append(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                count = 1;
            }

            if (count < 3) {
                sb.append(s.charAt(i + 1));
            }
        }


        return sb.toString();
    }

    public static void main(String[] args) {

        DeleteCharactersToMakeFancyString del = new DeleteCharactersToMakeFancyString();

        String s = "aaabaaaa";
        String s1 = "leeetcode";

        del.makeFancyString(s);
        del.makeFancyString(s1);

    }

}
