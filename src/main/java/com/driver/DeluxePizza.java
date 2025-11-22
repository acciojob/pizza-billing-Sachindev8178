package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);

        // Deluxe Pizza automatically includes both
        super.addExtraCheese();
        super.addExtraToppings();
    }
}
