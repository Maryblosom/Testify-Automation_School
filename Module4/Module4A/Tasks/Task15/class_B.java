package com.Mary.Task15;

public class class_B extends class_A {
    public static void main(String[] args) {
        class_A theCharacterA = new class_A();//Create a class_B object by accessing the properties of class_A
        String classBChuck = theCharacterA.getName();
        theCharacterA.setName("Chuck");
        String classBChuckname = theCharacterA.getName();


        boolean characterAHungry = theCharacterA.isHungry();
        theCharacterA.setHungry(false);
        boolean classBfalsehungry = theCharacterA.isHungry();

        char classbSex = theCharacterA.getSex();
        theCharacterA.setSex('f');
        char classBFemaleSex = theCharacterA.getSex();

        System.out.println("My nickname is "+classBChuck);
        System.out.println("Her boyfriend's name is "+classBChuckname);
        System.out.println("It is "+characterAHungry +" she is hungry.");
        System.out.println("Stop fabricating lies about your friend, and bearing "+classBfalsehungry +" accusations about her.");
        System.out.println("Select "+classbSex +" for Female and "+classBFemaleSex +" for Male.");

    }




        class_A classB2 = new class_A();
        //classB2.method2(false);{
            //
        }

