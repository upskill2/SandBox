package leetcode;

import java.util.Arrays;

public class ThousandSeparator {

    public String thousandSeparator(int n) {

        StringBuilder temp = new StringBuilder(String.valueOf(n));
        temp.reverse();

        String[] ar = temp.toString().split("(?<=\\G.{3})");




        String res = "";
        String res1 = "";

        String last = new StringBuilder(ar[0]).reverse().toString();

        for (String s : temp.toString().split("(?<=\\G.{3})")
             ) { res1 += s +".";

        }

        StringBuilder temp111 = new StringBuilder(new StringBuilder(res1).reverse().substring(1, res1.length()));


            for (int i = ar.length-1; i > 0; i--) {

                StringBuilder sb = new StringBuilder(ar[i]).reverse();
                res += sb + ".";
            }



        return res+last;

    }

    public static void main(String[] args) {
        ThousandSeparator sep = new ThousandSeparator();

        int n = 1234;

        sep.thousandSeparator(n);
    }
}
