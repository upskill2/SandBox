package course;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {


    public int[] removeDuplicates(int[] arr) {

    Set<Integer> set = Arrays.stream(arr)
            .boxed()
            .collect(Collectors.toSet());

    return set.stream()
            .mapToInt(Integer::intValue)
            .toArray();

    }
}
