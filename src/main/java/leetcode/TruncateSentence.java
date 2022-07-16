package leetcode;

public class TruncateSentence {
    public String truncateSentence(String s, int k) {


        StringBuilder sb = new StringBuilder();

        String[] ar = s.split("\\s");
        for (int i = 0; i < k; i++) {
            sb.append(ar[i]).append("\s");
        }
       String str1 = sb.toString().trim();

        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static void main(String[] args) {
        TruncateSentence tr = new TruncateSentence();
        String s = "Hello how are you Contestant";
        int k = 4;

        tr.truncateSentence(s, k);
    }

}
