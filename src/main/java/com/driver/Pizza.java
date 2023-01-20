package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg == true){
            this.price = 300;
        }else{
            this.price = 400;
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    boolean flag1 = false;
    public void addExtraCheese(){
        // your code goes here
        if(flag1 == false){
            this.price+=80;
            flag1 = true;
        }
    }

    boolean flag2 = false;
    public void addExtraToppings(){
        // your code goes here
        if(flag2 == false){
            if(isVeg == true){
                this.price+=70;
            }else{
                this.price+=120;
            }
            flag2 = true;
        }
    }

    boolean flag3 = false;
    public void addTakeaway(){
        // your code goes here
        if(flag3 == false){
            this.price+=20;
            flag3 = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill = ("Base Price Of The Pizza: " + (isVeg?300:400)+
                (flag1?"\nExtra Cheese Added: 80":" ")+
                (flag2?"\nExtra Toppings Added: "+(isVeg?70:120):" ")+
                (flag3?"\nPaperbag Added: 20":" ")+
                "\nTotal Price: "+this.price);
        return this.bill;
    }
}
