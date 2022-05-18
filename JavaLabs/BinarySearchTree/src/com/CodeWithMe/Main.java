package com.CodeWithMe;

public class Main {

    public static void main(String[] args) {

        //    Creating an object of my BST class, a tree
        BST Btree = new BST();
        Node root= null;

        // inserting the following values in the tree
        //50, 60, 40, 30, 45, 70, 55
        Btree.insertKey(50);
        Btree.insertKey(60);
        Btree.insertKey(40);
        Btree.insertKey(30);
        Btree.insertKey(45);
        Btree.insertKey(70);
        Btree.insertKey(55);

        //Listing Elements in in-Order form
        System.out.println("Listing Elements in in-order (left-root-right)");
        Btree.listInOrder();


        //Deleting node (45) and reorganizing the tree
        Btree.deleteNode(40);
        System.out.println(" ");

        // Reorganizing the tree again in inOrder form
        System.out.println("Deleting Node (40) and reodering in in-Order format");
        Btree.listInOrder();
        System.out.println(" ");


        System.out.println("Listing Elements in pre-Order (root-left-right)");
        Btree.listPreOrder();
        System.out.println(" ");

        // Listing Elements in Post-Order form
        System.out.println("Listing Elements in post-Order (left-right-root)");
        Btree.listPostOrder();
        System.out.println(" ");

        // Now, lets search an element in the tree
        System.out.println("Is Element Found: "+Btree.search(45));


        //Now, we are printing the Smallest element in the tree
        System.out.println("Minimum Value of the BST: " + Btree.minVal());
        System.out.println("Maximum Value of the BST: " + Btree.maxVal());


    }
}