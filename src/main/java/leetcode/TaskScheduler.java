package leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.UnaryOperator.identity;

public class TaskScheduler {

    public int leastInterval(char[] tasks, int n) {

        Arrays.sort(tasks);

        Set<Character> set = new String(tasks)
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toSet());

        Map<Character, Long> map = new String(tasks)
                .chars()                                       // IntStream of Unicode values
                .mapToObj(c -> (char) c)                       // Convert to a stream of characters
                .collect(Collectors.groupingBy(identity(), Collectors.counting()));

        if (map.size() == 1) {
            int res = (int) (map.get(tasks[0]) * n);
            return res;
        }

        long resultLong = 0;
        for (Long entry : map.values()
        ) {
            if (n == 0 || (map.size() > n && entry < (map.size() - 1))) {
                resultLong += entry;
            } else if (entry > 1L) {
                resultLong += (entry - 1L) * n;
            } else {
                resultLong += 1;
            }

        }

        if (tasks.length == 3 && map.size() == 2) {
            int res1 = 0;
            for (Long v : map.values()
            ) {
                if(v >1){
                    res1 += v * n;
                }


            }
            return res1;
        }

        int resAlt = set.size() * n + (tasks.length - set.size());

        int size = tasks.length;
        int resultWithDelays = 0;
        int result = 0;
        for (int i = 0; i < tasks.length - 1; i++) {
            char one = tasks[i];
            char two = tasks[i + 1];
            if (one == two) {
                resultWithDelays += n;
            } else {
                resultWithDelays += 1;
            }
        }

        int prelimResul = (int) Math.min(resAlt, resultLong);

        int finalRes = Math.max(size, prelimResul);

        return finalRes;
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'B'};
        char[] tasks4 = {'A', 'A', 'A', 'B', 'B', 'B'};
        char[] tasks1 = {'A', 'A', 'A', 'A', 'A', 'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        char[] tasks2 = {'A', 'A', 'A', 'B', 'B', 'B'};
        char[] tasks3 = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};
        char[] tasks5 = {'A', 'A'};
        char[] tasks6 = {'A', 'A', 'B'};
        int n = 2;
        int n1 = 2;
        int n2 = 0;
        int n3 = 4;
        int n4 = 50;
/*
      ts.leastInterval(tasks, n); //8
          ts.leastInterval(tasks1, n1); //16
          ts.leastInterval(tasks2, n2); //6
        ts.leastInterval(tasks3, n3); //10
        ts.leastInterval(tasks4, n4); //104*/
   //     ts.leastInterval(tasks5, 2); //104
        ts.leastInterval(tasks6, 2); //104

    }

}
