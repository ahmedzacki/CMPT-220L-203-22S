package com.package1;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello World");
    //This is the second part of lab 3
        System.out.println("c = 10");
        System.out.println("d = 5");
        System.out.println("e = 15");
        int c= 10;
        int d=10;
        int e=15;
        if (c == d){
            System.out.println("(c==d) is True");
        }
        //////////////////
        if (c>d){
            System.out.println("True");
        }else{
            System.out.println("(c>d) is False");
        }
        if (c == e){
            System.out.println("(c == e): False");
        }else if (e>d){
            System.out.println("(e>d): True");
        }else {
            System.out.println("False Statement");
        }
        if (c==d && c<e){
            System.out.println("c * 2: " + c*2);
        }
        if (d>=c || d<e){
            System.out.println("Or statement is True");
        }

    }

}


