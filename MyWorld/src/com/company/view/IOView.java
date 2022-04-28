package com.company.view;

import com.company.controller.UserController;
import com.company.frontcontroller.FrontController;
import com.company.test.UserTest;
import com.company.utils.Utilities;

import java.util.HashMap;
import java.util.Scanner;

public class IOView {

    public static void mainLoopView() {
        //just scanner object to manage io
        Scanner reader = new Scanner(System.in);
        //create fake users to work with them
        //this is a very BAD solution, so it is temporal
        //just for having some users to work with them
        //to-do: create a JSON to import when boot soft
        //or just a DB
        //UserController.createFakeUsers();
        while (true) {
            //print mode menu
            Menu.modeMenu();
            String command = Utilities.ask(reader, "Mode?");

            if (command.equals("Quit")) {
                break;
            } else if (command.equals("test")) {
                //We create this feature to test our soft
                UserTest.test();
            } else if (command.equals("release")) {
                //We create this feature to release our soft
                releaseLoopView(reader);
                break;
            } else System.out.println("Unknown command");
        }
    }

    public static void releaseLoopView(Scanner reader) {
        //main loop starting
        while (true) {
            //print main menu
            Menu.mainMenu();
            String command = Utilities.ask(reader, "Option?");

            if (command.equals("Exit")) {
                break;
            } else if (command.equals("Users")) {
                //call secondary users menu-loop
                releaseLoopUsersView(reader);
                break;
            } else if (command.equals("Items")) {
                //call-operation to change pin
                releaseLoopItemsView(reader);
                break;
            } else if (command.equals("Lendings")) {
                //call-operation to make a transfer
                releaseLoopLendingsView(reader);
                break;
            } else System.out.println("Unknown command");
        }
    }

    public static void releaseLoopUsersView(Scanner reader) {
        //users loop starting
        while (true) {
            //print users menu
            Menu.usersMenu();
            String command = Utilities.ask(reader, "Option?");

            if (command.equals("Back")) {
                break;
            } else if (command.equals("Newuser")) {
                //call-operation to create new user
                //createUser(reader);
            } else System.out.println("Unknown command");
        }
        releaseLoopView(reader);
    }

    public static void releaseLoopItemsView(Scanner reader) {
        //users loop starting
        while (true) {
            //print users menu
            Menu.itemsMenu();
            String command = Utilities.ask(reader, "Option?");

            if (command.equals("Back")) {
                break;
            } else if (command.equals("Newitem")) {
                //call-operation to create new item
                //createItem(reader);
            } else System.out.println("Unknown command");
        }
        releaseLoopView(reader);
    }

    public static void releaseLoopLendingsView(Scanner reader) {
        //users loop starting
        while (true) {
            //print users menu
            Menu.lendingsMenu();
            String command = Utilities.ask(reader, "Option?");

            if (command.equals("Back")) {
                releaseLoopView(reader);
                break;
            } else if (command.equals("Newlending")) {
                //call-operation to create new lending
                //createLending(reader);
            } else System.out.println("Unknown command");
        }
        releaseLoopView(reader);
    }

    public static String createUser(Scanner reader) {
        //Let s introduce data to create User's card
        String name = Utilities.ask(reader, "Name?");
        String surname = Utilities.ask(reader, "Surname?");
        String age = Utilities.ask(reader, "Age?");
        String number = Utilities.ask(reader, "Card Number?");
        String amount = Utilities.ask(reader, "Amount?");
        String type = Utilities.ask(reader, "Type?");
        //create hashmap to send data to controller
        HashMap<String, String> createUserRequest = new HashMap<>();
        //fill data hashmap object
        createUserRequest.put("operation", "createUser");
        createUserRequest.put("name", name);
        createUserRequest.put("surname", surname);
        createUserRequest.put("age", age);
        createUserRequest.put("cardNumber", number);
        createUserRequest.put("amount", amount);
        createUserRequest.put("cardType", type);

        //send data to controller and get the response
        HashMap<String, String> createUserResponse = FrontController.mainLoopController(createUserRequest);
        String createUserStatus = createUserResponse.get("status");
        System.out.println("status user: " + createUserStatus + "\n");

        return createUserStatus;
    }

}
