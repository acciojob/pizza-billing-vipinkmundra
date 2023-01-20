package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int cheesePrice;
    private int toppingPrice;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isCheeseAdded = false;
        this.isToppingAdded = false;
        this.isTakeAwayAdded = false;
        this.isBillGenerated = false;
        this.bill = "";
        if(isVeg == true){
            this.price = 300;
            this.toppingPrice = 70;
        }else{
            this.price = 400;
            this.toppingPrice = 120;
        }
        this.cheesePrice = 80;
        this.bill = this.bill + "Base Price Of The Pizza: " + this.price;
    }

    public int getPrice(){
        return this.price;
    }

//    boolean flag1 = false;
    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded == false){
            this.price+=cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded == false){
                this.price+=toppingPrice;
            isToppingAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded == false){
            this.price+=20;
            isTakeAwayAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated == false){
            if(isCheeseAdded){
                this.bill+="\nExtra Cheese Added: "+cheesePrice;
            }
            if(isToppingAdded){
                this.bill+="\nExtra Toppings Added: "+toppingPrice;
            }
            if(isTakeAwayAdded){
                this.bill+="\nExtra Toppings Added: "+20;
            }
            this.bill+="\nTotal Price: "+this.price+"\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
