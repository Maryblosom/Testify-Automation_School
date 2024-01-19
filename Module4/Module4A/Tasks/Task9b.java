package com.Mary;

import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {

        Scanner scanText = new Scanner(System.in);
        String inputText = "";
        System.out.println("Type \"Testify\" to continue" );
        inputText = scanText.nextLine();

        while (true) {
            if (!inputText.equalsIgnoreCase("testify")) {
                System.out.println("Try again");
                inputText = scanText.nextLine();
                continue;
            } else if (inputText.equalsIgnoreCase("testify")) {
                System.out.println("Welcome to Testify");
                break;
            }
            System.out.println("try again");
        }
    }
}
