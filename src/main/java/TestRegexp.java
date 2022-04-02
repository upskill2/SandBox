import jregex.Pattern;
import jregex.Matcher;

public class TestRegexp {

    public static void main(String[] args) {

        Pattern p = new Pattern("(a)?b(?(1)c|d)");
        Matcher m = p.matcher("bd");

        while (m.find()){
            System.out.println(m.start() + " " + m + " ");
        }
    }

}
