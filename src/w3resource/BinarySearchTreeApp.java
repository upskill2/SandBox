package w3resource;

    class Node {


    int data;
    Node left;
    Node right;
    boolean root;

    }



    class BinarySearchTree {

        public Node insert (Node node, int val, boolean root){

            if(node==null && root==true ){
                return CreateNewNodeWithparent(val);
            }

            if(node==null && root==false ){
                return CreateNewNode(val);
            }

            if(val < node.data){
                node.left = insert(node.left,val,root);
            }
            else if(val > node.data)
            {
                node.right = insert(node.right, val,root);
            }
            return node;
        }



        private Node CreateNewNode(int k) {
            Node a = new Node();
            a.data = k;
            a.left = null;
            a.right = null;
            a.root = false;
            return a;

        }

        private Node CreateNewNodeWithparent(int k) {
            Node a = new Node();
            a.data = k;
            a.left = null;
            a.right = null;
            a.root = true;
            return a;

        }

        public boolean ContainsReccursive (Node current, int value){
            

            if( current== null){
                return false;
            }

           if(value== current.data)
           {
               return true;
           }

           return value < current.data
                   ? ContainsReccursive(current.left, value)
                   : ContainsReccursive(current.right, value);

        }



 /*       public boolean ContainsNode (int value) {

               return ContainsReccursive(Node current, value);
        }*/


    }


    public class BinarySearchTreeApp {

        public static void main(String[] args) {
            BinarySearchTree a = new BinarySearchTree();
            Node root = null;
            root = a.insert(root, 8,true);
            root = a.insert(root, 3,false);
            root = a.insert(root, 15,false);
            root = a.insert(root, 1,false);


       //    System.out.println(a.ContainsNode(8));


        }

    }

