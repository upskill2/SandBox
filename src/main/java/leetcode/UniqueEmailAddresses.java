package leetcode;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        return 1;
    }

    public static void main(String[] args) {
        String[] emails = { "test.email+alex@leetcode.com",
                            "test.e.mail+bob.cathy@leetcode.com",
                            "testemail+david@lee.tcode.com"};

        new UniqueEmailAddresses().numUniqueEmails(emails);

    }

}
