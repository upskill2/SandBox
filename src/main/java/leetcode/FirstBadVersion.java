package leetcode;

public class FirstBadVersion extends VersionControl {


    public int firstBadVersion(int n) {

        long highBound = n;
        long lowBound = 1;
        long mid = 0;
        long result = 0;

        while (lowBound <= highBound) {

            mid = (lowBound + highBound) / 2;

            if (isBadVersion((int) mid)) { //7+1 /2 = 4
                highBound = mid - 1;
            } else
            lowBound=mid+1;
            result = lowBound;

        }
        return (int) result;
    }

    public static void main(String[] args) {
        FirstBadVersion fbv = new FirstBadVersion();
        int n = 8;

        System.out.println(fbv.firstBadVersion(n));
    }

}
