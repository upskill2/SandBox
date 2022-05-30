package leetcode;

public class DefangingAnIPAddress {

    public String defangIPaddr(String address) {

      String str =  address.replaceAll("\\.","[.]");

        return str;
    }

    public static void main(String[] args) {
        String address = "1.1.1.1";

        DefangingAnIPAddress ip = new DefangingAnIPAddress();

        ip.defangIPaddr(address);
    }
}
