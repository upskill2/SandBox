package leetcode;

import java.util.Arrays;

public class DesignHashSet {

    private int[] set;


    public DesignHashSet() {
        int[] set =  new int[0];
        this.set =set;

    }

  public void add(int key) {
        if(contains(key)==false){
        increaseSize();
        set[set.length-1]=key;
        }
    }

    public void remove(int key) {
        if(contains(key)==true){  // {1, 2, 3} remove 2
            int idx=findIndex(key);
            for (int i = idx+1; i < set.length ; i++) {
                set[i-1]=set[i];
            } set[set.length-1]=key;

       set= Arrays.copyOf(set,set.length-1);
        }
    }

        //Utils
    public boolean contains(int key) {

        for (int k: set) {
            if(key==k){return true;} }
    return false;
    }

    public int findIndex(int val){
        for (int i = 0; i < set.length; i++) {
            if(set[i]==val){
                return i;
            }
        }
        return -1;
    }

    public int[] increaseSize(){
        set = Arrays.copyOf(set, set.length+1);
        return set;
    }

    public static void main(String[] args) {

        DesignHashSet myHashSet = new DesignHashSet();

        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(1); // return True
        myHashSet.contains(3); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        myHashSet.contains(2); // return True
        myHashSet.remove(2);   // set = [1]
        myHashSet.contains(2); // return False, (already removed)



    }
}


