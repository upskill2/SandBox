package leetcode;

import org.junit.platform.commons.util.StringUtils;

import java.util.Collections;

public class RearrangeSpacesBetweenWords {

    public String reorderSpaces(String text) {

        //   String s = text.replaceAll("^\\s+", "");//starting with whitespace one or more


        StringBuilder sb = new StringBuilder();

        int numberOfSpaces = (int) text.chars().filter(c -> c == (int) ' ').count();
        String[] split = text.replaceAll("^\\s+", "").split("\\s+");

        if(split.length!=1){

            int spaceSplit = numberOfSpaces / (split.length - 1);
            int spacesLeftToAdd = numberOfSpaces % (split.length - 1);

            for (int i = 0; i < split.length - 1; i++) {
                sb.append(split[i]).append(String.join("", Collections.nCopies(spaceSplit, "\s")));
            }

            sb.append(split[split.length-1]).append(String.join("", Collections.nCopies(spacesLeftToAdd,"\s")));
        } else {
            sb.append(split[0]).append(String.join("",Collections.nCopies(numberOfSpaces,"\s")));
        }


        //Stream.of(arr).collect(
        //Collectors.joining(" ".repeat(spacesBetween)))+(arr.length>1?" ".repeat(spacesAfter):" ".repeat(spacesBetween));

        return sb.toString();
    }

    public static void main(String[] args) {
        RearrangeSpacesBetweenWords rea = new RearrangeSpacesBetweenWords();

        String text = "  this   is  a sentence ";
        String text1 = " practice   makes   perfect";
        String text2 = "a";
        String text3 ="  hello";

    //    rea.reorderSpaces(text);
     rea.reorderSpaces(text1);
       rea.reorderSpaces(text2);
        rea.reorderSpaces(text3);
    }
}
