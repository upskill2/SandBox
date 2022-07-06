package leetcode;

import java.util.*;

public class DefuseTheBomb {
    public int[] decrypt(int[] code, int k) {

        if (k == 0) {
            return new int[code.length];
        } else if (k > 0) {
            Queue<Integer> queue = new LinkedList<>();

            for (int value : code) {
                queue.add(value);
            }

            queue.add(queue.poll()); //offer

            for (int i = 0; i < code.length; i++) {

                int sum = 0;
                int idx = 0;

                while (idx < k) {
                    int el = queue.poll();
                    queue.add(el);
                    sum += el;

                    idx++;
                }

                code[i] = sum;

                for (int j = 0; j < code.length-k+1; j++) {
                    queue.add(queue.poll());
               }

            }

        } else {
            Deque<Integer> deque = new ArrayDeque<>();

            for (int value : code) {
                deque.push(value);
            }

            for (int i = 0; i < code.length; i++) {
                int sum = 0;
                int idx = 0;

                while (idx < -k) {
                    int el = deque.pop();

                    deque.addLast(el);
                    sum += el;

                    idx++;
                }

                code[i] = sum;

                for (int j = 0; j < code.length+k-1; j++) {
                    deque.addLast(deque.pop());
                }

            }

        }

        return code;
    }

    public static void main(String[] args) {
        DefuseTheBomb def = new DefuseTheBomb();

        int[] code = {5, 7, 1, 4};
        int k = 3;

        int[] code1 = {5, 7, 1, 4};
        int k1 = 0;

        int[] code2 = {2, 4, 9, 3};
        int k2 = -2;


        int[] code3 = {5, 2, 2, 3, 1};
        int k3 = 3;

        int[] code4 = {10,5,7,7,3,2,10,3,6,9,1,6};
        int k4 =-4;


         // def.decrypt(code, k);
        //  def.decrypt(code1, k1);
         def.decrypt(code2, k2);
       //     def.decrypt(code3, k3);
            def.decrypt(code4, k4);
    }

}
