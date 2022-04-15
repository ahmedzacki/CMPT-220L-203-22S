package com.CodeWithMe;

public class LinkedList {
    NodeData beginingVal;

//Creating a function that organizes how the inputs are going into the linked list

    public void inputs(int data) {
        NodeData node = new NodeData();
        node.inputvalue = data;
        node.nextAddress = null;

        if (beginingVal == null) {
            beginingVal = node;
        } else {
            NodeData newNode = beginingVal;
            while (newNode.nextAddress != null) {
                newNode = newNode.nextAddress;
            }
            newNode.nextAddress = node;
        }
    }
}