package com.Mary;

public class Task6 {
    public static void main(String[] args) {

        String word = "DEMOCRACY";

        StringBuilder reverseString  = new StringBuilder(word);

        reverseString.reverse();

       String result = reverseString.toString();

       System.out.println(result.substring(4,8));






    }
}
