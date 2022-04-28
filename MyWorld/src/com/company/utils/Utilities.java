package com.company.utils;

import java.util.Scanner;

public class Utilities {

    public static String ask(Scanner reader, String string) {
        System.out.println(string);
        return reader.nextLine();
    }

    public static void clearConsole() {
        System.out.println(System.lineSeparator().repeat(100));
    }

}
