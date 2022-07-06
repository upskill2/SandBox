package leetcode;

public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {

        int count = 0;
        int depth =0;

        for (char ch : s.toCharArray()) {
            if(ch=='('){
                count++;
                depth = Math.max(depth,count);
            } else if(ch==')'){
                count--;
            }
        }

        return depth;
    }

    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses per = new MaximumNestingDepthOfTheParentheses();

        String s = "(1+(2*3)+((8)/4))+1";
        String s1 = "(1)+((2))+(((3)))";


        per.maxDepth(s);
        per.maxDepth(s1);
    }

}
