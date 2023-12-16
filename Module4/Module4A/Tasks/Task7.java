package com.Graham;

import java.util.Arrays;
public class Task7 {
    public static void main(String[] args) {

        String [] [] fruitsArray = new String [4] [3];

        fruitsArray [0] [0]  = "Orange";
        fruitsArray [1] [0]  = "Apple";
        fruitsArray [2] [0]  = "Pineapple";
        fruitsArray [3] [0]  = "Mango";

        System.out.println(Arrays.deepToString(fruitsArray));

    }
}
