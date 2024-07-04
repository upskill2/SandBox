import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class BinarySearchTree {

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

    public boolean insert(int value){
      List<String> lst = new LinkedList<>();
         Node[] dataMap = new Node[7];
         int l = dataMap.length;

        Node newNode = new Node(value);
        if(root==null){
            root = newNode;
            return true;
        }

        HashMap<Integer, Boolean> map = new HashMap<>();


        int index = "key".hashCode();
        Node temp = root;
        while(temp!=null){
            if(temp.value==value) return false;
            if(temp.value<value){
                if(temp.left==null){
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if(temp.right==null){
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(2);
        bst.insert(3);
        bst.insert(1);

    }

}