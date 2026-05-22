package com.pluralsight.ui;

import com.pluralsight.model.Sandwich;

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
            input.nextLine();
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
        switch (orderScreenInput) {
            case 1 -> orderSandwich();
            case 2 -> orderDrink();
            case 3 -> orderChips();
            case 4 -> checkout();
            case 0 -> displayHomeScreen();
        }

    }

    public static void orderSandwich() {
        // get Sandwich
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






