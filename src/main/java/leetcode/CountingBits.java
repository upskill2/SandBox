package leetcode;

import java.util.Arrays;

public class CountingBits {

    public int[] countBits(int n) {

         int[] result = new int[n+1];

         String s= "";

        for (int i = 0; i < n+1; i++) {
            s = Integer.toBinaryString(i);

           int k = 0;
           int sum = 0;
            while ( k < s.length()){
                sum +=s.charAt(k)=='1' ? 1 :0 ;
                k++;
            }
            result[i]=sum;
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 5;

        CountingBits bits = new CountingBits();

        System.out.println(Arrays.toString(bits.countBits(5)));
        System.out.println(Integer.toBinaryString(5));
    }

}
