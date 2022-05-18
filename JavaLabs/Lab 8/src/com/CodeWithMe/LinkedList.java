package com.CodeWithMe;

import java.util.ArrayList;

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
/// This function sorts the elements in the linked list

    public void bubbleSort() {

        Node currentValue = head;
        while (currentValue != null) {
            Node nextValue = currentValue.nextNode;
            while (nextValue != null) {
                if (currentValue.value > nextValue.value) {
                    int temp = currentValue.value;
                    currentValue.value = nextValue.value;
                    nextValue.value = temp;
                }
                nextValue = nextValue.nextNode;
            }
            currentValue = currentValue.nextNode;
        }
    }

    public void List(){
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        if(head != null){
            Node newNode = head;
            while (newNode.nextNode != null){
                newArray.add(newNode.value);
                newNode = newNode.nextNode;
            }
            newArray.add(newNode.value);
        }
        System.out.println(newArray);
    }
}