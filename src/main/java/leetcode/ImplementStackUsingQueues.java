package leetcode;

import java.util.*;

public class ImplementStackUsingQueues {

    class MyStack {

        Queue<Integer> q1 = new LinkedList<Integer>();
        Queue<Integer> q2 = new LinkedList<Integer>();
        private int top;


        public void push(int x) {
            q1.add(x);
            top = x;

        }

        public int pop() {
            while (q1.size() > 1) {
                q2.add(q1.poll());

            }
            int result = q1.poll();
            q1.addAll(q2);

            while (q2.size() > 0) {
                top = q2.poll();
            }

            return result;

        }

        public int top() {
            return top;
        }

        public boolean empty() {
            return q1.size() == 0;

        }

    }

    public static void main(String[] args) {
        ImplementStackUsingQueues is = new ImplementStackUsingQueues();
        ImplementStackUsingQueues.MyStack mystack = is.new MyStack();


        mystack.push(1);
        mystack.push(2);
        System.out.println("pop is " + mystack.pop());
        System.out.println("top is " + mystack.top);


//       System.out.println(mystack.empty());
        //  System.out.println("Final Stack is " + mystack.q1);
        //  System.out.println(mystack.q2);
        //  System.out.println("new top is " + mystack.top);


    }

}


