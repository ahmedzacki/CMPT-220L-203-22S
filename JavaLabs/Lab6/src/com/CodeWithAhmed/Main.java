package com.CodeWithAhmed;
import java.util.*;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        //Creating an Array here
        int[] numArray = {1, 2, 3, 4, 5};
        System.out.print("Array: ");
        for (int i : numArray) {
            System.out.print(i+" ");
        }
        System.out.println(" "); 

        //Creating an ArrayList
        ArrayList<Integer> numArrayList = new ArrayList<Integer>();
        numArrayList.add(2);
        numArrayList.add(0);
        numArrayList.add(2);
        numArrayList.add(2);

        System.out.print("ArrayList: ");
        for (int x : numArrayList) {
            System.out.print(x);
        }
        System.out.println(" ");

        //Creating LinkedList
        LinkedList<String> myFullName = new LinkedList<String>();
        myFullName.add("Ahmed");
        myFullName.add("Ismail");
        myFullName.add("Handulle");

        System.out.println("LinkedList: "+myFullName.getFirst()+" "+myFullName.getLast());

        //Creating Queue
        Queue<String> str_queue = new LinkedList<>();
        str_queue.add("one");
        str_queue.add("two");
        str_queue.add("three");
        str_queue.add("four");

        System.out.println("Initial Queue: " + str_queue);
        System.out.println("Removing 1st element from Queue: " + str_queue.remove());

        //Creating a Stack here
        Stack<String> stack = new Stack<String>();
        stack.push("one");
        stack.push("two");
        stack.push("three");
        stack.push("four");

        System.out.println("Initial Stack: "+stack);
        System.out.println("Removing last element from stack: "+stack.pop());

        //Instance of Plant is created here
        Plant instanceOf_Plant= new Plant("Fan Flower", "Goodeniaceae",true);

    }
}
