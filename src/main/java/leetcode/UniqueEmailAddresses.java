package leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        Set<String> set = new HashSet<>();

        for (String s : emails
        ) {
            StringBuilder sb = new StringBuilder();
            if (!s.contains("@")) {
                continue;
            }
            if (s.contains("+")) {
                if (s.indexOf("+") < s.indexOf("@")) {
                    sb.append(addName(s, s.indexOf("+")));
                    sb.append(addDomain(s, s.indexOf("@")));
                } else {
                    sb.append(addName(s, s.indexOf("@")));
                    sb.append(addDomain(s, s.indexOf("@")));
                }
            } else {
                sb.append(addName(s, s.indexOf("@")));
                sb.append(addDomain(s, s.indexOf("@")));
            }
          set.add(sb.toString());
        }

        return set.size();
    }

    public static String addDomain(String s, int atIdx) {
        int len = s.length();
        return s.substring(atIdx, len);

    }

    public static String addName(String s, int plusIdx) {

        String str = s.substring(0, plusIdx);
        return str.replace(".", "");
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com",
                "test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};

        String[] emails0 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};


        String[] emails1 = {"linqmafia@leet+code.com", "linqmafia@code.com"};

        //  new UniqueEmailAddresses().numUniqueEmails(emails);
        //  new UniqueEmailAddresses().numUniqueEmails(emails0);
        new UniqueEmailAddresses().numUniqueEmails(emails1);
    }

}
