package leetcode;

public class GoalParserInterpretation {

    public String interpret(String command) {

        StringBuilder res = new StringBuilder();
        int idx = 0;

        String s = command.replace("()","o").replace("(al)","al");

        while (idx < command.length()){
            if(command.charAt(idx)=='('){
                idx++;
                if(command.charAt(idx)==')'){
                    res.append("o");
                    idx++;
                } else {
                    res.append("al");
                    idx +=3;
                }

            } else {
                res.append("G");
                idx++;
            }

        }


            return res.toString();
    }

    public static void main(String[] args) {
        GoalParserInterpretation g = new GoalParserInterpretation();

        String command = "G()(al)";
        String command1 = "G()()()()(al)";
        String command2 = "(al)G(al)()()G";

        g.interpret(command);
        g.interpret(command1);
        g.interpret(command2);
    }
}
