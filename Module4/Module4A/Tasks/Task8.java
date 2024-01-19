package com.Mary;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello enter your number of years of service in the company:");

        short time = userInput.nextShort();

        int principal = 300;
        double rate = 0.04;

        int simpleInterest =  (int) (principal * rate * time);

        System.out.println("Interest gained in the past " + time +"years spent in the company is $"+ simpleInterest);

    }
}
