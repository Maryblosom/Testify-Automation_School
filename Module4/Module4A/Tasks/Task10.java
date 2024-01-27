package com.Mary;

import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Task10 visitors = new Task10();
        System.out.println("Enter access code for user permission");
        visitors.welcomeCode("Testify");
    }
    public void welcomeCode(String code){
        Scanner input = new Scanner(System.in);
        String enterValue = input.nextLine();

        while (true){
            if(enterValue.equalsIgnoreCase("Testify")){
                System.out.println("Welcome to Testify Academy");
                break;
            } else if (!enterValue.equalsIgnoreCase("Testify")) {
                System.out.println("Not allowed to access this channel");
                break;
            }
        }
    }
}