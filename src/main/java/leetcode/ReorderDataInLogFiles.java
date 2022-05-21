package leetcode;

import java.util.*;

public class ReorderDataInLogFiles {

    public String[] reorderLogFiles(String[] logs) {

        Comparator<String> myComparator = new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {

                String[] split1 = o1.split("\s", 2);
                String[] split2 = o2.split("\s", 2);

                boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
                boolean isDigit2 = Character.isDigit(split2[1].charAt(0));

                if (!isDigit1 && !isDigit2) {
                    int compContext = split1[1].compareTo(split2[1]);
                    if (compContext != 0) {
                        return compContext;
                    }
                    return split1[0].compareTo(split2[0]);
                }

                if (!isDigit1 && isDigit2) {
                    return -1;
                } else if (isDigit1 && !isDigit2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };


        Arrays.sort(logs, myComparator);

        return logs;
    }

    public static void main(String[] args) {
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] logs0 = {"g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7"};
        String[] logs1 = {"dig1 8 1 5 1", "let1 art zero can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] logs2 = {"as let1 a", "as let3 a", "as let2 a"};

        //   new ReorderDataInLogFiles().reorderLogFiles(logs);
        //    new ReorderDataInLogFiles().reorderLogFiles(logs0);
        new ReorderDataInLogFiles().reorderLogFiles(logs1);
        //  new ReorderDataInLogFiles().reorderLogFiles(logs2);
    }
}

