package course;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    public int findDuplicate(int[] arr){

        LinkedList list = new LinkedList(arr[0]);

        
        
        Set<Integer> set = new HashSet<>();
        for (int i: arr){
            if(set.contains(i)) return i;
            set.add(i);
        }
        return -1;
        // your code here
    }
}
