package testtasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class JavaTask implements JavaTaskInterface {

    List<Integer> list;
    int target;

    public JavaTask(List<Integer> list, int target) {
        this.list = list;
        this.target = target;
    }

    public JavaTask() {
    }

    public int countPairs(List<Integer> list, int target) {

        HashMap<Integer, Integer> myMap = new HashMap<>();
        int count = 0;

        //1.1
        //Time Complexity: O(n), to iterate over the array
        //Auxiliary Space: O(n), to make a map of size n

        //1.6 if to integrate another parameter - how many numbers should be totalled
        //solution (the best data structure) depends on data, the collection has:
        // are the dupes, negatives, sorted or not, max collection size
        // form what I see, the current solution will not work
        //if just to add in countPairs() another parameter and integrate

        for (int i = 0; i < list.size(); i++) {
            int element = list.get(i);
            int diff = target - element;

            if (myMap.containsKey(diff)) {
                // 1.2 handling dupes
                if (!myMap.containsKey(element)) {
                    count++;
                }
            }
            myMap.put(element, diff);


        }

        //1.3 When using map, sorting doesn't matter. However, depends on a data structure
        // If, for example, list has only positive ints and solution is done using a loop
        // we might minimize iteration
        return count;
    }

    //1.4. Fot time saving purposes, to be within 2h of time, I omitted tests for this functionality
    @Override
    public int addNumber(int n) {
        list.add(n);

        int idx = list.size() - 1;
        System.out.format("Number %d is added into the list", idx);

        return idx;
    }

    //1.4. Fot time saving purposes, to be within 2h of time, I omitted tests for this functionality
    @Override
    public int findValue(int target) {

        for (int s : list) {
            if (s == target) {
                System.out.format("Number %d is found in the list", target);
                return target;
            }

        }
        System.out.format("Number %d is Not found in the list", target);
        return -1;
    }

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

}
