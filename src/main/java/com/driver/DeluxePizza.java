package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
    }

    public void addExtraCheese() {
        super.addExtraCheese();
    }
    public void addExtraToppings(){
        super.addExtraToppings();
    }
    public void addTakeaway(){
        super.addTakeaway();
    }
}
