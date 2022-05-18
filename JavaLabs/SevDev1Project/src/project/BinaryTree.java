package project;

public class BinaryTree {

    Node root;

    // the following Recursive function and method will insert a value in the tree
            //Initializing an empty BST with root been empty
    BinaryTree(){
        root = null;
    }

    public  void insert(int key){
        root = insertKey(root, key);
    }

    public Node insertKey(Node root, int value){

        if(root == null){
            root = new Node();
            return root;
        }
        if(value < root.value){
            root.left = insertKey(root.left, value);
        } else if (value > root.value){
            root.right = insertKey(root.right, value);
        }
        return root;
    }
}
