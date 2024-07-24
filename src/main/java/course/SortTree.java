package course;

public class SortTree {
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

    public void reverseTree(Tree root) {
        if (root == null) {
            return;
        }

        Tree temp = root.right;
        root.right = root.left;
        root.left = temp;

        reverseTree(root.right);
        reverseTree(root.left);


    }


    public static void main(String[] args) {
        SortTree ex = new SortTree();
       /* Tree root = new Tree(1);
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

        ex.reverseTree(root);
        System.out.println();*/

        Tree root1 = new Tree(6);
        Tree eight1 = new Tree(8);
        Tree therteen1 = new Tree(13);
        Tree two1 = new Tree(2);
        Tree seven1 = new Tree(7);
        Tree one1 = new Tree(1);
        Tree five1 = new Tree(5);

        root1.left = eight1;
        eight1.left = two1;
        eight1.right = one1;

        two1.left = seven1;

        root1.right = therteen1;
        therteen1.left = five1;

        ex.reverseTree(root1);
        System.out.println();

    }


}
