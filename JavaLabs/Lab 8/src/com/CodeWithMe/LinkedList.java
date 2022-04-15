package com.CodeWithMe;

public class LinkedList {
    Node head;


// This function adds an element at the end of this list.
    public void addToEndOfList(int value){

        if(head==null){
            head = new Node(value);
            return;
        }
        Node currentValue = head;
        while(currentValue.nextNode != null){
            currentValue = currentValue.nextNode;
        }
        currentValue.nextNode = new Node(value);

    }
//This functions deletes a specific element from the list
    public void deleteFromList(int value){

        if(head == null) return;
        if(head.value  == value){
            head = head.nextNode;
        }
        Node currentValue = head;

        while(currentValue.nextNode != null){
            if(currentValue.nextNode.value == value){
                currentValue.nextNode = currentValue.nextNode.nextNode;
                return;
            }
            currentValue = currentValue.nextNode;
        }
    }
/// This function prints a list of the elements in the linked list
    public void list(){
        Node currentValue = head;
        while(currentValue.nextNode != null){
            System.out.print(currentValue.value+ " ");
            currentValue = currentValue.nextNode;
        }
        System.out.println(currentValue.value);
    }
}