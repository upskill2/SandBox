package course;

public class RemoveNodeFromBinaryTree {

    static class Tree {
        int data;
        Tree left;
        Tree right;

        Tree(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

        Tree(int data, Tree left, Tree right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public Tree deleteNodeBst(Tree root, int num) {
        if (root == null) return null;
        if (root.data < num) {
            root.right = deleteNodeBst(root.right, num);
        } else if (root.data > num) {
            root.left = deleteNodeBst(root.left, num);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                int data = getMin(root.right);
                root.data = data;
                root.right = deleteNodeBst(root.right, data);
            }

        }

        return root;
    }

    private static int getMin(Tree root) {
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    public static void main(String[] args) {
        Tree root = new Tree(12);
        root.left = new Tree(3);
        root.right = new Tree(23);

        root.left.left = new Tree(2);
        root.left.right = new Tree(5);
        root.left.right.left = new Tree(4);
        root.left.right.right = new Tree(10);
        root.right.left = new Tree(23);
        root.right.right = new Tree(15);
        root.right.left.left = new Tree(38);

        RemoveNodeFromBinaryTree removeNodeFromBinaryTree = new RemoveNodeFromBinaryTree();
        removeNodeFromBinaryTree.deleteNodeBst(root, 5);

        System.out.println(root);

    }
}
