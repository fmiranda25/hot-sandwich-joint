package com.pluralsight.ui;

import com.pluralsight.model.Chips;
import com.pluralsight.model.Drink;
import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Topping;

import java.io.*;
import java.time.*;
import java.util.*;

public class UserInterface {
    static LocalDateTime dateAndTime = LocalDateTime.now();
    static Scanner input = new Scanner(System.in);

    public static void displayHomeScreen() {
        boolean programIsRunning = true;
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
    } //////////////////////////////////////////////////////////////////////////////////////////end of displayHomeScreen

    public static void displayOrderScreen() {
        System.out.println("""
               What would you like for your order?
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
        Sandwich sandwich = new Sandwich();

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
        sandwich.setSize(sandwichSize);

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
        if (isToasted == "1") {
            sandwich.setToasted(true);
        } else if (isToasted == "2") {
            sandwich.setToasted(false);
        }
//        System.out.println(sandwich.getSize());
//        System.out.println(sandwich.getBreadType());
//        System.out.println(sandwich.isToasted());
        orderToppings();
    }

    public static void orderToppings() {
        System.out.println("""
               Select a topping type
               1) Meats
               2) Cheeses
               3) Veggies
               4) Condiments
               5) Sides
               """);
        String toppingCategory = input.nextLine();
        switch (toppingCategory) {
            case "1" -> addMeatTopping();
            case "2" -> addCheeseTopping();
            case "3" -> addVeggieTopping();
            case "4" -> addCondimentTopping();
            case "5" -> addSideTopping();
        }
    }

    public static void addMeatTopping() {
        Topping meatTopping = new Topping();
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
            case "1" -> meatTopping.setMeatType("Steak");
            case "2" -> meatTopping.setMeatType("Ham");
            case "3" -> meatTopping.setMeatType("Salami");
            case "4" -> meatTopping.setMeatType("Roast Beef");
            case "5" -> meatTopping.setMeatType("Chicken");
            case "6" -> meatTopping.setMeatType("Bacon");
        }
        System.out.println(meatTopping.getMeatType());
        System.out.println("Add another meat topping? (yes/no)");
        String anotherMeatChoice = input.nextLine();
        if (anotherMeatChoice.equalsIgnoreCase("yes")) {
            addMeatTopping();
        } else if (anotherMeatChoice.equalsIgnoreCase("no")) {
            orderToppings();
        }
    }

    public static void addCheeseTopping() {
        Topping cheeseTopping = new Topping();
        System.out.println("""
                       Select your cheese toppings
                       1) American
                       2) Provolone
                       3) Cheddar
                       4) Swiss
                      
                       """);
        String cheeseType = input.nextLine();
        switch (cheeseType) {
            case "1" -> cheeseTopping.setCheeseType("American");
            case "2" -> cheeseTopping.setCheeseType("Provolone");
            case "3" -> cheeseTopping.setCheeseType("Cheddar");
            case "4" -> cheeseTopping.setCheeseType("Swiss");
        }
        System.out.println("Add another cheese topping? (yes/no)");
        String anotherCheeseChoice = input.nextLine();
        if (anotherCheeseChoice.equalsIgnoreCase("yes")) {
            addCheeseTopping();
        } else if (anotherCheeseChoice.equalsIgnoreCase("no")) {
            orderToppings();
        }
    }

    public static void addVeggieTopping() {
        Topping veggieTopping = new Topping();
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
            case "1" -> veggieTopping.setVeggieType("Lettuce");
            case "2" -> veggieTopping.setVeggieType("Peppers");
            case "3" -> veggieTopping.setVeggieType("Onions");
            case "4" -> veggieTopping.setVeggieType("Tomatoes");
            case "5" -> veggieTopping.setVeggieType("Jalapenos");
            case "6" -> veggieTopping.setVeggieType("Cucumbers");
            case "7" -> veggieTopping.setVeggieType("Pickles");
            case "8" -> veggieTopping.setVeggieType("Guacamole");
            case "9" -> veggieTopping.setVeggieType("Mushrooms");
        }
        System.out.println("Add another veggie topping?");
        String anotherVeggieChoice = input.nextLine();
        if (anotherVeggieChoice.equalsIgnoreCase("yes")) {
            addVeggieTopping();
        } else if (anotherVeggieChoice.equalsIgnoreCase("no")) {
            orderToppings();
        }
    }

    public static void addCondimentTopping() {
        Topping condimentTopping = new Topping();
        System.out.println("""
                       Select your sauces
                       1) Mayo
                       2) Mustard
                       3) Ketchup
                       4) Ranch
                       5) Thousand Islands
                       6) Vinaigrette
                      
                       """);
        String condimentType = input.nextLine();
        switch (condimentType) {
            case "1" -> condimentTopping.setSauceType("Mayo");
            case "2" -> condimentTopping.setSauceType("Mustard");
            case "3" -> condimentTopping.setSauceType("Ketchup");
            case "4" -> condimentTopping.setSauceType("Ranch");
            case "5" -> condimentTopping.setSauceType("Thousand Islands");
            case "6" -> condimentTopping.setSauceType("Vinaigrette");
        }
        System.out.println("Add another sauce? (yes/no)");
        String anotherCondimentChoice = input.nextLine();
        if (anotherCondimentChoice.equalsIgnoreCase("yes")) {
            addCondimentTopping();
        } else if (anotherCondimentChoice.equalsIgnoreCase("no")) {
            orderToppings();
        }
    }

    public static void addSideTopping() {
        Topping sideTopping = new Topping();
        System.out.println("""
                       Select your sides
                       1) Au Jus
                       2) Sauce
                      
                       """);
        String sideType = input.nextLine();
        switch (sideType) {
            case "1" -> sideTopping.setSideType("Au Jus");
            case "2" -> sideTopping.setSideType("Sauce");
        }
        System.out.println("Add another side? (yes/no)");
        String anotherSideChoice = input.nextLine();
        if (anotherSideChoice.equalsIgnoreCase("yes")) {
            addSideTopping();
        } else if (anotherSideChoice.equalsIgnoreCase("no")) {
            orderDrink();
        }
    }

    public static void orderDrink() {
        String drinkSize = "";
        String drinkType = "";
        Drink drink = new Drink(drinkSize, drinkType);
        System.out.println("Would you like a drink? (yes/no)");
        String drinkChoice = input.nextLine();
        if (drinkChoice.equalsIgnoreCase("yes")) {
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
            //System.out.println(drink);
        } else if (drinkChoice.equalsIgnoreCase("no")) {
            orderChips();
        }
    }

    public static void orderChips() {
        String chipsType = "";
        Chips chips = new Chips(chipsType);
        System.out.println("Would you like chips with your order? (yes/no)");
        String chipsChoice = input.nextLine();
        if (chipsChoice.equalsIgnoreCase("yes")) {
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
        } else if (chipsChoice.equalsIgnoreCase("no")) {
            checkout();
        }
    }

    public static void checkout() {
        System.out.println("Order Details");
        // print sandwich, toppings, drink, chips information
        // print price






    }








}














