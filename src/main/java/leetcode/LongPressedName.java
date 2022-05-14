package leetcode;

public class LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int nameIdx = 0;
        int typedIdx = 0;

        while (typedIdx < typed.length()) {  //  name = "pyplrz", typed7 = "ppyypllr";
            if (typed.charAt(0) != name.charAt(0) || name.length() > typed.length()) {
                return false;
            } else if (nameIdx < name.length() && typed.charAt(typedIdx) == name.charAt(nameIdx)) {
                typedIdx++;
                nameIdx++;
            } else if (typed.charAt(typedIdx) == typed.charAt(typedIdx - 1)) {
                typedIdx++;
            } else return false;
        }
        if (nameIdx < name.length()) {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {

        String name = "alex", typed = "aaleex";

        new LongPressedName().isLongPressedName(name, typed);
    }

}