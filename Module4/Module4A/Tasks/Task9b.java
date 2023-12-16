package com.Graham;

import java.util.Scanner;

public class Task9b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (true){
            if (!userInput.equalsIgnoreCase(  "testify")) {
                System.out.println("Welcome, type \"testify\" to exit this loop");
                userInput = scanner.nextLine();
            } else if (userInput.equalsIgnoreCase( "testify")){
                System.out.println("You are out of the loop");
                break;
            }
            System.out.println("try again");
        }
    }
}
