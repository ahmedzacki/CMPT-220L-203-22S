# Ahmed's Lab 5 Documentation: 	
## (Wet to Dry)

---


My approach of tackling the wet code was that I was looking for an efficient way to generate the same results but in a way that it is more understandable to everyone including people who have no coding experience. 

When I was going through the wet code, I realized that there was a lot of repetitions, which is not efficient. 

So I made the following procedure:

* I defined all the fixed variables outside of the the Main function, sort of like "public variables", so that they can be accessed from everywhere in the code. 
* Then to avoid the repetion, I decided to create fucntions. Functions helped me to break down the major issue into smaller parts. So that in the future, if error happens in my code, I konw where to look and not that everything is messed up. 
* I have creating the following functions and each function is generating a specific task:
 
* * 1 function for generating lemonade inventory.
* * 1 function for generating pretzels inventory.
* *  1 function for genrating the total tips collected.
* *  1 function for generating the total cash. 

---

* After that, I recalled all the four functions I created in my dry_inventory() function
* Then, inside of my Main function, I have recalled the my dry_inventory function which will generate my target results. 

Inside my functions, as you will see in the code, I have used **arrays to store the date I recived from the customer**. Then I have used **for loop to scan throgh the elements of my array list** and I have performed some basic calculations to generate my target. 

My code might not be the most effective way but my aim was simplicity so that it is easy to read and understandable. Also, you will notice that I haven't used any numbers inside of my functions except the variables I described outside of my main function. Finally, this code can be used in the future and all you have to do is just change the customer data in the array and the fixed variables like the the cash on hand, then everything else will be generated. Also, this is my first time learning java and my way might not be the efficient way but it gets the work done.  

**Here is the link to Markdown Guide:** [https://www.markdownguide.org/](https://www.markdownguide.org/)

Here is my dry inventory functions of my code: 


    static void dry_inventory() {
        lemonade_inventory();
        pretzels_inventory();
        total_tips();
        total_cash();
    }


