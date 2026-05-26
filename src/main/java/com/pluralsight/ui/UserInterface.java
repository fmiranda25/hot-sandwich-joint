package com.pluralsight.ui;

import com.pluralsight.model.Sandwich;
import com.pluralsight.model.Topping;

import javax.swing.plaf.basic.BasicDesktopIconUI;
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
    } /////////////////////////////////////////////////////////////////////////////////////////////////// end of display

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
        Topping topping = new Topping();

        System.out.println("""
                Select a topping type
                1) Meats
                2) Cheeses
                3) Veggies
                4) Condiments
                5) Sides
                """);
        String toppingCategory = input.nextLine();

        if (toppingCategory == "1") {
            System.out.println("""
                    """);
        }

        switch (toppingCategory) {
            case "1" -> toppingCategory = "meats";
            case "2" -> toppingCategory = "cheese";
            case "3" -> toppingCategory = "veggies";
            case "4" -> toppingCategory = "condiments";
            case "5" -> toppingCategory = "sides";
        }



    }

    public static void orderDrink() {
        // get Drink
    }

    public static void orderChips() {
        // get Chips
    }

    public static void checkout() {
        System.out.println("Order Details");
        // print sandwich, toppings, drink, chips information
        // print price



    }




}






