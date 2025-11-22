package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill = "";

    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean takeawayAdded = false;
    private boolean billGenerated = false;

    private int basePrice;
    private int totalPrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        // Set base price
        if(isVeg)
            this.basePrice = 300;
        else
            this.basePrice = 400;

        this.price = basePrice;
        this.totalPrice = price;

        bill += "Base Price Of The Pizza: " + this.basePrice + "\n";
    }

    public int getPrice(){
        return this.totalPrice;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            totalPrice += 80;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            if(isVeg)
                totalPrice += 70;
            else
                totalPrice += 120;

            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeawayAdded){
            totalPrice += 20;
            takeawayAdded = true;
        }
    }

    public String getBill(){

        if(!billGenerated){

            if(cheeseAdded)
                bill += "Extra Cheese Added: 80\n";

            if(toppingsAdded){
                if(isVeg)
                    bill += "Extra Toppings Added: 70\n";
                else
                    bill += "Extra Toppings Added: 120\n";
            }

            if(takeawayAdded)
                bill += "Paperbag Added: 20\n";

            bill += "Total Price: " + this.totalPrice + "\n";

            billGenerated = true;
        }

        return this.bill;
    }
}
