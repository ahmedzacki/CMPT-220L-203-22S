package com.CodeWithMe;

public class BST {
    Node root;

    BST(){
        root = null;
    }

    public void insertKey(int value){
        root = insert(root, value);
    }

    // Here, Let's create a function to insert elements in the BST that will return a Node

    public Node insert(Node root, int value){
        if(root == null){
            return createNewNode(value);
        }
        if(value < root.data){
            root.left = insert(root.left, value);
        } else if(value > root.data){
            root.right = insert(root.right, value);
        }
        return root;
    }

    //Here we are creating the new Node if the root is empty
    public Node createNewNode(int newVal){
        Node s = new Node(newVal);
        s.data = newVal;
        s.left = null;
        s.right = null;
        return s;
    }
        //The following 6 functions Demonstrate the Tree Traversals and I am using Depth-first-search technique
    //the following function calls the inorder function to list the elements of the tree in the order of (left-root-right)

    public void listInOrder() {
        inOrder(root);
    }

    // recursively traverse the BST
    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    //The following functions calls the preOrder function and lists the elements in the tree in preOrder format (root-left-right)
    public void listPreOrder(){
        preOrder(root);
    }
    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    // The following function calls the postOrder function and then  list the elements in the BST in the Post-Order format
    public void listPostOrder(){
        postOrder(root);
    }

    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    //this function deletes any chosen value and rearranges the tree in in-order form.
    public void deleteNode(int value){
        root = delete(root, value);
    }

    public Node delete(Node root, int value){
        if(root == null){
            System.out.println(" Tree is Empty");
        }
        if(value < root.data){
            root.left = delete(root.left, value);
        }
        else if(value > root.data){
            root.right = delete(root.right, value);
        }
        else {
            if(root.left == null){
                return  root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            root.data = minRightSubtree(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    //the following function searches the minimum value/successor of the deleted node.
    int minRightSubtree(Node node){
        int min = node.data;
        while(node.left != null){
            min = node.left.data;
            node = node.left;
        }
        return min;
    }
    // the following function searches an element in the tree and return either true or false
    public boolean search(int value){
        if(root == null){
            return false;
        }
        boolean isfound = false;

        while(root != null) {
            if(value < root.data) {
                root = root.left;
            } else if(value > root.data) {
                root = root.right;
            } else {
                isfound = true;
                break;
            }
        }
        return isfound;
    }
    // The following functions traverses the left side of the tree finds the smallest Element

    public int minVal(){
        Node minimum = root;
        if(minimum == null){
            System.out.println("Tree is empty");
        } while (minimum.left != null){
            minimum = minimum.left;
        }
        return minimum.data;
    }

    // The following function traverses the right side of the tree and finds the Max value
    public int maxVal(){
        Node maximum = root;
        if(maximum == null){
            System.out.println("Tree is empty");
        } while (maximum.right != null){
            maximum = maximum.right;
        }
        return maximum.data;
    }

}

