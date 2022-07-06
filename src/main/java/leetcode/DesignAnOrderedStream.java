package leetcode;

import java.util.*;

public class DesignAnOrderedStream {

    TreeMap<Integer, String> myMap;
    int idx;

    public DesignAnOrderedStream(int n) {
        this.idx = 1;
        this.myMap = new TreeMap<>();

    }

    public List<String> insert(int idKey, String value) {

        List<String> res = new ArrayList<>();
        
        myMap.put(idKey, value);


/*        while (map.containsKey(index))
            result.add(map.get(index++));*/

        if(myMap.containsKey(idx)){

            Iterator it = myMap.entrySet().iterator();

            while (it.hasNext()){
                Map.Entry<Integer,String> pair = (Map.Entry)it.next();

                if(pair.getKey()==idx){
                            res.add(pair.getValue());
                            it.remove();
                            idx++;
                } else{
                    break;
                }

            }
        }



        return res;

    }

    public static void main(String[] args) {
        DesignAnOrderedStream des = new DesignAnOrderedStream(5);

        des.insert(3, "ccccc");
        des.insert(1, "aaaaa");
        des.insert(2, "bbbbb");
        des.insert(5, "eeeee");
        des.insert(4, "ddddd");

    }

}
