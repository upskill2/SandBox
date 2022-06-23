package leetcode;

public class NumberOfStudentsDoingHomeworkAtAGivenTime {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        int count = 0;
        for (int i = 0; i < endTime.length; i++) {
            if (endTime[i] >= queryTime && startTime[i]<=queryTime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumberOfStudentsDoingHomeworkAtAGivenTime uyt = new NumberOfStudentsDoingHomeworkAtAGivenTime();

        int[] startTime = {1, 2, 3}, endTime = {3, 2, 7};
        int queryTime = 4;

        int[] startTime1 = {9, 8, 7, 6, 5, 4, 3, 2, 1}, endTime1 = {10, 10, 10, 10, 10, 10, 10, 10, 10};
        int queryTime1 = 5;

        uyt.busyStudent(startTime, endTime, queryTime);
        uyt.busyStudent(startTime1, endTime1, queryTime1);
    }
}
