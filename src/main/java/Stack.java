import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Stack<T> {

    private ArrayList<T> stackList = new ArrayList<>();

    public ArrayList<T> getStackList() {
        return stackList;
    }

    public void printStack() {
        for (int i = stackList.size() - 1; i >= 0; i--) {
            System.out.println(stackList.get(i));
        }
    }

    public boolean isEmpty() {
        return stackList.size() == 0;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return stackList.get(stackList.size() - 1);
        }
    }

    public int size() {
        return stackList.size();
    }

    public static void sortStack(Stack<Integer> stack) {

        Stack<Integer> sorted = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!sorted.isEmpty() && sorted.peek() > temp) {
                stack.push(sorted.pop());
            }

            sorted.push(temp);
        }


        while (!sorted.isEmpty()) {
            stack.push(sorted.pop());
        }
    }


    public void push(T value) {
        stackList.add(value);
    }

    public T pop() {
        if (stackList.size() == 0) return null;

        int index = stackList.size() - 1;
        T obj = stackList.get(index);
        stackList.remove(index);


        return obj;
    }

    public static boolean isBalancedParentheses(String s) {

        char l = '(';
        char r = ')';

        Stack<Character> left = new Stack<>();
        Stack<Character> right = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == l) {
                if (!right.isEmpty()) {
                    right.pop();
                } else {
                    left.push(l);
                }
            } else {
                if (!left.isEmpty()) {
                    left.pop();
                } else {
                    right.push(l);
                }
            }
        }
        return left.size() == right.size();
    }

    public String reversedString(String s) {
        ArrayList<Character> stack = new ArrayList<>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            stack.add(c);
        }


        return IntStream
                .iterate(stackList.size() - 1, i -> i < 0, i -> i - 1)
                .mapToObj(i -> String.valueOf(stackList.get(i))).collect(Collectors.joining());
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting:");
        stack.printStack();

        sortStack(stack);

        System.out.println("\nAfter sorting:");
        stack.printStack();

    }

}
