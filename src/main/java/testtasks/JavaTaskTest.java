package testtasks;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaTaskTest {

    @Test
    public void testJavaTask() {

        //test with dupes
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 2, 3));
        int target = 5;

        List<Integer> list1 = new ArrayList<>(List.of(5, 4, 1, 6, 2));
        int target1 = 8;

        List<Integer> list2 = new ArrayList<>(List.of(1, 2));
        int target2 = 2;

        //test with negative numbers
        List<Integer> list3 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 8, -5, 10, -1));
        int target3 = 5;

        JavaTask jt = new JavaTask();
        int res = jt.countPairs(list, target);
        int res1 = jt.countPairs(list1, target1);
        int res2 = jt.countPairs(list2, target2);
        int res3 = jt.countPairs(list3, target3);


        assertEquals(2, res);
        assertEquals(1, res1);
        assertEquals(0, res2);
        assertEquals(4, res3);


    }

}
