package com.company.test;

import com.company.controller.UserController;
import com.company.model.User;
import com.company.service.UserService;
import com.company.view.IOView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class UserTest {

    public static void test() {
        //array list users to test
        ArrayList<User> usersTest = new ArrayList<>();
        //createFakeUsers(usersTest);
        printUsers(usersTest);
        //unitary tests
        testCreateUserView();
        testCreateUserController();
        //testLoan(users);
        System.out.println("Tests ending... \n");
    }


    public static void printUsers(ArrayList<User> users) {
        System.out.println("Users:" + users + "\n");
    }

    public static void testCreateUserView() {
        //test view so we need to send data as string
        String fakeDataUser = "Bruce\n" + "Jones\n" + "12\n" + "88889999555533334\n" + "500.00\n" + "Visa\n";
        Scanner fakeReader = new Scanner(fakeDataUser);

        String status = IOView.createUser(fakeReader);
        if (status.equals("created")) System.out.println("Test #testCreateUserView OK");
        else System.out.println("Test #testCreateUserView FAIL");
    }

    public static void testCreateUserController() {
        //to test and discover weather
        // (1) user is created
        // (2) user is saved in arraylist properly
        // (3) get hashmap and unpack it
        // (4) create response hashmap and works
        HashMap<String, String> fakeDataUser = new HashMap();
        fakeDataUser.put("operation", "createUser");
        fakeDataUser.put("name", "Sonia");
        fakeDataUser.put("surname", "Lopes");
        fakeDataUser.put("age", "10");
        fakeDataUser.put("cardNumber", "9999222244447777");
        fakeDataUser.put("amount", "50.00");
        fakeDataUser.put("cardType", "Visa");

        HashMap<String, String> responseHashMap = UserController.createUser(fakeDataUser);

        if (responseHashMap.get("status").equals("created")) System.out.println("Test #testCreateUserController OK");
        else System.out.println("Test #testCreateUserController FAIL");
    }


}
