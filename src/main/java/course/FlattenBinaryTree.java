package course;

public class FlattenBinaryTree {

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

    public void flattenTree(Tree root) {
        if (root == null) return;
        else {
            flattenTree(root.left);
            flattenTree(root.right);
            Tree rightSubtree = root.right;
            root.right = root.left;
            root.left = null;
            Tree temp = root;
            while (temp.right != null)
                temp = temp.right;
            temp.right = rightSubtree;
        }
    }
}

