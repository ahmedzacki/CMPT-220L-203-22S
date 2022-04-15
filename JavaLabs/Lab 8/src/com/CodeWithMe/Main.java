package com.CodeWithMe;


public class Main {

    public static void main(String[] args) {

        LinkedList linkedlistElements = new LinkedList();

        linkedlistElements.addToEndOfList(5);
        linkedlistElements.addToEndOfList(6);
        linkedlistElements.addToEndOfList(3);
        linkedlistElements.addToEndOfList(7);
        linkedlistElements.addToEndOfList(9);
        linkedlistElements.deleteFromList(3);

        linkedlistElements.list();

    }
}
