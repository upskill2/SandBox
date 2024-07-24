package course;

public class TreePreOrder {
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

    public void dfsPreorder(Tree root) {
        if (root == null) return;

        System.out.println((root.data));
        dfsPreorder(root.left);
        dfsPreorder(root.right);
    }

    public void dfsInorder(Tree root) {
        if (root == null) return;

        dfsInorder(root.left);
        System.out.println((root.data));
        dfsInorder(root.right);
    }

    public void dfsPostorder(Tree root) {
        if (root == null) return;

        dfsPostorder(root.left);
        dfsPostorder(root.right);
        System.out.println((root.data));
    }

    public Tree traverseLeft(Tree root) {
        if (root.left == null) return root;
        return traverseLeft(root.left);
    }

    public static void main(String[] args) {
        TreePreOrder ex = new TreePreOrder();
        Tree root = new Tree(1);
        Tree two = new Tree(2);
        Tree four = new Tree(4);
        Tree five = new Tree(5);
        Tree three = new Tree(3);
        Tree six = new Tree(6);
        Tree seven = new Tree(7);

        root.left = two;
        two.left = four;
        two.right = five;

        root.right = three;
        three.left = six;
        three.right = seven;

        ex.dfsPreorder(root);
        System.out.println("----------------------------");
        ex.dfsInorder(root);
        System.out.println("----------------------------");
        ex.dfsPostorder(root);
    }

}
