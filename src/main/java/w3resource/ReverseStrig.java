package w3resource;

public class ReverseStrig {

    public String reverse (String s) {

        String rss = "";
        for (int i = s.length(); i>0  ; i--) {
            rss += (s.charAt(i-1));
        }

        return rss;

    }

    public static void main(String[] args) {
        System.out.println(new ReverseStrig().reverse("test string"));
    }
}
