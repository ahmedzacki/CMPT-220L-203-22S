package com.CodeWithMe;


public class Main {

    public static void main(String[] args) {

        LinkedList linkedlistElements = new LinkedList();

        linkedlistElements.addToEndOfList(5);
        linkedlistElements.addToEndOfList(8);
        linkedlistElements.addToEndOfList(3);
        linkedlistElements.addToEndOfList(2);
        linkedlistElements.addToEndOfList(9);
        linkedlistElements.deleteFromList(3);

        linkedlistElements.List();
        linkedlistElements.bubbleSort();
        linkedlistElements.List();


    }
}
