package leetcode;

import java.util.HashMap;
import java.util.Map;

public class VersionControl {

    boolean isBadVersion(int version) {

        Map<Integer, Boolean> mapVersion = new HashMap();

        mapVersion.put(1,false);
        mapVersion.put(2,true);
        mapVersion.put(3,true);
        mapVersion.put(4,true);
        mapVersion.put(5,true);
        mapVersion.put(6,true);
        mapVersion.put(7,true);
        mapVersion.put(8,true);

        if (mapVersion.containsKey(version)){
                return mapVersion.get(version);
        }


        return false;
    }

}
