package leetcode;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {

        int res = 0;
        int temp = 0;

        for (int i = 0; i < gain.length; i++) {
            temp += gain[i];

            res=Math.max(temp,res);
        }

        return  res;
    }

    public static void main(String[] args) {
        FindTheHighestAltitude d = new FindTheHighestAltitude();

        int[] gain = {-5,1,5,0,-7};

        d.largestAltitude(gain);
    }
}
