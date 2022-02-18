package com.CodeWithAhmed;

public class Main {

    public static void main(String[] args) {

//Switch Case here

        String role = "Student";
        System.out.println("<<I'm using switch case here>>");

        switch(role){
            case "Faculty":
                System.out.println("You are a faculty");
                break;
            case "Student":
                System.out.println("You are a student");
                break;
            default:
                System.out.println("You are a guest");
        }

//For Loop

        {
            System.out.println("<<I'm using For Loop here>>");
            for (int i=0; i<=10; i++){
                System.out.print(i + ", ");
            }
            System.out.println(" ");
        }

//while loop here

        {
            System.out.println("<<I'm using while loop here>>");
            int x=10;
            while(x>=0){
                System.out.print(x+", ");
                --x;
            }
        }

//Printing 2^3 using the poWer Function

        System.out.println(" ");
        System.out.println("2 to the power of 3: " +poWer(2,3));

//Searching the occurance of number 7 in a given list

        System.out.println("What is the occurance of 7 in the list: "+searchlist(7));

//Sum up all the elements in an array that you create here

        int[] array={4,4,4,4};
        System.out.println("Summationg of all elements in the given list: "+summation(array));

//Find the squareroot of any given a and b here

        System.out.println("Square root of 3^2+4^2: "+squareRoot(3,4));
    }

//Power Function

    static double poWer(int num1, int num2) {
        return Math.pow(num1,num2);
    }

//Function for searching the occurence of an element in an array

    static int searchlist(int numsearch){
        int[] list={2,3,5,2,3,6,7,8,2};
        int count=0;
        for (int i=0; i<list.length; i++){
            if (numsearch==list[i]){
                count += 1;
            }
        }
        return count;
    }

//Function for summation of elements in an array

    static int summation(int[] array){
        int sum=0;
        for (int i=0; i<array.length; i++){
            sum = sum + array[i];

            }
        return sum;
        }

//Function for calculating sqrt

    static double squareRoot(int a, int b) {
        double c = Math.pow((Math.pow(a,2)+Math.pow(b,2)), 0.5);
        return c;
    }


}
