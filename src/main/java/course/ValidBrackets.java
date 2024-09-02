package course;

import java.util.HashMap;
import java.util.Objects;
import java.util.Stack;

public class ValidBrackets {
    public static boolean isValid(String str) {


        HashMap<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put('(', ')');
        bracketsMap.put('{', '}');
        bracketsMap.put('[', ']');
       Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (bracketsMap.containsKey(ch)) {
                stack.push(ch);
            } else {
                if(stack.isEmpty()) return false;
                Character pop = stack.pop();
                if (!Objects.equals(bracketsMap.get(pop), (ch))) {
                    return false;
                }
            }
       }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidBrackets validBrackets = new ValidBrackets();
        validBrackets.isValid("()");
      /*  validBrackets.isValid("{(})");
        validBrackets.isValid("{()}");
        validBrackets.isValid("{(})");
        validBrackets.isValid("");*/

    }
}
