package com.Mary.Task17b;


import java.util.Scanner;

public class Login implements NewApp {

    public static void main(String[] args)  {
        Login loginScreen = new Login();

//        if (!loginScreen.getClass()) {
//        } else {
            loginScreen.userNameField("mblossom");
            loginScreen.passwordField(928393739);
            loginScreen.LoginButton(true);




        @Override
        public void userNameField (String username){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter username");
        String userName = input.nextLine();
        System.out.println("Enter password");
    }


        @Override
        public boolean passwordField ( int number){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        System.out.println("Click on Login button to continue");
        return false;
    }


        @Override
        public boolean LoginButton ( boolean enter){
        Scanner input = new Scanner(System.in);
        boolean button = Boolean.parseBoolean(input.nextLine());
        System.out.println("Welcome");
        return false;

    }


    }





