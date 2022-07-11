package leetcode;

import java.util.*;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> queue = new LinkedList<>();

        for (int e : students) {
            queue.offer(e);
        }
        int idx = 0;
        int sandw = sandwiches[idx];

        while (queue.contains(sandw)) {
            int stud = queue.poll();

            if (sandw != stud) {
                queue.offer(stud);
            } else {
                idx++;
            }
            sandw = queue.isEmpty() ? 0 : sandwiches[idx];


        }


        return queue.size();
    }

    public static void main(String[] args) {
        NumberOfStudentsUnableToEatLunch nm = new NumberOfStudentsUnableToEatLunch();

        int[] students = {1, 1, 0, 0}, sandwiches = {0, 1, 0, 1};

        int[] students1 = {1, 1, 1, 0, 0, 1}, sandwiches1 = {1, 0, 0, 0, 1, 1};

        nm.countStudents(students, sandwiches);
        nm.countStudents(students1, sandwiches1);
    }
}
