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

I recalled all the four functions I created in my dry_inventory function and it is as the following: 

`````````static void dry_inventory() {
        lemonade_inventory();
        pretzels_inventory();
        total_tips();
        total_cash();
    }```
