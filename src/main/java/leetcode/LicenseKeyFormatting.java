package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LicenseKeyFormatting {

    public String licenseKeyFormatting(String s, int k) {

        String sResult = s.replaceAll("\\-", ""); //k=2
        List<String> list = new ArrayList<>();
        if (sResult.length() % k == 0) {
            Loop(k, sResult, list, 0);

        } else {
            list.add(sResult.substring(0, Math.min(sResult.length(), sResult.length() % k)));
            Loop(k, sResult, list, sResult.length() % k);
        }


        String resTemp = String.join("-", list);
        String result = resTemp.toUpperCase();

        System.out.println(list.toString());
        return result;
    }

    public static void Loop(int k, String sResult, List<String> list, int i2) {
        for (int i = i2; i < sResult.length(); i += k) {
            list.add(sResult.substring(i, Math.min(sResult.length(), i + k)));
        }
    }

    public static void main(String[] args) {
        LicenseKeyFormatting lk = new LicenseKeyFormatting();

        String s = "2-5g-3-J";
        int k = 2;

        lk.licenseKeyFormatting(s, k);
    }

}
