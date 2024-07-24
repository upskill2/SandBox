package course;


public class BalancedBinaryTree {

    public class Exercise {
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

        public boolean isBalanced(Tree root) {

            if (root == null) {
                return true;
            }

            int left = height(root.left);
            int right = height(root.right);

            return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);

            // your code here
        }

        private int height(Tree node) {
            if (node == null) {
                return 0;
            }
            return 1 + Math.max(height(node.left), height(node.right));
        }


    }

}
