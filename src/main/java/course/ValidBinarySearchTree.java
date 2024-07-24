package course;

public class ValidBinarySearchTree {

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    static boolean isBst(Tree root, int min, int max){
        if(root == null)
            return true;
        else if(root.data <= min || root.data >= max)
            return false;
        else
            return isBst(root.left, min, root.data) && isBst(root.right, root.data, max);
    }

    static boolean isBst(Tree root){
        return isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }


    public static void main(String[] args) {
        Tree root = new Tree(6);
        root.left = new Tree(3);
    /*    root.right = new Tree(22);

        root.left.left = new Tree(3);
        root.left.right = new Tree(11);


        root.left.left.left = new Tree(4);
        root.left.left.right = new Tree(6);*/

        ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
        System.out.println(validBinarySearchTree.isBst(root));
    }
}
