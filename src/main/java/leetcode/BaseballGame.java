package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.IntStream;

public class BaseballGame {

    public int calPoints(String[] ops) {

        Stack<Integer> record = new Stack<>();

        int top = 0;
        int topMinusOne = 0;

        for (String str : ops
             ) { if (str.matches("-?[0-9]+")) {
            record.push(Integer.parseInt(str));
//                sum += Integer.parseInt(ops[i]);
        } else if(str.matches("C")){
            record.pop();
        } else if(str.matches("D")){
            record.push(record.peek()*2);
        } else if (str.matches("\\+")){
            top = record.pop();
            topMinusOne = record.peek();
            record.push(top);
            record.push(topMinusOne+record.peek());
        }



        }
        int sum = record.stream()
                .mapToInt(Integer:: intValue).sum();

        return sum;
    }

    public static void main(String[] args) {

        String[] ops = {"-60","D","-36","30","13","C","C","-33","53","79"};
        new BaseballGame().calPoints(ops);
    }

}
