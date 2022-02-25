package com.CodeWithAhmed;

public class Main {

    /**
     * In our Assignment here we're running a little lemonade stand and we also sell pretzels. We need to keep track of
     * our inventory as well as the money that we're making throughout the day. I have code in the wet code section that
     * keeps track of all of this poorly. Come up with a better way to manage our system. There's not just one way to do
     * this so get creative and most importantly remember to stay DRY!
     *
     * We're gonna look at the first hour where we have 15 customers!
     *
     * We're responsible for keeping track of the number of pretzels and lemonades sold as well as the cash on hand and
     * in the tip jar! To keep things easy I won't make you make change! At the end of the day tips are split among the
     * employees! That means DON'T add it to the cash at the end of the day or during a transaction
     *
     * At the end we're going to print out our inventory left and how much we made in case for the day! Print out the
     * tips too!
     *
     * Remember to use functions, variables, and whatever else would make this easier to maintain!
     *
     * Pretzels are $2 for 1
     * Lemonade is $8 for 1
     */
    static int lemonades_available = 43;
    static int pretzels_available = 60;
    static double cash = 1500.0;
    static double tips = 0.0;
    static int lemonade_price = 8;
    static int pretzels_price = 2;
    static int lemonadeSold_cash = 0;
    static int pretzelsSold_cash = 0;



    public static void main(String[] args) {
        dry_inventory();
    }

    static void dry_inventory() {
        lemonade_inventory();
        pretzels_inventory();
        total_tips();
        total_cash();
    }

        //this function generates the lemonades inventory
    static void lemonade_inventory(){

        int sumof_lemonadesSold= 0;

        //this array is to show the number of lemonades sold to 15 customer respectively
        int[] lem_sold_tocustomers = {1, 3, 0, 2, 6, 4, 0, 8, 0, 1, 0, 7, 0, 3, 2};

        for(int i=0; i<lem_sold_tocustomers.length; i++){
            sumof_lemonadesSold = sumof_lemonadesSold + lem_sold_tocustomers[i];
        }
        lemonades_available = lemonades_available - sumof_lemonadesSold; //calculate lemonades inventory here
        lemonadeSold_cash = lemonadeSold_cash + (sumof_lemonadesSold * lemonade_price); //calculate profit from lemonades here
        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
    }
        // this function generates the pretzels inventory
    static void pretzels_inventory(){
        int sumof_pretzelsSold =0;
        //this array is to show the number of pretzels sold to 15 customers respectively
        int[] pret_sold_tocustomers = {4, 2, 3, 1, 0, 0, 2, 10, 6, 0, 1, 0, 2, 6, 9};
        for(int i=0; i<pret_sold_tocustomers.length; i++){
            sumof_pretzelsSold = sumof_pretzelsSold + pret_sold_tocustomers[i];
        }
        pretzels_available = pretzels_available - sumof_pretzelsSold; //calculate pretzels inventory here
        pretzelsSold_cash = pretzelsSold_cash + (sumof_pretzelsSold * pretzels_price); //calculate profit from pretzels here
        System.out.println("Pretzels Inventory: " + pretzels_available);
    }
        //this function generates the total tips
    static void total_tips(){
        //this array is to show the tips given out by each customer respectively
        int[] tips_givenBy_customers = {4, 0, 0, 0, 10, 5, 0, 10, 0, 0, 0, 4, 0, 0, 3};
        for(int i=0; i<tips_givenBy_customers.length; i++){
            tips = tips + tips_givenBy_customers[i];
        }
        System.out.println("Tips: " + tips);
    }
        //this function generates the total cash
    static void total_cash(){
        cash = cash + lemonadeSold_cash + pretzelsSold_cash; // calculate total cash here including the profit
        System.out.println("Cash: " + cash);
    }

    static void wet_inventory() {
        /**
         * We have 10 customers in the first hour! This is what they bought! When running this with your dry code you
         * don't want to run this function because then the numbers in the end will be wrong!
         */
        //Customer 1
        pretzels_available -= 4;
        cash += 8;
        lemonades_available -= 1;
        cash += 8;
        tips += 4;

        //Customer 2
        pretzels_available -= 2;
        cash += 4;
        lemonades_available -= 3;
        cash += 24;

        //Customer 3
        pretzels_available -= 3;
        cash += 6;

        //Customer 4
        pretzels_available -= 1;
        cash += 2;
        lemonades_available -= 2;
        cash += 16;

        //Customer 5
        lemonades_available -= 6;
        cash += 48;
        tips += 10;

        //Customer 6
        lemonades_available -= 4;
        cash += 32;
        tips += 5;

        //Customer 7
        pretzels_available -= 2;
        cash += 4;

        //Customer 8
        pretzels_available -= 10;
        cash += 20;
        lemonades_available -= 8;
        cash += 64;
        tips += 10;


        //Customer 9
        pretzels_available -= 6;
        cash += 12;

        //Customer 10
        lemonades_available -= 1;
        cash += 8;

        //Customer 11
        pretzels_available -= 1;
        cash += 2;

        //Customer 12
        lemonades_available -= 7;
        cash += 56;
        tips += 4;

        //Customer 13
        pretzels_available -= 2;
        cash += 4;

        //Customer 14
        pretzels_available -= 6;
        cash += 12;
        lemonades_available -= 3;
        cash += 24;

        //Customer 15
        pretzels_available -= 9;
        cash += 18;
        lemonades_available -= 2;
        cash += 16;
        tips += 3;

        System.out.println("Results for the hour!");
        System.out.println("Lemonades Inventory: " + lemonades_available);
        System.out.println("Pretzels Inventory: " + pretzels_available);
        System.out.println("Cash: " + cash);
        System.out.println("Tips: " + tips);
    }
}

//end of program