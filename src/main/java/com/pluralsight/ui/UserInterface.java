package com.pluralsight.ui;

import com.pluralsight.data.ReceiptWriter;
import com.pluralsight.model.*;

import java.io.IOException;
import java.util.*;

public class UserInterface {
    static Order order = new Order();
    static Sandwich sandwich;
    static Scanner input = new Scanner(System.in);
    static boolean programIsRunning = true;

    public static void displayHomeScreen() {
        order = new Order();
        while (programIsRunning) {
            System.out.println("""
                   Welcome To Sandwich Shop!
                  
                   What would you like to do?
                   1) New Order
                   0) Exit
                  
                   Enter:
                   """);
            int homeScreenInput = input.nextInt();
            switch (homeScreenInput) {
                case 1 -> displayOrderScreen();
                case 0 -> programIsRunning = false;
            }
        }
    }

    public static void displayOrderScreen() {
        System.out.println("""
               What would you like??
               1) Add Sandwich
               2) Add Drink
               3) Add Chips
               4) Checkout
               0) Cancel Order
              
               Enter:
               """);
        int orderScreenInput = input.nextInt();
        input.nextLine();
        switch (orderScreenInput) {
            case 1 -> orderSandwich();
            case 2 -> orderDrink();
            case 3 -> orderChips();
            case 4 -> checkout();
            case 0 -> displayHomeScreen();
        }
    }

    public static void orderSandwich() {
        sandwich = new Sandwich();

        System.out.println("""
               Choose your sandwich size:
               1) 4"
               2) 8"
               3) 12"
               """);
        String sandwichSize = input.nextLine();
        switch (sandwichSize) {
            case "1" -> sandwichSize = "Small";
            case "2" -> sandwichSize = "Medium";
            case "3" -> sandwichSize = "Large";
        }
        sandwich.setSandwichSize(sandwichSize);
        System.out.println(sandwich.getPrice());

        System.out.println("""
               Select your bread:
               1) White
               2) Wheat
               3) Rye
               4) Wrap
              
               """);
        String breadType = input.nextLine();
        switch (breadType) {
            case "1" -> breadType = "White";
            case "2" -> breadType = "Wheat";
            case "3" -> breadType = "Rye";
            case "4" -> breadType = "Wrap";
        }
        sandwich.setBreadType(breadType);

        System.out.println("""
               Would you like your sandwich toasted?
               1) Yes
               2) No
              
               """);
        String isToasted = input.nextLine();
        if (isToasted.equals("1")) {
            sandwich.setToasted(true);
        } else if (isToasted.equals("2")) {
            sandwich.setToasted(false);
        }
        order.addMenuItem(sandwich);
        orderToppings();
    }

    public static void orderToppings() {
        System.out.println("""
               Select a topping type
               1) Meats
               2) Cheeses
               3) Veggies
               4) Condiments
               
               """);
        String toppingCategory = input.nextLine();
        switch (toppingCategory) {
            case "1" -> addMeatTopping(false);
            case "2" -> addCheeseTopping(false);
            case "3" -> addVeggieTopping();
            case "4" -> addCondimentTopping();
        }
    }

