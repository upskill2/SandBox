package leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentAttendanceRecordI {

    public static void processLChar(HashMap<Character, Integer> map, int idx, String s) {

        if (map.containsKey('L') && map.get('L') == 3
          ) { return;
        } else if (idx == 0) {
            map.put(s.charAt(idx), map.getOrDefault(s.charAt(idx), 0) + 1);
        } else if (s.charAt(idx - 1) == 'L') {
            map.put(s.charAt(idx), map.getOrDefault(s.charAt(idx), 0) + 1);
        } else map.put(s.charAt(idx), 1);
    }

    public boolean checkRecord(String s) {


        HashMap<Character, Integer> map = new HashMap<>();

        int idx = 0;
        while (idx < s.length()) {
            if (s.charAt(idx) == 'L') {
                processLChar(map, idx, s);
            } else map.put(s.charAt(idx), map.getOrDefault(s.charAt(idx), 0) + 1);
            idx++;
        }

        if (map.containsKey('A') && map.get('A') > 1 || map.containsKey('L') && map.get('L') > 2) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "PPALLP";
        String s1 = "LALL";
        String s2 = "PPALLL";
        String s3 = "LLLALL";
        //  new StudentAttendanceRecordI().checkRecord(s);
        //  new StudentAttendanceRecordI().checkRecord(s1);
        // new StudentAttendanceRecordI().checkRecord(s2);
        new StudentAttendanceRecordI().checkRecord(s3);
    }


}
