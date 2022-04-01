package com.CodeWithMe;

public class LinkedList {
    NodeData beginingVal;

//Creating a function that organizes how the inputs are going into the linked list

    public void inputs( int data ){
        NodeData node = new NodeData();
        node.inputvalue = data;
        node.nextAddress = null;

        if (beginingVal==null){
            beginingVal = node;
        }
        else{
            NodeData newNode = beginingVal;
            while (newNode.nextAddress!=null){
                newNode = newNode.nextAddress;
            }
            newNode.nextAddress = node;
        }
    }
// I am creating a function that prints all the nods in the linkedlist

    public void list(){
        NodeData node = beginingVal;
        while (node.nextAddress!=null){
            System.out.println(node.inputvalue);
            node = node.nextAddress;
        }
        System.out.println(node.inputvalue);
    }
}