    public static void addMeatTopping(boolean isExtraTopping) {
        Topping topping = new Topping();
        System.out.println("""
                       Select your meat toppings
                       1) Steak
                       2) Ham
                       3) Salami
                       4) Roast Beef
                       5) Chicken
                       6) Bacon
                      
                       """);
        String meatType = input.nextLine();
        switch (meatType) {
            case "1" -> {
                topping.setToppingType("Steak");
                topping.setExtraTopping(isExtraTopping);
            }
            case "2" -> {
                topping.setToppingType("Ham");
                topping.setExtraTopping(isExtraTopping);
            }
            case "3" -> {
                topping.setToppingType("Salami");
                topping.setExtraTopping(isExtraTopping);
            }
            case "4" -> {
                topping.setToppingType("Roast Beef");
                topping.setExtraTopping(isExtraTopping);
            }
            case "5" -> {
                topping.setToppingType("Chicken");
                topping.setExtraTopping(isExtraTopping);
            }
            case "6" -> {
                topping.setToppingType("Bacon");
                topping.setExtraTopping(isExtraTopping);
            }
        }
        sandwich.addToSandwich(topping);
        System.out.println(topping.getPrice(sandwich.getSandwichSize()));

        System.out.println("""
                Anything else?
                
                1) Add another meat topping
                2) Go back to toppings options
                3) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> addMeatTopping(true);
            case "2" -> orderToppings();
            case "3" -> displayOrderScreen();
        }

    }

    public static void addCheeseTopping(boolean isExtraTopping) {
        Topping topping = new Topping();
        System.out.println("""
                       Select your cheese toppings
                       1) American
                       2) Provolone
                       3) Cheddar
                       4) Swiss
                      
                       """);
        String cheeseType = input.nextLine();

        switch (cheeseType) {
            case "1" -> {
                topping.setToppingType("American");
                topping.setExtraTopping(isExtraTopping);
            }
            case "2" -> {
                topping.setToppingType("Provolone");
                topping.setExtraTopping(isExtraTopping);
            }
            case "3" -> {
                topping.setToppingType("Cheddar");
                topping.setExtraTopping(isExtraTopping);
            }
            case "4" -> {
                topping.setToppingType("Swiss");
                topping.setExtraTopping(isExtraTopping);
            }
        }
        sandwich.addToSandwich(topping);
        System.out.println(topping.getPrice(sandwich.getSandwichSize()));

        System.out.println("""
                Anything else?
                
                1) Add another cheese topping
                2) Go back to toppings options
                3) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> addCheeseTopping(true);
            case "2" -> orderToppings();
            case "3" -> displayOrderScreen();
        }
    }

    public static void addVeggieTopping() {
        Topping topping = new Topping();
        System.out.println("""
                       Select your veggie toppings
                       1) Lettuce
                       2) Peppers
                       3) Onions
                       4) Tomatoes
                       5) Jalapenos
                       6) Cucumbers
                       7) Pickles
                       8) Guacamole
                       9) Mushrooms
                      
                       """);
        String veggieType = input.nextLine();
        switch (veggieType) {
            case "1" -> topping.setToppingType("Lettuce");
            case "2" -> topping.setToppingType("Peppers");
            case "3" -> topping.setToppingType("Onions");
            case "4" -> topping.setToppingType("Tomatoes");
            case "5" -> topping.setToppingType("Jalapenos");
            case "6" -> topping.setToppingType("Cucumbers");
            case "7" -> topping.setToppingType("Pickles");
            case "8" -> topping.setToppingType("Guacamole");
            case "9" -> topping.setToppingType("Mushrooms");
        }
        sandwich.addToSandwich(topping);

        System.out.println("""
                Anything else?
                
                1) Add another veggie topping
                2) Go back to toppings options
                3) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> addVeggieTopping();
            case "2" -> orderToppings();
            case "3" -> displayOrderScreen();
        }
    }

    public static void addCondimentTopping() {
        Topping topping = new Topping();
        System.out.println("""
                       Select your sauces
                       1) Mayo
                       2) Mustard
                       3) Ketchup
                       4) Ranch
                       5) Thousand Islands
                       6) Vinaigrette
                       7) Au Jus
                      
                       """);
        String condimentType = input.nextLine();
        switch (condimentType) {
            case "1" -> topping.setToppingType("Mayo");
            case "2" -> topping.setToppingType("Mustard");
            case "3" -> topping.setToppingType("Ketchup");
            case "4" -> topping.setToppingType("Ranch");
            case "5" -> topping.setToppingType("Thousand Islands");
            case "6" -> topping.setToppingType("Vinaigrette");
            case "7" -> topping.setToppingType("Au Jus");
        }
        sandwich.addToSandwich(topping);

        System.out.println("""
                Anything else?
                
                1) Add another condiment
                2) Go back to toppings options
                3) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> addCondimentTopping();
            case "2" -> orderToppings();
            case "3" -> displayOrderScreen();
        }
    }

    public static void orderDrink() {
        Drink drink = new Drink();
        String drinkType;
        String drinkSize;

        System.out.println("""
                Select a drink
                1) Pepsi
                2) Sprite
                3) Orange Juice
                4) Water
                
                """);
        drinkType = input.nextLine();
        switch (drinkType) {
            case "1" -> drink.setDrinkType("Pepsi");
            case "2" -> drink.setDrinkType("Sprite");
            case "3" -> drink.setDrinkType("Orange Juice");
            case "4" -> drink.setDrinkType("Water");
        }
        System.out.println("""
                Select your size
                1) Large
                2) Medium
                3) Small
                    
                """);
        drinkSize = input.nextLine();
        switch (drinkSize) {
            case "1" -> drink.setDrinkSize("Large");
            case "2" -> drink.setDrinkSize("Medium");
            case "3" -> drink.setDrinkSize("Small");
        }
        System.out.println(drink.getPrice());
        order.addMenuItem(drink);

        System.out.println("""
                Anything else?
                
                1) Add another drink
                2) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> orderDrink();
            case "2" -> displayOrderScreen();
        }

    }

    public static void orderChips() {
        Chips chips = new Chips();
        String chipsType;

       System.out.println("""
               Select a drink
               1) Sun Chips
               2) Lays Oven Baked
               3) Doritos
               4) Miss Vickie's
                   
               """);
       chipsType = input.nextLine();
       switch(chipsType) {
           case "1" -> chips.setChipsType("Sun Chips");
           case "2" -> chips.setChipsType("Lays Oven Baked");
           case "3" -> chips.setChipsType("Doritos");
           case "4" -> chips.setChipsType("Miss Vickie's");
       }
        System.out.println(chips.getPrice());
        order.addMenuItem(chips);

        System.out.println("""
                Anything else?
                
                1) Add another
                2) Done
                
                """);
        String choice = input.nextLine();
        switch (choice) {
            case "1" -> orderChips();
            case "2" -> displayOrderScreen();
        }
    }

    public static String getOrderTotal() {
        double total = 0;
        StringBuilder finalReceipt = new StringBuilder();
        finalReceipt.append("Order Details\n");
        finalReceipt.append(Order.createReceiptDateTime() + "\n");
        finalReceipt.append("\n");

        for (MenuItem menuItem : order.getMenuItems()) {
            finalReceipt.append(menuItem);
            finalReceipt.append("\n");
            total += menuItem.getPrice();
        }
        finalReceipt.append(String.format("Total: $%.2f\n", total));
        return finalReceipt.toString();
    }

    public static int checkout() {
        getOrderTotal();
        System.out.println(getOrderTotal());

        System.out.println("""
                Confirm Order?
                1) Yes
                2) No
                
                """);
        String confirmOrder = input.nextLine();
        if (confirmOrder.equals("1")) {
            try {
                ReceiptWriter receiptWriter = new ReceiptWriter();
                receiptWriter.CreateReceipt();
                System.out.println("""
                        Order Confirmed
                        1) Return to Home Screen
                        
                        """);
                String returnHome = input.nextLine();
                if (returnHome.equals("1")) {
                    displayHomeScreen();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (confirmOrder.equals("2")) {
            System.out.println("""
                    Are you sure you want to cancel?
                    1) Yes
                    2) No
                    
                    """);
            String cancelOrder = input.nextLine();
            if (cancelOrder.equals("1")) {
                displayHomeScreen();
            } else if (cancelOrder.equals("2")) {
                checkout();
            }
        }

        programIsRunning = false;
        return 0;
    }
}

