package com.Graham;

public class Task6 {
    public static void main(String[] args) {

        String word = "DEMOCRACY";

        StringBuilder wordReverse = new StringBuilder();

        wordReverse.append(word);

        wordReverse.reverse();

        System.out.println(wordReverse.substring(4,8));
    }
}
