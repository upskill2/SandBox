import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();

        set.add("String1");
        set.add("String2");
        set.add("String3");

        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        }
    }
