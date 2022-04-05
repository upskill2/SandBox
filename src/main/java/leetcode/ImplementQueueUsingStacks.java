package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ImplementQueueUsingStacks {


    public class MyQueue {

        Stack<Integer> s1 = new Stack();
        Stack<Integer> s2 = new Stack();
        int result;
        int tail;
        public void push(int x) {

            if (s1.size() == 0) {
                tail = x;
            }
            s1.add(x);
        }

        public int pop() {  // {1, 2, 3, 4, 5 }  s2 = 5, 4, 3, 2
            if (s1.size() != 0) {

                if (s1.size() == 1) {
                    return s1.pop();
                }
                while (s1.size() > 1) {
                    s2.add(s1.pop());
                    tail = s2.peek();
                }
                result = s1.pop();
                while (s2.size() > 0) {
                    s1.add(s2.pop());
                }
                s2.clear();
            }
            return result;
        }

        public int peek() {
            return tail;
        }

        public boolean empty() {
            return s1.size() == 0;

        }

    }

    public static void main(String[] args) {

        ImplementQueueUsingStacks iss = new ImplementQueueUsingStacks();
        ImplementQueueUsingStacks.MyQueue myQueue = iss.new MyQueue();

        myQueue.push(1);
        myQueue.push(2);
        //   myQueue.push(3);
        //   myQueue.push(4);
        System.out.println("Pop is " + myQueue.pop());
        //  myQueue.push(5);
        //  System.out.println(myQueue.s1.empty());
        System.out.println("Peek is " + myQueue.peek());
        // System.out.println("Pop is " + myQueue.pop());
        // System.out.println("Pop is " + myQueue.pop());
        // System.out.println("Pop is " + myQueue.pop());
        // System.out.println("Pop is " + myQueue.pop());
        //  System.out.println(myQueue.s1.empty());
        // System.out.println(myQueue.s1);


    }

}
