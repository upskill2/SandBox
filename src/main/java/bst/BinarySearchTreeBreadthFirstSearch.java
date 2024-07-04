package bst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


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

        for (int i = idx+1; i < integers.size(); i++) {
            if (integers.get(i) < value) {
                return false;
            }
        }
        return true;
    }



}
