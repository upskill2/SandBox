package course;

import java.util.ArrayList;

public class TreeLevelByLevel {

    static class Tree{
        int data;
        Tree left;
        Tree right;
        Tree(int data){this.data = data; this.left = null; this.right = null;}
        Tree(int data, Tree left, Tree right){this.data = data; this.left = left; this.right = right;}
    }

    public void bfs(Tree root){
        ArrayList<Tree> queue = new ArrayList<>();
        queue.add(root);
        int i = 0;
        while(i < queue.size()){
            Tree poppedNode = queue.get(i++);
            if(poppedNode == null) continue;
            else{
                System.out.println(poppedNode.data);
                queue.add(poppedNode.left);
                queue.add(poppedNode.right);
            }
        }
           }

    public static void main(String[] args) {
        TreeLevelByLevel ex = new TreeLevelByLevel();


        Tree root1 = new Tree(5);
        Tree eight1 = new Tree(10);
        Tree therteen1 = new Tree(3);
        Tree two1 = new Tree(4);
        Tree seven1 = new Tree(6);
        Tree one1 = new Tree(1);
        Tree five1 = new Tree(5);

        root1.left = eight1;
        eight1.left = two1;
        eight1.right = one1;

        two1.left = seven1;

        root1.right = therteen1;
        therteen1.left = five1;

        ex.bfs(root1);
        System.out.println();

    }
}
