package bst;

import java.util.*;


public class BinarySearchTreeBreadthFirstSearch {

    public Node root;

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        private Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while (true) {
            if (newNode.value == temp.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        Node temp = root;
        while (temp != null) {
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;

        Queue<Node> queue = new LinkedList<>();
        queue.add(currentNode);
        ArrayList<Integer> results = new ArrayList<>();

        while (!queue.isEmpty()) {
            currentNode = queue.remove();
            results.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        DFSPreOrderHelper(root, results);
        return results;
    }

    private void DFSPreOrderHelper(Node currentNode, ArrayList<Integer> results) {
        if (currentNode == null) return;

        results.add(currentNode.value);
        DFSPreOrderHelper(currentNode.left, results);
        DFSPreOrderHelper(currentNode.right, results);
    }

    private class Traverse {
        private Node node;

        public Traverse(Node node) {
            this.node = node;
        }

    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        DFSPostOrderHelper(root, results);

        return results;

    }

    private void DFSPostOrderHelper(Node currentNode, ArrayList<Integer> results) {
        if (currentNode == null) return;

        results.add(currentNode.value);
        DFSPostOrderHelper(currentNode.left, results);
        DFSPostOrderHelper(currentNode.right, results);
    }

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> results = new ArrayList<>();
        DFSInOrder(root, results);

        return results;

    }

    private void DFSInOrder(Node currentNode, ArrayList<Integer> results) {
        if (currentNode == null) return;

        DFSInOrder(currentNode.left, results);
        results.add(currentNode.value);
        DFSInOrder(currentNode.right, results);
    }

    public boolean isValidBST() {
        final ArrayList<Integer> integers = DFSInOrder();
        int value = root.value;

        int idx = integers.indexOf(value);
        for (int i = 0; i < idx; i++) {
            if (integers.get(i) > value) {
                return false;
            }
        }

        for (int i = idx + 1; i < integers.size(); i++) {
            if (integers.get(i) < value) {
                return false;
            }
        }
        return true;
    }

    public Integer kthSmallest(int k) {
        if (root.left == null && root.right==null) return null;


        Stack<Node> stack = new Stack<>();
        Node current = root;

        kHelper(stack, current);

       /* while (current != null) {
            stack.push(current);
            current = current.left;
        }

        current = root.right;
        while (current != null) {
            stack.push(current);
            current = current.right;
        }*/

        int res = 0;
            for (int i = 0; i < k; i++) {
                res = stack.pop().value;
            }


        return res;
    }

    public Integer kthSmallestCorrect(int k) {
        Stack<Node> stack = new Stack<>();
        Node node = this.root;

        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            k -= 1;
            if (k == 0) {
                return node.value;
            }
            node = node.right;
        }
        return null;
    }

    private void kHelper(Stack<Node> stack, Node currentNode) {

        if (currentNode == null) return;
        kHelper(stack, currentNode.left);
        stack.push(currentNode);
        kHelper(stack, currentNode.right);

    }

    public static void main(String[] args) {
        BinarySearchTreeBreadthFirstSearch bst = new BinarySearchTreeBreadthFirstSearch();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println( bst.kthSmallest(3));


    }


}
