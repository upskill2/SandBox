package bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeInvert {

    private Node root;

    class Node {
        public int value;
        public Node left;
        public Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public Node getRoot() {
        return root;
    }

    private Node insert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);

        if (value < currentNode.value) {
            currentNode.left = insert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode.right = insert(currentNode.right, value);
        }
        return currentNode;
    }

    public void insert(int value) {
        if (root == null) root = new Node(value);
        insert(root, value);
    }

    public ArrayList<Integer> BFS() {
        Node currentNode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();
        if (currentNode != null) {
            queue.add(currentNode);
        }

        while (queue.size() > 0) {
            currentNode = queue.remove();
            if (currentNode != null) {
                results.add(currentNode.value);
                queue.add(currentNode.left);
                queue.add(currentNode.right);
            }
        }
        return results;
    }

    public void invert() {
        root = invertTree(root);
    }

    private Node invertTree(Node node) {
        if (node == null) return null;

        Node temp = node.left;
        Node right = node.right;
        Node left = node.left;

         node.left =
        invertTree(right);
           node.right =
        invertTree(temp);


        return node;
    }

    //   +===================================================+
    //   |              WRITE YOUR CODE HERE                 |
    //   | Description:                                      |
    //   | - Inverts a binary tree by swapping the left and  |
    //   |   right children of all nodes in the tree.        |
    //   | - This method is private and intended for internal|
    //   |   use within the class.                           |
    //   | - It operates recursively, visiting each node and |
    //   |   swapping its children.                          |
    //   |                                                   |
    //   | Parameters:                                       |
    //   | - node: The current node to process.              |
    //   |                                                   |
    //   | Return:                                           |
    //   | - The node after its subtree has been inverted.   |
    //   |                                                   |
    //   | Tips:                                             |
    //   | - The base case for the recursion is when the     |
    //   |   method encounters a null node.                  |
    //   | - A temporary node is used to facilitate the swap |
    //   |   of the left and right children.                 |
    //   +===================================================+
}
