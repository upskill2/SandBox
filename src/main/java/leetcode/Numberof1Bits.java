package leetcode;

public class Numberof1Bits {

    public int hammingWeight(int n) {

        String result = Integer.toBinaryString(n);
        String resultWithPadding = String.format("%32s", result).replaceAll(" ", "0");

        int index = 0;
        int countOnes = 0;

        while (index < resultWithPadding.length()) {

            if (resultWithPadding.charAt(index) == 49) {
                countOnes++;
            }

            index++;
        }

        System.out.println(resultWithPadding);

        return countOnes;
    }

    public static void main(String[] args) {
        Numberof1Bits nb = new Numberof1Bits();
        int n = 0B00000000000000000000000000001011;
        int n1 = 0B00000000000000000000000010000000;
        int n2 = 0B11111111111111111111111111111101;

        System.out.println(nb.hammingWeight(n));
        System.out.println(nb.hammingWeight(n1));
        System.out.println(nb.hammingWeight(n2));

    }

}
