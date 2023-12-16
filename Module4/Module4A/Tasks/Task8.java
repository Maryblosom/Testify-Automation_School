package com.Graham;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome!Pls enter the principal you will like to obtain:");

        short principal = userInput.nextShort();

        float interestRate = 0.004F;

        byte interestTerm = 8;

        float simpleInterest = interestTerm * interestRate * principal;

        System.out.println("The Simple interest is " + simpleInterest);



    }
}
